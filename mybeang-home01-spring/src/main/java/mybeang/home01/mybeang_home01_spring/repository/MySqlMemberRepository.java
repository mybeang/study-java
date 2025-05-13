package mybeang.home01.mybeang_home01_spring.repository;

import mybeang.home01.mybeang_home01_spring.domain.Member;

import javax.sql.DataSource;
import java.sql.Connection;
import java.util.List;
import java.util.Optional;

public class MySqlMemberRepository implements MemberRepository{

    private final DataSource dataSource;

    public MySqlMemberRepository(DataSource dataSource) {
        this.dataSource = dataSource;
    }


    @Override
    public Member save(Member member) {

        return null;
    }

    @Override
    public Optional<Member> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public Optional<Member> findByName(String name) {
        return Optional.empty();
    }

    @Override
    public List<Member> findAll() {
        return List.of();
    }
}
