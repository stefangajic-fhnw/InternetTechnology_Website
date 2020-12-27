package ch.fhnw.internet.portal.service;

import ch.fhnw.internet.portal.data.domain.Member;
import ch.fhnw.internet.portal.data.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.Validator;

@Service
@Validated
public class MemberService {

    @Autowired
    Validator validator;
    @Autowired
    private MemberRepository memberRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;

    public Member saveMember(@Valid Member member) throws Exception {
        if (member.getId() == null) {
            if (memberRepository.findMemberByEmail(member.getEmail()) != null) {
                throw new Exception("Email address " + member.getEmail() + " already assigned another Member.");
            }
        } else if (memberRepository.findByEmailAndIdNot(member.getEmail(), member.getId()) != null) {
            throw new Exception("Email address " + member.getEmail() + " already assigned another Member.");
        }
        member.setPassword(passwordEncoder.encode(member.getPassword()));
        return memberRepository.save(member);
    }

    public Member getCurrentMember() {
        String memberEmail = (String) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        return memberRepository.findMemberByEmail(memberEmail);
    }

    public void deleteMember(@Valid Member member) throws Exception {
        if (member.getId() == null) {
            if (memberRepository.findMemberByEmail(member.getEmail()) != null) {
                throw new Exception("Email address " + member.getEmail() + " already assigned another member.");
            }
        }
        memberRepository.delete(member);
    }

    public void updateMember(Member member) {
        // no clue how this should work? (Message from Stefan)
        Member existingMember = memberRepository.findById(member.getId());
        existingMember.setEmail(member.getEmail());
        existingMember.setPhone(member.getPhone());
        existingMember.setRole(member.getRole());
        existingMember.setPassword(member.getPassword()); //I don't know this is allowed or not
    }

}