package com.itheima.mybatis.mapper;

import java.util.List;

import com.itheima.mybatis.po.OrdersExt;
import com.itheima.mybatis.po.User;


/**
 *  
 * <p>
 * Title: UserMapper
 * </p>
 *  
 * <p>
 * Description: TODO(这里用一句话描述这个类的作用) 
 * <p>
 * <p>
 * Company: www.itcast.com
 * </p>
 *  @author 传智.关云长   @date 2015-12-21 下午3:16:06    @version 1.0
 */
public interface OrdersMapper {
	//一对一之resultType
	public List<OrdersExt> findOrdersAndUser();
	
	//一对一之resultMap
	public List<OrdersExt> findOrdersAndUserRstMap();
	
	//一对多
	public List<OrdersExt> findOrdersAndDetailRstMap();
	
	//多对多
	public List<User> findUserAndItemsRstMap();
	
	//延迟加载
	public List<OrdersExt> findOrderAndUserLazyLoading();
}
