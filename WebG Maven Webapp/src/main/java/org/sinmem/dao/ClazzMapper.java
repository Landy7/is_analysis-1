package org.sinmem.dao;

import org.sinmem.bean.Clazz;

public interface ClazzMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table clazz
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String clazzno);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table clazz
     *
     * @mbggenerated
     */
    int insert(Clazz record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table clazz
     *
     * @mbggenerated
     */
    int insertSelective(Clazz record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table clazz
     *
     * @mbggenerated
     */
    Clazz selectByPrimaryKey(String clazzno);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table clazz
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Clazz record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table clazz
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Clazz record);
}