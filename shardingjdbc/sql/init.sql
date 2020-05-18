CREATE TABLE `student`
(
  `id`          BIGINT(20) UNSIGNED NOT NULL auto_increment COMMENT '自增id',
  `student_id`  BIGINT(20)          NOT NULL DEFAULT 0 COMMENT '学生id',
  `daily`       INT(20)             NOT NULL DEFAULT 0 COMMENT '日期',
  `age`         BIGINT(20)          NOT NULL DEFAULT 0 COMMENT '年龄',
  `name`        varchar(256)        NOT NULL DEFAULT '' COMMENT '名称',
  `create_time` TIMESTAMP                    DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` TIMESTAMP                    DEFAULT CURRENT_TIMESTAMP ON update current_timestamp() COMMENT '修改时间',
  `status`      SMALLINT                     DEFAULT 1 COMMENT '状态 1:有效 2:无效(删除)',
  PRIMARY KEY (`id`),
  KEY idx_student (`student_id`),
  KEY idx_daily (`daily`)
) ENGINE = InnoDB
  AUTO_INCREMENT = 1 COMMENT ='学生信息表';



CREATE TABLE `student_0`
(
  `id`          BIGINT(20) UNSIGNED NOT NULL auto_increment COMMENT '自增id',
  `student_id`  BIGINT(20)          NOT NULL DEFAULT 0 COMMENT '学生id',
  `daily`       INT(20)             NOT NULL DEFAULT 0 COMMENT '日期',
  `age`         BIGINT(20)          NOT NULL DEFAULT 0 COMMENT '年龄',
  `name`        varchar(256)        NOT NULL DEFAULT '' COMMENT '名称',
  `create_time` TIMESTAMP                    DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` TIMESTAMP                    DEFAULT CURRENT_TIMESTAMP ON update current_timestamp() COMMENT '修改时间',
  `status`      SMALLINT                     DEFAULT 1 COMMENT '状态 1:有效 2:无效(删除)',
  PRIMARY KEY (`id`),
  KEY idx_student (`student_id`),
  KEY idx_daily (`daily`)
) ENGINE = InnoDB
  AUTO_INCREMENT = 1 COMMENT ='学生信息表';

CREATE TABLE `teacher`
(
  `id`          BIGINT(20) UNSIGNED NOT NULL auto_increment COMMENT '自增id',
  `teacher_id`  BIGINT(20)          NOT NULL DEFAULT 0 COMMENT '学生id',
  `daily`       INT(20)             NOT NULL DEFAULT 0 COMMENT '日期',
  `age`         BIGINT(20)          NOT NULL DEFAULT 0 COMMENT '年龄',
  `name`        varchar(256)        NOT NULL DEFAULT '' COMMENT '名称',
  `create_time` TIMESTAMP                    DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` TIMESTAMP                    DEFAULT CURRENT_TIMESTAMP ON update current_timestamp() COMMENT '修改时间',
  `status`      SMALLINT                     DEFAULT 1 COMMENT '状态 1:有效 2:无效(删除)',
  PRIMARY KEY (`id`),
  KEY idx_student (`teacher_id`),
  KEY idx_daily (`daily`)
) ENGINE = InnoDB
  AUTO_INCREMENT = 1 COMMENT ='老师信息表';

CREATE TABLE `student_1`
(
  `id`          BIGINT(20) UNSIGNED NOT NULL auto_increment COMMENT '自增id',
  `student_id`  BIGINT(20)          NOT NULL DEFAULT 0 COMMENT '学生id',
  `daily`       INT(20)             NOT NULL DEFAULT 0 COMMENT '日期',
  `age`         BIGINT(20)          NOT NULL DEFAULT 0 COMMENT '年龄',
  `name`        varchar(256)        NOT NULL DEFAULT '' COMMENT '名称',
  `create_time` TIMESTAMP                    DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` TIMESTAMP                    DEFAULT CURRENT_TIMESTAMP ON update current_timestamp() COMMENT '修改时间',
  `status`      SMALLINT                     DEFAULT 1 COMMENT '状态 1:有效 2:无效(删除)',
  PRIMARY KEY (`id`),
  KEY idx_student (`student_id`),
  KEY idx_daily (`daily`)
) ENGINE = InnoDB
  AUTO_INCREMENT = 1 COMMENT ='学生信息表';