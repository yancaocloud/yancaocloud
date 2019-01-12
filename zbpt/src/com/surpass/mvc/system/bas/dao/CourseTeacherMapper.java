package com.surpass.mvc.system.bas.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.surpass.mvc.system.bas.model.Course;
import com.surpass.mvc.system.bas.model.CourseRecommendBean;
import com.surpass.mvc.system.bas.model.CourseTeacher;

public interface CourseTeacherMapper {

	/**
	 * 查询 信息
	 */
	List<CourseRecommendBean> query(Map<String, Object> build) throws Exception;

	/**
	 * 查询 记录数
	 */
	Integer total(Course record) throws Exception;

	/**
	 * 删除
	 */
	int deleteByKey(@Param(value = "ids") String ids) throws Exception;

	Integer getCourseHotByCourseIdTotle(CourseTeacher record) throws Exception;

	int updateDate(CourseTeacher record) throws Exception;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table t_course_teacher
	 * 
	 * @mbggenerated Sat Jul 07 11:08:35 CST 2018
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table t_course_teacher
	 * 
	 * @mbggenerated Sat Jul 07 11:08:35 CST 2018
	 */
	int insert(CourseTeacher record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table t_course_teacher
	 * 
	 * @mbggenerated Sat Jul 07 11:08:35 CST 2018
	 */
	int insertSelective(CourseTeacher record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table t_course_teacher
	 * 
	 * @mbggenerated Sat Jul 07 11:08:35 CST 2018
	 */
	CourseTeacher selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table t_course_teacher
	 * 
	 * @mbggenerated Sat Jul 07 11:08:35 CST 2018
	 */
	int updateByPrimaryKeySelective(CourseTeacher record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table t_course_teacher
	 * 
	 * @mbggenerated Sat Jul 07 11:08:35 CST 2018
	 */
	int updateByPrimaryKey(CourseTeacher record);
}