package com.surpass.mvc.system.bas.dao;

import com.surpass.mvc.system.bas.model.MemberCollectionCourse;

public interface MemberCollectionCourseMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member_collection_course
     *
     * @mbggenerated Tue Oct 09 15:33:57 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member_collection_course
     *
     * @mbggenerated Tue Oct 09 15:33:57 CST 2018
     */
    int insert(MemberCollectionCourse record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member_collection_course
     *
     * @mbggenerated Tue Oct 09 15:33:57 CST 2018
     */
    int insertSelective(MemberCollectionCourse record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member_collection_course
     *
     * @mbggenerated Tue Oct 09 15:33:57 CST 2018
     */
    MemberCollectionCourse selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member_collection_course
     *
     * @mbggenerated Tue Oct 09 15:33:57 CST 2018
     */
    int updateByPrimaryKeySelective(MemberCollectionCourse record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member_collection_course
     *
     * @mbggenerated Tue Oct 09 15:33:57 CST 2018
     */
    int updateByPrimaryKey(MemberCollectionCourse record);
}