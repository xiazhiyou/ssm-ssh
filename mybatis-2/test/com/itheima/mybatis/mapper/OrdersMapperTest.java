package com.itheima.mybatis.mapper;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import com.itheima.mybatis.po.OrdersExt;
import com.itheima.mybatis.po.User;

/**
 *  
 * <p>
 * Title: OrdersMapperTest
 * </p>
 *  
 * <p>
 * Description: TODO(这里用一句话描述这个类的作用) 
 * <p>
 * <p>
 * Company: www.itcast.com
 * </p>
 *  @author 传智.关云长   @date 2015-12-23 上午9:52:03    @version 1.0
 */
public class OrdersMapperTest {

	private SqlSessionFactory sqlSessionFactory;

	@Before
	public void setUp() throws Exception {
		// 读取配置文件
		// 全局配置文件的路径
		String resource = "SqlMapConfig.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);

		// 创建SqlSessionFactory
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
	}

	@Test
	public void testFindOrdersAndUser() {
		// 创建OrdersMapper对象
		SqlSession sqlSession = sqlSessionFactory.openSession();

		OrdersMapper mapper = sqlSession.getMapper(OrdersMapper.class);

		List<OrdersExt> list = mapper.findOrdersAndUser();

		sqlSession.close();
	}
	
	@Test
	public void testFindOrdersAndUserRstMap() {
		// 创建OrdersMapper对象
		SqlSession sqlSession = sqlSessionFactory.openSession();

		OrdersMapper mapper = sqlSession.getMapper(OrdersMapper.class);

		List<OrdersExt> list = mapper.findOrdersAndUserRstMap();

		sqlSession.close();
	}
	
	@Test
	public void testFindOrdersAndDetailRstMap() {
		// 创建OrdersMapper对象
		SqlSession sqlSession = sqlSessionFactory.openSession();

		OrdersMapper mapper = sqlSession.getMapper(OrdersMapper.class);

		List<OrdersExt> list = mapper.findOrdersAndDetailRstMap();

		sqlSession.close();
	}
	
	@Test
	public void testFindUserAndItemsRstMap() {
		// 创建OrdersMapper对象
		SqlSession sqlSession = sqlSessionFactory.openSession();

		OrdersMapper mapper = sqlSession.getMapper(OrdersMapper.class);

		List<User> list = mapper.findUserAndItemsRstMap();

		sqlSession.close();
	}

	@Test
	public void testLazyLoading() {
		// 创建OrdersMapper对象
		SqlSession sqlSession = sqlSessionFactory.openSession();

		OrdersMapper mapper = sqlSession.getMapper(OrdersMapper.class);

		List<OrdersExt> list = mapper.findOrderAndUserLazyLoading();

		for (OrdersExt order : list) {
			System.out.println(order.getUser());
		}
		
		sqlSession.close();
	}
}
