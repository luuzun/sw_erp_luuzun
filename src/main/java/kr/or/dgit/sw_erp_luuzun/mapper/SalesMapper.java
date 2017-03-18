package kr.or.dgit.sw_erp_luuzun.mapper;

import java.util.List;

import kr.or.dgit.sw_erp_luuzun.dto.SaleData;

public interface SalesMapper {
	int insertSales(SaleData saleData);
	SaleData selectSales(SaleData saleData);
	List<SaleData> selectSalesByAll();
	int updateSales(SaleData saleData);
	int deleteSales(SaleData saleData);
}
