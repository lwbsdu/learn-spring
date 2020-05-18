package com.sharding.service.impl;

import com.sharding.entity.Student;
import com.sharding.mapper.StudentMapper;
import com.sharding.service.iservice.IStudentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 学生信息表 服务实现类
 * </p>
 *
 * @author liuwenbin
 * @since 2020-05-09
 */
@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements IStudentService {

}
