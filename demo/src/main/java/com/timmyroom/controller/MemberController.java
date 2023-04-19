package com.timmyroom.controller;

import com.timmyroom.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller // 스프링 컨테이너가 관리하게됨
public class MemberController {
    private final MemberService memberService;

    @Autowired // 스프링이 Controller가 생성될때 서비스를 연결해줌 (=DI=의존성 주입)
    public MemberController(MemberService memberService) { // 스프링은 MemberService를 알 길이 없다
        this.memberService = memberService;
    }
}
