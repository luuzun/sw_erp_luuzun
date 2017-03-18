package kr.or.dgit.sw_erp_luuzun.view;

import java.io.IOException;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TabPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import kr.or.dgit.sw_erp_luuzun.dto.Client;
import kr.or.dgit.sw_erp_luuzun.dto.SaleData;
import kr.or.dgit.sw_erp_luuzun.dto.SoftWare;

public class ViewSales{
	private Stage primaryStage;
	private BorderPane rootLayout;
	private TabPane viewSalesTab;

	private ObservableList<SaleData> saleDataList = FXCollections.observableArrayList();

	public ViewSales(Stage primaryStage) {
		this.primaryStage = primaryStage;
		initRootLayout(); //RootLayout
		showViewSales(); //showTabViewSales
		
		//addSampleData
		getSaleDataList().add(new SaleData("SD001", "이승우", "OverWatch", 120, false, null));
		getSaleDataList().add(new SaleData("SD002", "이교민", "BloodWar", 70, true, null));
		getSaleDataList().add(new SaleData("SD003", "김성환", "Citizen", 1, false, null));
		getSaleDataList().add(new SaleData("SD004", "설동훈", "LoL", 10, true, null));
		getSaleDataList().add(new SaleData("SD005", "조시은", "WarCraft", 20, true, null));
	}

	private void initRootLayout() { //RootLayout
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(ViewSales.class.getResource("RootLayout.fxml"));
			rootLayout = (BorderPane) loader.load();
			Scene scene = new Scene(rootLayout);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private void showViewSales() { //showTabViewSales
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(ViewSales.class.getResource("ViewSales.fxml"));
			viewSalesTab = (TabPane)loader.load();
			
			rootLayout.setCenter(viewSalesTab); //ViewSales를 rootLayout의 Center에 추가
			
			ControlSales controller = loader.getController();
	        controller.setViewSales(this);
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}

	public Stage getPrimaryStage() {
        return primaryStage;
    }

	public ObservableList<SaleData> getSaleDataList() {
		return saleDataList;
	}
}
