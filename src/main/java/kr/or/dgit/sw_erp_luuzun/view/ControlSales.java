package kr.or.dgit.sw_erp_luuzun.view;

import java.time.LocalDate;

import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
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

	@FXML private TextField saleNoTf;
	@FXML private ComboBox<String> clntNameCb; 
	@FXML private ComboBox<String> swNameCb;
	@FXML private TextField sellingAmountTf;
	@FXML private DatePicker orderDateDp;
	@FXML private CheckBox isDepositCh;
	
    private ViewSales viewSales;

	public ControlSales() {}

	@FXML
	private void initialize() { //fxml 로드 후 자동 호출 
		//Column 초기화
		saleNoColumn.setCellValueFactory(cellData 	-> cellData.getValue().SaleNoProperty());
		clntNameColumn.setCellValueFactory(cellData -> cellData.getValue().ClientProperty());
		swNameColumn.setCellValueFactory(cellData 	-> cellData.getValue().SoftWareProperty());
		sellingAmountColumn.setCellValueFactory(cellData -> cellData.getValue().SellingAmountProperty().asObject());
		isDepositColumn.setCellValueFactory(cellData -> cellData.getValue().IsDepositProperty());
		orderDateColumn.setCellValueFactory(cellData -> cellData.getValue().OrderDateProperty());

		//Content를 선택한 row로 채움
		fillContent(null);
		saleTable.getSelectionModel().selectedItemProperty().addListener(
				(observable, oldValue, newValue) -> fillContent(newValue));
	}
	
    public void setViewSales(ViewSales viewSales) { // 테이블에 데이터를 추가
    	this.viewSales = viewSales;
    	saleTable.setItems(viewSales.getSaleDataList());
    }
    
    //saleNoTf clntNameCb swNameCb sellingAmountTf orderDateDp isDepositCh
    private void fillContent(SaleData saleData) { // 입력창에 선택값 입력
        if (saleData != null) {
        	saleNoTf.setText(saleData.getSaleNo()); 
        	clntNameCb.setValue(saleData.getClient().getClntName());
        	swNameCb.setValue(saleData.getSoftWare().getSwName());
        	sellingAmountTf.setText(String.valueOf(saleData.getSellingAmount())); 
        	orderDateDp.setValue(saleData.getOrderDate());
        	isDepositCh.setSelected(saleData.getIsDeposit());
        } else {
        	//확인필요
        	saleNoTf.clear(); 
        	clntNameCb.setValue("");
        	swNameCb.setValue("");
        	sellingAmountTf.clear();
        	orderDateDp.setValue(null);
        	isDepositCh.setSelected(false);
        }
    }
}//clntNameCb.getItems().add(saleData.getClient().getClntName());
