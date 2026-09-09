package com.example.demo.sevice;

import java.util.List;

import org.springframework.ui.Model;

import com.example.demo.dto.Emp;

/*
    controller : 요청Url에 매핑된 화면을 사용자에게 전달
    service(비지니스 로직) : 사용자가 요청한 업무를 처리
                           여러개의 sql문장을 실행 -> 트랜젝션 처리
    mapper : DB에 CRUD작업

    인터페이스 : 추상메서드만 작성
*/ 
public interface EmpService {
    // 사원 목록 조회
    public List<Emp> search(Model model);

    // 한명의 사원정보 조회(상세조회)
    public Emp get(String empId);



}
