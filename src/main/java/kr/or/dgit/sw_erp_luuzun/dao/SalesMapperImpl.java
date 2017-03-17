package kr.or.dgit.sw_erp_luuzun.dao;

import java.util.List;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.apache.ibatis.session.SqlSession;

import kr.or.dgit.sw_erp_luuzun.model.SaleData;

public class SalesMapperImpl implements SalesMapper{

	private String nameSpace = ".kr.or.dgit.sw_erp_luuzun.dao.SalesMapper"; //SalesMapper.xml의 namespace
	private SqlSession sqlSession;
	private static final Log log = LogFactory.getLog(SalesMapperImpl.class);
	
	public SalesMapperImpl(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
	@Override
	public int insertSales(SaleData saleData) {
		log.debug("insertSales()");
		return sqlSession.insert(nameSpace+"insertSales", saleData);
	}

	@Override
	public SaleData selectSales(SaleData saleData) {
		log.debug("selectSales()");
		return sqlSession.selectOne(nameSpace+".selectSales", saleData);

	}

	@Override
	public List<SaleData> selectSalesByAll() {
		log.debug("selectSalesByAll()");
		return sqlSession.selectList(nameSpace+".selectSalesByAll");
	}

	@Override
	public int updateSales(SaleData saleData) {
		log.debug("updateSales()");
		return sqlSession.update(nameSpace+".updateSales", saleData);
	}

	@Override
	public int deleteSales(SaleData saleData) {
		log.debug("deleteSales()");
		return sqlSession.delete(nameSpace+".deleteSales", saleData);
	}
}
