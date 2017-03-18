package kr.or.dgit.sw_erp_luuzun.services;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import kr.or.dgit.sw_erp_luuzun.mapper.SalesMapper;
import kr.or.dgit.sw_erp_luuzun.mapper.SalesMapperImpl;
import kr.or.dgit.sw_erp_luuzun.model.SaleData;
import kr.or.dgit.sw_erp_luuzun.util.MyBatisSqlSessionFactory;


public class SalesService {

	public int insertSales(SaleData saleData) {
		int res = -1;
		try (SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession();) {
			SalesMapper salesMapper = new SalesMapperImpl(sqlSession);
			res = salesMapper.insertSales(saleData);
			sqlSession.commit();
		} 
		return res;
	}
	
	public SaleData selectSales(SaleData saleData) {
		try (SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession();) {
			SalesMapper salesMapper = new SalesMapperImpl(sqlSession);
			return salesMapper.selectSales(saleData);
		} 
	}
	
	public List<SaleData> selectSalesByAll() {
		try (SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession();) {
			SalesMapper salesMapper = new SalesMapperImpl(sqlSession);
			return salesMapper.selectSalesByAll();
		} 
	}
	
	public int updateSales(SaleData saleData) {
		int res = -1;
		try (SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession();) {
			SalesMapper salesMapper = new SalesMapperImpl(sqlSession);
			res = salesMapper.updateSales(saleData);
			sqlSession.commit();
		} 
		return res;
	}

	public int deleteSales(SaleData saleData) {
		int res = -1;
		try (SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession();) {
			SalesMapper salesMapper = new SalesMapperImpl(sqlSession);
			res = salesMapper.deleteSales(saleData);
			sqlSession.commit();
		} 
		return res;
	}
}
