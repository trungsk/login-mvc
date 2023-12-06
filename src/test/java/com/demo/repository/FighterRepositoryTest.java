//package com.demo.repository;
//
//
//import com.demo.unittesting.repository.FighterRepository;
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
//import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
//
//import static org.assertj.core.api.Assertions.assertThat;
//
///**
// * @author itsol.trung.nt
// * all
// * Friday. 10 Mar 2023
// */
//
//@DataJpaTest
//@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
//class FighterRepositoryTest {
//    @Autowired
//    FighterRepository fighterRepository;
//
//    @AfterEach
//    void tearDown() {
//        // do sth after testing
//    }
//
//    @Test
//    void getFighterByIdTest() {
//        //given
//        //when
//        //then
//        boolean expected = fighterRepository.isExistAge(18);
//        assertThat(expected).isTrue();
//    }
//}