package kr.or.dgit.sw_erp_luuzun.view;

import java.time.LocalDate;

import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import kr.or.dgit.sw_erp_luuzun.model.Client;
import kr.or.dgit.sw_erp_luuzun.model.SaleData;
import kr.or.dgit.sw_erp_luuzun.model.SoftWare;

public class ControlSales {
	@FXML private TableView<SaleData> saleTable;
	@FXML private TableColumn<SaleData, String> saleNoColumn;
	@FXML private TableColumn<SaleData, Client> clntNameColumn;
	@FXML private TableColumn<SaleData, SoftWare> swNameColumn;
	@FXML private TableColumn<SaleData, Integer> sellingAmountColumn;
	@FXML private TableColumn<SaleData, Boolean> isDepositColumn;
	@FXML private TableColumn<SaleData, LocalDate> orderDateColumn;

    private ViewSales viewSales;

	public ControlSales() {}

	@FXML
	private void initialize() { // Column 초기화. fxml 로드 후 자동 호출
		saleNoColumn.setCellValueFactory(cellData 	-> cellData.getValue().SaleNoProperty());
		clntNameColumn.setCellValueFactory(cellData -> cellData.getValue().ClientProperty());
		swNameColumn.setCellValueFactory(cellData 	-> cellData.getValue().SoftWareProperty());
		sellingAmountColumn.setCellValueFactory(cellData -> cellData.getValue().SellingAmountProperty().asObject());
		isDepositColumn.setCellValueFactory(cellData -> cellData.getValue().IsDepositProperty());
		orderDateColumn.setCellValueFactory(cellData -> cellData.getValue().OrderDateProperty());
	}
	
    public void setViewSales(ViewSales viewSales) { // 테이블에 데이터를 추가
    	this.viewSales = viewSales;
    	saleTable.setItems(viewSales.getSaleDataList());
    }
}
