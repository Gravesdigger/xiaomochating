package com.xiaomo.service;

import com.xiaomo.entity.User;

/**
 * 用户service接口
 * @author Jason
 *
 */
public interface UserService {

	/**
	 * 根据名字密码查找用户
	 * @param name
	 * @param password
	 * @return
	 */
	public User searchByNameAndPassword(String name, String password);
	
	/**
	 * 根据名字查找用户
	 * @param name
	 * @return
	 */
	public User searchByName(String name);
	
	/**
	 * 保存用户
	 * @param user
	 */
	public void saveUser(User user);
	
}
