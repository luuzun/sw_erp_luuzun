package kr.or.dgit.sw_erp_luuzun.main;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MainApp extends Application{
	private Stage primaryStage;
	private BorderPane rootLayout;
	private BorderPane viewSales;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("Software Management App");
        
        initRootLayout(); //RootLayout 로드
        System.out.println("ViewSales loading");
        showViewSales(); //ViewSales 로드
        showContentSales(); //ContentSales 로드
        showTableSales(); //TableSales 로드
	}

	private void showContentSales() {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainApp.class.getResource("../view/ContentSales.fxml"));
			AnchorPane ContentSales = loader.load();
			((BorderPane) viewSales.getChildren().get(3)).setTop(ContentSales);
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("ContentSales loading Failed");
		}	
	}

	private void showTableSales() {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainApp.class.getResource("../view/TableSales.fxml"));
			AnchorPane TableSales = loader.load();
			((BorderPane) viewSales.getChildren().get(3)).setCenter(TableSales);
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("SalesTable loading Failed");
		}	
	}

	private void showViewSales() {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainApp.class.getResource("../view/ViewSales.fxml"));
			viewSales = loader.load();
			rootLayout.setCenter(viewSales);
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("ViewSales loading Failed");
		}	
	}
	
	private void initRootLayout() {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainApp.class.getResource("../view/RootLayout.fxml"));
			System.out.println(MainApp.class.getResource("../view/RootLayout.fxml"));
			rootLayout = (BorderPane) loader.load();
			Scene scene = new Scene(rootLayout);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (IOException e) {
			System.out.println("RootLayout loading Failed");
			e.printStackTrace();
		}
	}

	public Stage getPrimaryStage() {
        return primaryStage;
    }
	
	public static void main(String[] args) {
	        launch(args);
	}
}