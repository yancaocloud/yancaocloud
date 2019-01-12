package com.surpass.mvc.system.sys.dao;

import java.util.List;
import java.util.Map;

import com.surpass.mvc.system.sys.model.RackBackSet;

public interface RackBackSetMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sys_rackbackset
     *
     * @mbggenerated Wed Oct 31 14:52:51 CST 2018
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sys_rackbackset
     *
     * @mbggenerated Wed Oct 31 14:52:51 CST 2018
     */
    int insert(RackBackSet record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sys_rackbackset
     *
     * @mbggenerated Wed Oct 31 14:52:51 CST 2018
     */
    int insertSelective(RackBackSet record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sys_rackbackset
     *
     * @mbggenerated Wed Oct 31 14:52:51 CST 2018
     */
    RackBackSet selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sys_rackbackset
     *
     * @mbggenerated Wed Oct 31 14:52:51 CST 2018
     */
    int updateByPrimaryKeySelective(RackBackSet record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sys_rackbackset
     *
     * @mbggenerated Wed Oct 31 14:52:51 CST 2018
     */
    int updateByPrimaryKey(RackBackSet record);
    
    RackBackSet getRackBackSetInfo(String rackBackSetId);
    
    List<RackBackSet> query(Map<String, Object> build);
    
    Integer total(RackBackSet rbs);
}