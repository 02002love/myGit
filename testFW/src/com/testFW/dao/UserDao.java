package com.testFW.dao;

import com.testFW.bo.InvitationCodeBO;
import com.testFW.bo.UserBO;
import com.testFW.bo.UserInfoBO;

/**
 * 用户数据处理接口
 * 
 * @author Kalor
 * @time 2012-12-17
 */
public interface UserDao {
	/**
	 * 依据邀请码code查询邀请码
	 * 
	 * @param code
	 * @return 查询结果
	 */
	InvitationCodeBO queryInvitationCode(String code);

	/**
	 * 更新邀请码的状态为不可用
	 * 
	 * @param bo
	 *            邀请码实体
	 * @return 影响的行数
	 */
	int updateInvitationCodeState(InvitationCodeBO bo);

	/**
	 * 新增用户
	 * 
	 * @param email
	 *            注册邮箱
	 * @param name
	 *            昵称
	 * @param pass
	 *            密码
	 * @return 受影响行数
	 */
	int insertUser(String email, String name, String pass);

	/**
	 * 依据注册邮箱查询用户
	 * 
	 * @param email
	 *            注册邮箱
	 * @return 用户实体类
	 */
	UserBO queryUserByEmail(String email);

	/**
	 * 依据邮箱和密码查询用户
	 * 
	 * @param email
	 *            注册邮箱
	 * @param pass
	 *            密码
	 * @return 用户实体类
	 */
	UserBO queryUser(String email, String pass);

	/**
	 * 更新用户最近登陆时间
	 * 
	 * @param email
	 *            注册邮箱
	 * @return 受影响的行数
	 */
	int updateLoginTime(String email);

	/**
	 * 依据用户id查询用户信息
	 * 
	 * @param id
	 *            用户id
	 * @return 用户实体类
	 */
	UserBO queryUserByID(String id);

	/**
	 * 新增留言信息
	 * 
	 * @param email
	 *            留言者邮箱
	 * @param name
	 *            留言者昵称
	 * @param msg
	 *            留言内容
	 * @param type
	 *            留言类型
	 * @param id
	 *            被访问者id
	 * @return
	 */
	int insertLeaveMsg(String email, String name, String msg, String type,
			Long id);

	/**
	 * 依据用户id查询用户详细信息
	 * 
	 * @param userId
	 *            用户id
	 * @return
	 */
	UserInfoBO queryUserInfoByUserID(Long userId);

	/**
	 * 更新用户详细信息
	 * 
	 * @param user_id
	 *            用户id
	 * @param name
	 *            用户昵称
	 * @param rel_name
	 *            真实姓名
	 * @param gender
	 *            性别
	 * @param homeProvince
	 *            所在地
	 * @param birthday
	 *            生日
	 * @param hobby
	 *            兴趣
	 * @param contactStr
	 *            联系方式
	 * @param publicStr
	 *            公开信息
	 * @return 受影响的行数
	 */
	int updateUserInfo(Long user_id, String rel_name, String gender,
			String homeProvince, String birthday, String hobby,
			String contactStr, String publicStr);
	
	/**
	 * 更新用户昵称
	 * @param name 昵称
	 * @param user_id 用户id
	 * @return 受影响的行数
	 */
	int updateUserName(String name,Long user_id);
	
	/**
	 * 新增用户详细信息
	 * @param user_id
	 * @param rel_name
	 * @param gender
	 * @param homeProvince
	 * @param birthday
	 * @param hobby
	 * @param contactStr
	 * @param publicStr
	 * @return
	 */
	int insertUserInfo(Long user_id, String rel_name, String gender,
			String homeProvince, String birthday, String hobby,
			String contactStr, String publicStr);
}
