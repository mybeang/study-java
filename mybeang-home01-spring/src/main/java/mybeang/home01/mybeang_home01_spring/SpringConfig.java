package mybeang.home01.mybeang_home01_spring;

import jakarta.persistence.EntityManager;
import mybeang.home01.mybeang_home01_spring.repository.MemberRepository;
import mybeang.home01.mybeang_home01_spring.repository.MemoryMemberRepository;
import mybeang.home01.mybeang_home01_spring.repository.MySqlMemberRepository;
import mybeang.home01.mybeang_home01_spring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {
//    private EntityManager em;
//    @Autowired
//    public SpringConfig(EntityManager em) {
//        this.em = em;
//    }
    private final MemberRepository memberRepository;
    @Autowired
    public SpringConfig(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }


    @Bean
    public MemberService memberService() {
//        return new MemberService(memberRepository());
        return new MemberService(memberRepository);
    }

//    @Bean
//    public MemberRepository memberRepository() {
////        return new MemoryMemberRepository();
//        return new MySqlMemberRepository(em);
//    }
}
