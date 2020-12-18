/*
 * Copyright (c) 2020. University of Applied Sciences and Arts Northwestern Switzerland FHNW.
 * All rights reserved.
 */

package ch.fhnw.internet.portal.service;

import ch.fhnw.internet.portal.data.domain.Member;
import ch.fhnw.internet.portal.data.domain.Role;
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
    private MemberRepository memberRepository;
    @Autowired
    Validator validator;
    @Autowired
    private PasswordEncoder passwordEncoder;

    public void saveAgent(@Valid Member member) throws Exception {
        if (member.getId() == null) {
            if (memberRepository.findByEmail(member.getEmail()) != null) {
                throw new Exception("Email address " + member.getEmail() + " already assigned another member.");
            }
        }
        member.setPassword(passwordEncoder.encode(member.getPassword()));
        memberRepository.save(member);
    }

    public Member getCurrentAgent() {
        String userEmail = (String) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        return memberRepository.findByEmail(userEmail);
    }
    public void deleteMember(@Valid Member member) throws Exception {
        if (member.getId() == null) {
            if (memberRepository.findByEmail(member.getEmail()) != null) {
                throw new Exception("Email address " + member.getEmail() + " already assigned another member.");
            }
        }
        memberRepository.delete(member);
    }
    public void updateMember(Member member, String emailN, String phoneN, Role roleN, String passwordN){
        // no clue how this should work?


    }
}
