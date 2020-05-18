package com.sharding.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.sharding.entity.Teacher;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDateTime;

/**
 * 一些声明信息
 * Description:
 *
 * @author liuwenbin
 * @date 2020-05-15 14:29
 * @since JDK 1.8
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
public class TeacherServiceImplTest {

    @Autowired
    private TeacherServiceImpl teacherService;


    @Test
    public void testInsert(){
        Teacher teacher = new Teacher();
        teacher.setAge(41L);
        teacher.setName("lisi");
        teacher.setTeacherId(12313L);
        teacher.setDaily(20200501);
        teacher.setCreateTime(LocalDateTime.now());
        teacherService.save(teacher);
    }

    @Test
    public void testSelect(){
        Teacher one = teacherService.getOne(
                new LambdaQueryWrapper<Teacher>()
                        .eq(Teacher::getStatus, 1)
                        .eq(Teacher::getDaily, 20200501)
        );
        System.out.println(one);
    }

}