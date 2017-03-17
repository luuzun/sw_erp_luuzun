package kr.or.dgit.sw_erp_luuzun.dao;

import java.util.List;

import kr.or.dgit.sw_erp_luuzun.model.SaleData;

public interface SalesMapper {
	int insertSales(SaleData saleData);
	SaleData selectSales(SaleData saleData);
	List<SaleData> selectSalesByAll();
	int updateSales(SaleData saleData);
	int deleteSales(SaleData saleData);
}
