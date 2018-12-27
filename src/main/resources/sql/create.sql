/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2018/12/23 16:00:22                          */
/*==============================================================*/


drop table if exists Admin;

drop table if exists class;

drop table if exists course;

drop table if exists reward_punish;

drop table if exists reward_punish_record;

drop table if exists specialty;

drop table if exists stu_cour_r;

drop table if exists student;

drop table if exists term;

drop table if exists tutor;

/*==============================================================*/
/* Table: Admin                                                 */
/*==============================================================*/
create table Admin
(
   admin_name           varchar(20) not null,
   admin_password       varchar(20) not null,
   primary key (admin_name)
);

alter table Admin comment '管理员';

/*==============================================================*/
/* Table: class                                                 */
/*==============================================================*/
create table class
(
   class_id             int not null auto_increment,
   class_name           varchar(20) not null,
   class_nums           int not null default 0,
   primary key (class_id),
   unique key AK_UQ_classname (class_name)
);

alter table class comment '班级表';

/*==============================================================*/
/* Table: course                                                */
/*==============================================================*/
create table course
(
   course_id            int not null auto_increment comment '课程编号',
   course_name          varchar(255) not null comment '课程名称',
   course_teacher       varchar(255) comment '任课老师',
   course_week          varchar(255) comment '起止周',
   course_start_time    time comment '上课时间',
   course_end_time      time comment '下课时间',
   course_address       varchar(255) comment '上课地点',
   primary key (course_id),
   unique key AK_UQ_coursename (course_name)
);

alter table course comment '课程表';

/*==============================================================*/
/* Table: reward_punish                                         */
/*==============================================================*/
create table reward_punish
(
   reward_punish_id     int not null auto_increment,
   reward_punish_name   varchar(255) not null,
   reward_punish_money  float default 0,
   reward_punish_flag   int not null,
   primary key (reward_punish_id),
   unique key AK_UQ_rpname (reward_punish_name)
);

alter table reward_punish comment '奖励惩罚表';

/*==============================================================*/
/* Table: reward_punish_record                                  */
/*==============================================================*/
create table reward_punish_record
(
   rp_record_id         int not null,
   student_id           int,
   reward_punish_id     int,
   term_id              int,
   rp_record_date       date not null,
   primary key (rp_record_id)
);

alter table reward_punish_record comment '学生奖惩记录';

/*==============================================================*/
/* Table: specialty                                             */
/*==============================================================*/
create table specialty
(
   specialty_id         int not null auto_increment,
   specialty_name       varchar(255) not null,
   specialty_desc       varchar(1024),
   primary key (specialty_id),
   unique key AK_UQ_specialtyname (specialty_name)
);

alter table specialty comment '专业表';

/*==============================================================*/
/* Table: stu_cour_r                                            */
/*==============================================================*/
create table stu_cour_r
(
   course_id            int not null comment '课程编号',
   student_id           int not null,
   primary key (course_id, student_id)
);

alter table stu_cour_r comment '学生课程关系多对多';

/*==============================================================*/
/* Table: student                                               */
/*==============================================================*/
create table student
(
   student_id           int not null,
   class_id             integer,
   tutor_id             int,
   specialty_id         int,
   name                 varchar(20) not null,
   password             varchar(20) not null,
   sex                  varchar(1),
   birthday             date,
   phonenumber          varchar(11),
   address              varchar(255),
   primary key (student_id)
);

alter table student comment '研究生表';

/*==============================================================*/
/* Table: term                                                  */
/*==============================================================*/
create table term
(
   term_id              int not null auto_increment,
   trem_name            varchar(20) not null,
   primary key (term_id),
   unique key AK_UQ_termname (trem_name)
);

alter table term comment '学期表';

/*==============================================================*/
/* Table: tutor                                                 */
/*==============================================================*/
create table tutor
(
   tutor_id             int not null auto_increment,
   tutor_name           varchar(20) not null,
   tutor_psw            varchar(20) not null,
   primary key (tutor_id)
);

alter table tutor comment '导师表';

alter table reward_punish_record add constraint FK_rp_record_r foreign key (reward_punish_id)
      references reward_punish (reward_punish_id) on delete restrict on update cascade;

alter table reward_punish_record add constraint FK_stu_rp_record foreign key (student_id)
      references student (student_id) on delete restrict on update cascade;

alter table reward_punish_record add constraint FK_term_record_r foreign key (term_id)
      references term (term_id) on delete restrict on update cascade;

alter table stu_cour_r add constraint FK_stu_cour_r foreign key (course_id)
      references course (course_id) on delete cascade on update cascade;

alter table stu_cour_r add constraint FK_stu_cour_r2 foreign key (student_id)
      references student (student_id) on delete cascade on update cascade;

alter table student add constraint FK_class_student_r foreign key (class_id)
      references class (class_id) on delete restrict on update cascade;

alter table student add constraint FK_specialty_student_r foreign key (specialty_id)
      references specialty (specialty_id) on delete restrict on update cascade;

alter table student add constraint FK_tutor_student_r foreign key (tutor_id)
      references tutor (tutor_id) on delete restrict on update cascade;

