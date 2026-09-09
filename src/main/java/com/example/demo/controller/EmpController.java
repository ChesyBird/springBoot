package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;



@Controller 
public class EmpController {
    /* 
     url 호출이 되면 html화면을 서비스
        파라메터 수집
            - 문자열, 숫자 등 하나의 값을 수집
            - 객체(dto)로 수집
            - 요청경로로부터 수집
        페이지 반환
            - 반환값 있음 : 반환되는 문자열의 경로에 있는 파일 반환
            - 반환값 없음 : 요청 경로에 대항하는 페이지
    */
    // @RequestParan : 기본값이 필수
    @GetMapping("/emps")
    public String getIndex(@RequestParam(value = "param" , defaultValue = "123") String param ) {
        return "/hr/index";
    }

    /*
    경로에 파라메터를 전달하는 경우
    게시물번호, 사번 등
    */
    @GetMapping("/emps/{id}")
    public String getEmps(@PathVariable(value = "id") String id) {
        // 출력 : 메서드가 불려졌는지 확인
        System.out.println("변수값 : " + id);
        return "/hr/emp-detail";
    }
    
    @GetMapping("/emps/new")
    public String getEmpsN() {
        return "/hr/emp-form";
    }

    @GetMapping("/depts")
    public String getDept() {
        return "/hr/depts";
    }
    
    @GetMapping("/")
    public String getDashboard() {
        return "/hr/dashboard";
    }

    @GetMapping("/login")
    public String getLogin(@RequestParam String param) {
        return "/hr/login";
    }   
    
    
}
