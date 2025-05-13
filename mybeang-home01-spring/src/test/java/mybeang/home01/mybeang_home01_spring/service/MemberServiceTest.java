package mybeang.home01.mybeang_home01_spring.service;

import mybeang.home01.mybeang_home01_spring.domain.Member;
import mybeang.home01.mybeang_home01_spring.repository.MemberRepository;
import mybeang.home01.mybeang_home01_spring.repository.MemoryMemberRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
class MemberServiceTest {
    MemberService memberService;
    MemoryMemberRepository memberRepository;

    @BeforeEach
    public void beforeEach() {
        memberRepository = new MemoryMemberRepository();
        memberService = new MemberService(memberRepository);
    }

    @AfterEach
    void afterEach() {
        memberRepository.clearStore();
    }

    @Test
    void join() {
        Member member = new Member();
        member.setName("spring");

        Long saveId = memberService.join(member);

        Member findMember = memberService.findOne(saveId).get();
        Assertions.assertThat(member.getName()).isEqualTo(findMember.getName());
    }

    @Test
    void duplicateMemberExcept() {
        Member member1 = new Member();
        member1.setName("spring");
        Member member2 = new Member();
        member2.setName("spring");

        memberService.join(member1);
        IllegalStateException e = assertThrows(IllegalStateException.class, () -> memberService.join(member2));
        Assertions.assertThat(e.getMessage()).isEqualTo("Already Exist Name.");

//        try {
//            memberService.join(member2);
//            fail();
//        }
//        catch (IllegalStateException e) {
//            Assertions.assertThat(e.getMessage()).isEqualTo("Already Exist Name.");
//        }


    }

    @Test
    void findMembers() {
    }

    @Test
    void findOne() {
    }
}