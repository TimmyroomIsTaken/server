package com.timmyroom;

import com.timmyroom.repository.MemberRepository;
import com.timmyroom.repository.MemoryMemberRepository;
import com.timmyroom.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }
}
