package com.sharding.service.impl;

import com.sharding.entity.Teacher;
import com.sharding.mapper.TeacherMapper;
import com.sharding.service.iservice.ITeacherService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 老师信息表 服务实现类
 * </p>
 *
 * @author liuwenbin
 * @since 2020-05-15
 */
@Service
public class TeacherServiceImpl extends ServiceImpl<TeacherMapper, Teacher> implements ITeacherService {

}
