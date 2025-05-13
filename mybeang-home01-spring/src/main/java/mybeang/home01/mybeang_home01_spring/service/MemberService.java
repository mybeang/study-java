package mybeang.home01.mybeang_home01_spring.service;

import mybeang.home01.mybeang_home01_spring.domain.Member;
import mybeang.home01.mybeang_home01_spring.repository.MemberRepository;
import mybeang.home01.mybeang_home01_spring.repository.MemoryMemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public class MemberService {
    private final MemberRepository memberRepository;

    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    // 회원 가입
    public Long join(Member member) {
        validateDuplicateName(member);

        memberRepository.save(member);
        return member.getId();
    }

    private void validateDuplicateName(Member member) {
        memberRepository
                .findByName(member.getName())
                .ifPresent(m -> {
                    throw new IllegalStateException("Already Exist Name.");
                });
    }

    public List<Member> findMembers() {
        return memberRepository.findAll();
    }

    public Optional<Member> findOne(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
