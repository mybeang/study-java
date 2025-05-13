package mybeang.home01.mybeang_home01_spring.repository;

import jakarta.persistence.Entity;
import jakarta.persistence.EntityManager;
import mybeang.home01.mybeang_home01_spring.domain.Member;

import javax.sql.DataSource;
import java.util.List;
import java.util.Optional;

public class MySqlMemberRepository implements MemberRepository{

    private final EntityManager em;
    public MySqlMemberRepository(EntityManager em) {
        this.em = em;
    }

    @Override
    public Member save(Member member) {
        em.persist(member);
        return member;
    }

    @Override
    public Optional<Member> findById(Long id) {
        return Optional.ofNullable(em.find(Member.class, id));
    }

    @Override
    public Optional<Member> findByName(String name) {
        List<Member> result = em.createQuery("select m from Member m where m.name = :name", Member.class)
                .setParameter("name", name)
                .getResultList();
        return result.stream().findAny();
    }

    @Override
    public List<Member> findAll() {
        return em.createQuery("select m from Member m", Member.class).getResultList();
    }
}
