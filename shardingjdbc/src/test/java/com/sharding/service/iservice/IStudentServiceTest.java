package com.sharding.service.iservice;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.sharding.entity.Student;
import com.sharding.service.impl.StudentServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDateTime;
import java.util.List;

/**
 * 一些声明信息
 * Description:
 *
 * @author liuwenbin
 * @date 2020-05-11 14:58
 * @since JDK 1.8
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
public class IStudentServiceTest {

    @Autowired
    private StudentServiceImpl studentService;

    @Test
    public void test(){
        Student student = new Student();
        student.setAge(10L);
        student.setDaily(20210101);
        student.setCreateTime(LocalDateTime.now());
        student.setName("zhangsan");
        student.setStudentId(123L);
        boolean save = studentService.save(student);
        System.out.println(save);
    }

    @Test
    public void select(){
        List<Student> one = studentService.list(
                new LambdaQueryWrapper<Student>()
                        .eq(Student::getStatus, 1)
                        .eq(Student::getDaily,20210101)
        );
        System.out.println(one);
    }

}