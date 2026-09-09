package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.dto.LoginDto;




// 패키지의 위치
// 기본 패키지의 하위에 있는 어노테이션을 읽어서 bean으로 등록
// 사용자의 요청을 받아 페이지를 반환해주는 역할
@Controller
public class HelloController {

    // get방식으로 요청이 발생했을 때
    // 요청 경로에 해당하는 메서드가 실행됨
    // 매개변수 : 요청 파라메터를 수집(문자열, 숫자, 객체형태로 자동수집)
    // GetMapping : 사용자의 요청 url과 일치하는 메서드를 실행
    // 반환값
    // 문자열의 경우 : 템플릿 폴더 하위에 있는 .html 파일을 반환(서비스)
    //               파일이 없는 경우 404 오류가 생김
    // 반환값 없음   : 요청경로와 같은 경로의 파일을 찾아서 반환
    @GetMapping("/." /* 요청 경로 */)
    public String getMethodName() {
        System.out.println("getMethodName");
        return "hello";
    }

    // /list 요청이 발생하면 /hr/list.html
    // 반환값 있음
    @GetMapping("/list")
    public String getList() {
        // 경로와 파일명을 문자열로 반환
        return "/hr/list";
    }
    

    // /view 요청이 발생하면 /hr/view.html
    // 반환값 없음 : 요청주소와 응답주소가 같을떄

    // GetMappin(여기 들어가는 url이 중복이면) 오류가 납니다
    // 스프링의 경우 객체를 미리 만들어놓고 실행
    // 오류가 있는 경우 >>프로젝트 자체가 실행하지 않음<<

    // 요청정보로부터 넘어온 파라메터
    // 기본값이 필수 -> 만약 해당 이름의 파라메터 전달이 안되면 오류
    // value : 사용자가 전달 한 이름
    /*@GetMapping("/hr/view")
    public void getMethodName(@RequestParam(value="param") String param) {
        System.out.println("param : " + param);
        // return "/hr/view";
    }*/

    // id=abc&pw=123을 전달받아서 콘솔창에 출력해봅시다
    @GetMapping("/hr/view")
    public void getIdPw(@RequestParam(value="id") String id
                        ,@RequestParam(value="pw") String pw) {
        System.out.println("id : " + id + "pw : " + pw);
        // return "/hr/view";
    }

    // DTO객체를 파라메터로 전달받는 방법
    @GetMapping("/loginAction")
    @ResponseBody // 요청 파라메터를 객체에 담아 전달(필수는 아님!)
    public String getDto(LoginDto loginDto) {
        System.out.println("loginDto : " + loginDto.getId());
        System.out.println("loginDto : " + loginDto.getPw());
        return "main";
    }
    
    

}
