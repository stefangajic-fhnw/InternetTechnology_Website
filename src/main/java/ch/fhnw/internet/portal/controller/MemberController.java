package ch.fhnw.internet.portal.controller;

import ch.fhnw.internet.portal.data.domain.Member;
import ch.fhnw.internet.portal.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

public class MemberController {
    @Autowired
    private MemberService memberService;

    @GetMapping("/login")
    public String getLoginView() {
        return "login.html";
    }

    @GetMapping("/signup")
    public String getRegisterView() {
        return "signup.html";
    }

    @PostMapping("/signup")
    public ResponseEntity<Void> postRegister(@RequestBody Member member) {
        try {
            memberService.saveMember(member);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.NOT_ACCEPTABLE, e.getMessage());
        }
        return ResponseEntity.ok().build();
    }

    @GetMapping("/userprofile")
    public String getProfileView() {
        return "userprofile.html";
    }

    @GetMapping("/userprofile")
    public @ResponseBody
    Member getProfile() {
        return memberService.getCurrentMember();
    }

    @PutMapping("/userprofile")
    public ResponseEntity<Void> putProfile(@RequestBody Member member) {
        try {
            member.setId(memberService.getCurrentMember().getId());
            memberService.saveMember(member);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.NOT_ACCEPTABLE, e.getMessage());
        }
        return ResponseEntity.ok().build();
    }

    @RequestMapping(value = "/validate", method = {RequestMethod.GET, RequestMethod.HEAD})
    public ResponseEntity<Void> init() {
        return ResponseEntity.ok().build();
    }
}
