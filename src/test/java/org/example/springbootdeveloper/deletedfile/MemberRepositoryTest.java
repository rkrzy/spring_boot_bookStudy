package org.example.springbootdeveloper.deletedfile;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.jdbc.Sql;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


@DataJpaTest
class MemberRepositoryTest {

    @Autowired
    MemberRepository memberRepository;

    @AfterEach
    void cleanUp(){
        memberRepository.deleteAll();
    }
    @Sql("/deletedfiel/insert-members.sql")
    @Test
    void getAllMembers(){
        List<Member> members = memberRepository.findAll();

        assertThat(members.size()).isEqualTo(3);
    }
    @Sql("/deletedfiel/insert-members.sql")
    @Test
    void getMemberByName(){

        Member member = memberRepository.findByName("C").get();

        assertThat(member.getId()).isEqualTo(3);
    }

    @Test
    void saveMember(){
        Member member = new Member("A");

        memberRepository.save(member);

        assertThat(memberRepository.findById(1L).get().getName()).isEqualTo("A");
    }
    @Test
    void saveMembers(){
        List<Member> members = List.of(new Member("B"), new Member( "C"));

        memberRepository.saveAll(members);

        assertThat(memberRepository.findAll().size()).isEqualTo(2);
    }
    @Sql("/deletedfiel/insert-members.sql")
    @Test
    void deleteMemberById(){

        memberRepository.deleteById(2L);

        assertThat(memberRepository.findById(2L).isEmpty()).isTrue();
    }
    @Sql("/deletedfiel/insert-members.sql")
    @Test
    void deleteAll() {

        memberRepository.deleteAll();

        assertThat(memberRepository.findAll().size()).isZero();
    }
    @Sql("/deletedfiel/insert-members.sql")
    @Test
    void update(){

        Member member = memberRepository.findById(2L).get();

        member.changeName("BC");

        assertThat(memberRepository.findById(2L).get().getName()).isEqualTo("BC");
    }

}