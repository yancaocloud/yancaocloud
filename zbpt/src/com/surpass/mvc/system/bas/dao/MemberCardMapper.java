package com.surpass.mvc.system.bas.dao;

import com.surpass.mvc.system.bas.model.MemberCard;

public interface MemberCardMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sys_member_card
     *
     * @mbggenerated Sun Oct 21 09:28:44 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sys_member_card
     *
     * @mbggenerated Sun Oct 21 09:28:44 CST 2018
     */
    int insert(MemberCard record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sys_member_card
     *
     * @mbggenerated Sun Oct 21 09:28:44 CST 2018
     */
    int insertSelective(MemberCard record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sys_member_card
     *
     * @mbggenerated Sun Oct 21 09:28:44 CST 2018
     */
    MemberCard selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sys_member_card
     *
     * @mbggenerated Sun Oct 21 09:28:44 CST 2018
     */
    int updateByPrimaryKeySelective(MemberCard record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sys_member_card
     *
     * @mbggenerated Sun Oct 21 09:28:44 CST 2018
     */
    int updateByPrimaryKey(MemberCard record);
}