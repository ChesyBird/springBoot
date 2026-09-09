package com.example.demo.sevice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.example.demo.dto.Emp;
import com.example.demo.mapper.EmpMapper;

@Service 
public class EmpServiceImpl implements EmpService{

    @Autowired
    private EmpMapper mapper;

    @Override
    public List<Emp> search(Model model) {
        int totalCnt = mapper.totalCnt();
        List<Emp> list = mapper.selectByCond();
        System.out.println("totalCnt : " + totalCnt);

        model.addAttribute("list", list);
        model.addAttribute("totalCnt : ", totalCnt);
        // 목록을 조회 후 반환
        return mapper.selectByCond();
    }

    @Override
    public Emp get(String empId) {
        
        return mapper.selectById(empId);
    }

}
