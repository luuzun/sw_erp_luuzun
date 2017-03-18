package kr.or.dgit.sw_erp_luuzun.main;

import java.util.List;

import javafx.application.Application;
import javafx.stage.Stage;
import kr.or.dgit.sw_erp_luuzun.dto.SaleData;
import kr.or.dgit.sw_erp_luuzun.services.SalesService;
import kr.or.dgit.sw_erp_luuzun.view.ViewSales;

public class MainApp extends Application{
	private Stage primaryStage;
	
	@SuppressWarnings("unused")
	@Override
	public void start(Stage primaryStage) throws Exception {
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("Software Management App");
        ViewSales viewSales = new ViewSales(primaryStage);
        
        SalesService ss = new SalesService();
        List<SaleData> resultList = ss.selectSalesByAll();
        for (SaleData saleData : resultList) {
			System.out.println(saleData);
		}
	}

	public Stage getPrimaryStage() {
        return primaryStage;
    }
	
	public static void main(String[] args) {
		launch(args);
	}
}