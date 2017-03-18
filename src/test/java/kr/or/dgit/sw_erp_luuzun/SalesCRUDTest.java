package kr.or.dgit.sw_erp_luuzun;

import java.util.Collections;
import java.util.List;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import kr.or.dgit.sw_erp_luuzun.dto.SaleData;
import kr.or.dgit.sw_erp_luuzun.services.SalesService;


public class SalesCRUDTest {
	private static SalesService salesService;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		salesService = new SalesService();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		salesService = null;
	}
	
	@Test //selectSalesByAll Test
	public void testselectSalesByAll(){
		List<SaleData> lists = salesService.selectSalesByAll();
		List<SaleData> emptyList = Collections.emptyList();
		Assert.assertNotEquals(emptyList, lists);
	}
}
