package com.surpass.mvc.system.sys.dao;

import java.util.List;
import java.util.Map;

import com.surpass.mvc.system.sys.model.AdminIncome;

public interface AdminIncomeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_adminincome
     *
     * @mbggenerated Wed Oct 31 15:22:31 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_adminincome
     *
     * @mbggenerated Wed Oct 31 15:22:31 CST 2018
     */
    int insert(AdminIncome record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_adminincome
     *
     * @mbggenerated Wed Oct 31 15:22:31 CST 2018
     */
    int insertSelective(AdminIncome record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_adminincome
     *
     * @mbggenerated Wed Oct 31 15:22:31 CST 2018
     */
    AdminIncome selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_adminincome
     *
     * @mbggenerated Wed Oct 31 15:22:31 CST 2018
     */
    int updateByPrimaryKeySelective(AdminIncome record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_adminincome
     *
     * @mbggenerated Wed Oct 31 15:22:31 CST 2018
     */
    int updateByPrimaryKey(AdminIncome record);
    
    List<AdminIncome> query(Map<String, Object> build);
    
    Integer total(AdminIncome ai);
}