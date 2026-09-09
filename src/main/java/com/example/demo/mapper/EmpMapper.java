package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.example.demo.dto.Emp;

/*
    1. 라이브러리 의존성 추가
    2. 설정파일 - 데이터 베이스 접속정보 및 Mybatis 설정 정보 추가
    3. 인터페이스 생성
    4. 테스트
*/
@Mapper 
public interface EmpMapper {
    // 메서드 정의
    // emp테이블의 총 건수를 조회
    // 한 줄짜리 간단한 쿼리는 인터페이스에서 작성
    @Select("select count(*) from emp")
    public int totalCnt();

    // 사원 목록 조회
    // 조회 조건을 화면으로부터 전달받아 처리
    public List<Emp> selectByCond();

    /*
        #{} : 파라메터 바인딩 - 문자인 경우 '' 붙여주는 용도
        ${} : 테이블이름, 컬럼이름에 사용
    */
    @Select ("select * from emp where emp_id=#{emp_id}")
    public Emp selectById(String empId);

    

}
