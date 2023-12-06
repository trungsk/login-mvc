//package com.demo.unittesting.service;
//
//import com.demo.unittesting.model.Fighter;
//import com.demo.unittesting.repository.FighterRepository;
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Disabled;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.mockito.ArgumentCaptor;
//import org.mockito.Mock;
//import org.mockito.Mockito;
//import org.mockito.MockitoAnnotations;
//import org.mockito.junit.jupiter.MockitoExtension;
//
//import java.util.List;
//
///**
// * @author itsol.trung.nt
// * all
// * Friday. 10 Mar 2023
// */
//@ExtendWith(MockitoExtension.class)
//class FighterServiceTest {
//    @Mock
//    private FighterRepository fighterRepository;
////    private AutoCloseable closeable;
//    private FighterService fighterService;
//
////    @BeforeEach
////    void setUp() {
//////        closeable = MockitoAnnotations.openMocks(this);
////        fighterService = new FighterService(fighterRepository);
//////    }
//
////    @AfterEach
////    void tearDown() throws Exception {
////        closeable.close();
////    }
//
//    @Test
//    void getAllFighter() {
//        //when
//        List<Fighter> sd = fighterService.getAllFighter();
//        //then
//        Mockito.verify(fighterRepository).findAll();
//    }
//
//    @Test
////    @Disabled // this won't run if disabled
//    void addFighter() {
//        // given
//        int age;
//        age = 90;
//        Fighter fighter = new Fighter(age, "light", "Thành Trung");
//        // when
//        fighterService.addFighter(fighter);
//        // then
//        ArgumentCaptor<Fighter> fighterArgumentCaptor = ArgumentCaptor.forClass(Fighter.class);
//        Mockito.verify(fighterRepository).save(fighterArgumentCaptor.capture());
//        Fighter fighterArgumentCaptorValue = fighterArgumentCaptor.getValue();
//    }
//
//    @Test
//    @Disabled
//    void deleteFighter() {
//    }
//}