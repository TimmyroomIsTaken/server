package com.timmyroom.controller;

import com.timmyroom.domain.Member;
import com.timmyroom.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller // 스프링 컨테이너가 관리하게됨
public class MemberController {
    private final MemberService memberService;

    @Autowired // 스프링이 Controller가 생성될때 서비스를 연결해줌 (=DI=의존성 주입)
    public MemberController(MemberService memberService) { // 스프링은 MemberService를 알 길이 없다
        this.memberService = memberService;
    }

    @GetMapping("/members/new")
    public String createForm() {
        return "members/createMemberForm";
    }

    @PostMapping("/memvers/new")
    public String create(MemberForm form) {
        Member member = new Member();
        member.setName(form.getName());

        memberService.join(member);

        return "redirect:/";
    }

    @GetMapping("members")
    public String list(Model model) {
        List<Member> members = memberService.findMembers();
        model.addAttribute("members", members);
        return "members/memberList";
    }
}
