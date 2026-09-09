package com.example.demo.sevice;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.ui.Model;

import com.example.demo.dto.Emp;

@SpringBootTest 
public class EmpServiceTest {
    
    @Autowired 
    EmpService service;

    // @Test 
    // public void search(){
        // given(준비) : 필요한 정보 세팅

        // when (실행) : 테스트
    //     List<Emp> list = service.search();
    //     System.out.println(list.size());
    //     System.out.println(list);

        // then (검증)
    //     assertEquals(19, list.size());
    // }

    @Test 
    public void Test(){

        Emp emp = service.get("201");
        System.out.println(emp);

    }

}
