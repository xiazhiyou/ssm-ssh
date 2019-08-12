package com.itheima.mybatis.po;

import java.util.List;

/**
 *  
 * <p>
 * Title: OrdersExt
 * </p>
 *  
 * <p>
 * Description: TODO(这里用一句话描述这个类的作用) 
 * <p>
 * <p>
 * Company: www.itcast.com
 * </p>
 *  @author 传智.关云长   @date 2015-12-23 上午9:47:04    @version 1.0
 */
public class OrdersExt extends Orders {

	// user.`username`,
	// user.`sex`
	private String username;

	private String sex;

	//用户信息
	private User user;
	
	//订单明细信息
	private List<Orderdetail> detailList;
	
	public List<Orderdetail> getDetailList() {
		return detailList;
	}

	public void setDetailList(List<Orderdetail> detailList) {
		this.detailList = detailList;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
	
	

}
