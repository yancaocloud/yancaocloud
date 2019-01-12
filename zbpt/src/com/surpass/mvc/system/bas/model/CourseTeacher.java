package com.surpass.mvc.system.bas.model;

import java.util.Date;

public class CourseTeacher {
    /**课程Id*/
    private Integer id;

    /**课程id*/
    private Integer course_id;

    /**创建者*/
    private String author_act_user_id;

    private String author_act_user_name;

    /**创建时间*/
    private Date cjsj;

    public String getAuthor_act_user_name() {
		return author_act_user_name;
	}

	public void setAuthor_act_user_name(String author_act_user_name) {
		this.author_act_user_name = author_act_user_name;
	}

	/**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_course_teacher.id
     *
     * @return the value of t_course_teacher.id
     *
     * @mbggenerated Sat Jul 07 11:08:35 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_course_teacher.id
     *
     * @param id the value for t_course_teacher.id
     *
     * @mbggenerated Sat Jul 07 11:08:35 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_course_teacher.course_id
     *
     * @return the value of t_course_teacher.course_id
     *
     * @mbggenerated Sat Jul 07 11:08:35 CST 2018
     */
    public Integer getCourse_id() {
        return course_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_course_teacher.course_id
     *
     * @param course_id the value for t_course_teacher.course_id
     *
     * @mbggenerated Sat Jul 07 11:08:35 CST 2018
     */
    public void setCourse_id(Integer course_id) {
        this.course_id = course_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_course_teacher.author_act_user_id
     *
     * @return the value of t_course_teacher.author_act_user_id
     *
     * @mbggenerated Sat Jul 07 11:08:35 CST 2018
     */
    public String getAuthor_act_user_id() {
        return author_act_user_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_course_teacher.author_act_user_id
     *
     * @param author_act_user_id the value for t_course_teacher.author_act_user_id
     *
     * @mbggenerated Sat Jul 07 11:08:35 CST 2018
     */
    public void setAuthor_act_user_id(String author_act_user_id) {
        this.author_act_user_id = author_act_user_id == null ? null : author_act_user_id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_course_teacher.cjsj
     *
     * @return the value of t_course_teacher.cjsj
     *
     * @mbggenerated Sat Jul 07 11:08:35 CST 2018
     */
    public Date getCjsj() {
        return cjsj;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_course_teacher.cjsj
     *
     * @param cjsj the value for t_course_teacher.cjsj
     *
     * @mbggenerated Sat Jul 07 11:08:35 CST 2018
     */
    public void setCjsj(Date cjsj) {
        this.cjsj = cjsj;
    }
}