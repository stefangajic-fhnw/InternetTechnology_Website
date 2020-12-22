/*
 * Copyright (c) 2020. University of Applied Sciences and Arts Northwestern Switzerland FHNW.
 * All rights reserved.
 */

package ch.fhnw.internet.portal.controller;

import ch.fhnw.internet.portal.data.domain.Member;
import ch.fhnw.internet.portal.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@Controller
public class UserController {

    @Autowired
    private MemberService memberService;

    @GetMapping("/login")
    public String getLoginView() {
        return "login.html";
    }

    @GetMapping("/user/register")
    public String getRegisterView() {
        return "register.html";
    }

    @PostMapping("/user/register")
    public ResponseEntity<Void> postRegister(@RequestBody Member member) {
        try {
            memberService.saveAgent(member);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.NOT_ACCEPTABLE, e.getMessage());
        }
        return ResponseEntity.ok().build();
    }

    @GetMapping("/profile/edit")
    public String getProfileView() {
        return "edit.html";
    }

    @GetMapping("/profile")
    public @ResponseBody
    Member getProfile() {
        return memberService.getCurrentAgent();
    }

    @PutMapping("/profile")
    public ResponseEntity<Void> putProfile(@RequestBody Member member) {
        try {
            member.setID(memberService.getCurrentAgent().getID());
            memberService.saveAgent(member);
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