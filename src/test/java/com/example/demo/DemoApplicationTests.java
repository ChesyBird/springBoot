package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.dto.Emp;
import com.example.demo.mapper.EmpMapper;

@SpringBootTest
// 1. 위치
// 2. @SpringBootTest 클래스 선언부 상단에 추가
//    스프링컨테이너를 만들고 컨테이너에 빈을 생성해서 사용할 준비를 함
// 3. 메서드 선언부 상단에 @Test 어노테이션 추가
// 4. 검증을 위해  assert 메서드 사용
class DemoApplicationTests {

	// DI
	@Autowired 
	EmpMapper empMapper;

	@Test
	void test1() {
		int res = empMapper.totalCnt();
		System.out.println("총 건수 : " + res);

		// 실제 실행 결과와 예상결과를 비교하여 테스트 검증
		assertEquals(21, res);
	}

	@Test 
	void test2(){
		List<Emp> list = empMapper.selectByCond();
		System.out.println(list);
	}

	@Test 
	void test3(){
		Emp emp = empMapper.selectById("201");
		System.out.println(emp);
	}

}
