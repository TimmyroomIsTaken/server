package com.timmyroom.service;

import com.timmyroom.domain.Member;
import com.timmyroom.repository.MemberRepository;
import com.timmyroom.repository.MemoryMemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

//@Service // 스프링이 서비스네~ 하고 스프링 서비스에 등록한다
public class MemberService {

    private final MemberRepository memberRepository;

//    @Autowired
    public  MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    /*
    * 회원 가입
    * */
    public Long join(Member member) {
        // 같은 이름이 있는 중복 회원 X
        // null일 가능성이 있으면 Optional<>사용
        // Optional<>사용하면 코드 가독성 낮아짐 -> 반환 안하고 바로 ifPresent 사용하여 예외처리
        validateDuplicateMember(member);


        memberRepository.save(member);
        return member.getId();
    }

    private void validateDuplicateMember(Member member) {
        memberRepository.findByName(member.getName())
                .ifPresent(m -> {
                    throw new IllegalStateException("이미 존재하는 회원입니다.");
                });
    }

    /*
     * 전체 회원 조회
     */
    public List<Member> findMembers() {
        return memberRepository.findAll();
    }

    public Optional<Member> findOne(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
