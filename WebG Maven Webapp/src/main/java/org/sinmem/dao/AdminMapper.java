package org.sinmem.dao;

import org.sinmem.bean.Admin;

public interface AdminMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table admin
	 * @mbggenerated
	 */
	int deleteByPrimaryKey(String userid);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table admin
	 * @mbggenerated
	 */
	int insert(Admin record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table admin
	 * @mbggenerated
	 */
	int insertSelective(Admin record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table admin
	 * @mbggenerated
	 */
	Admin selectByPrimaryKey(String userid);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table admin
	 * @mbggenerated
	 */
	int updateByPrimaryKeySelective(Admin record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table admin
	 * @mbggenerated
	 */
	int updateByPrimaryKey(Admin record);
}