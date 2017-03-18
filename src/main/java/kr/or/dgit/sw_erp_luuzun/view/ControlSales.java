package kr.or.dgit.sw_erp_luuzun.view;

import java.time.LocalDate;

import javax.swing.JOptionPane;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import kr.or.dgit.sw_erp_luuzun.dto.Client;
import kr.or.dgit.sw_erp_luuzun.dto.SaleData;
import kr.or.dgit.sw_erp_luuzun.dto.SoftWare;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class ControlSales {
	@FXML private TableView<SaleData> saleTable;
	@FXML private TableColumn<SaleData, String> saleNoColumn;
	@FXML private TableColumn<SaleData, String> clntNameColumn;
	@FXML private TableColumn<SaleData, String> swNameColumn;
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
	//fxml 로드 후 자동 호출
	private void initialize() {  
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

		//For Test
		clntNameCb.getItems().addAll("이승우","이교민","조시은");
		swNameCb.getItems().addAll("OverWatch","LoL","BloodWar");
	}
	
	// 테이블에 데이터를 추가
    public void setViewSales(ViewSales viewSales) {
    	this.viewSales = viewSales;
    	saleTable.setItems(viewSales.getSaleDataList());
    }
    
    //saleNoTf clntNameCb swNameCb sellingAmountTf orderDateDp isDepositCh
    private void fillContent(SaleData saleData) { // 입력창에 선택값 입력
        if (saleData != null) {
        	saleNoTf.setText(saleData.getSaleNo()); 
        	clntNameCb.setValue(saleData.getClient());
        	swNameCb.setValue(saleData.getSoftWare());
        	sellingAmountTf.setText(String.valueOf(saleData.getSellingAmount())); 
        	orderDateDp.setValue(saleData.getOrderDate());
        	isDepositCh.setSelected(saleData.getIsDeposit());
        } else {
        	clearContent();
        }
    }
    
    //입력창을 비움
    private void clearContent(){ 
    	saleNoTf.clear(); 
    	clntNameCb.setValue("");
    	swNameCb.setValue("");
    	sellingAmountTf.clear();
    	orderDateDp.setValue(null);
    	isDepositCh.setSelected(false);
    }
    
    /************************ Event Handler ****************************/
    @FXML
    private void handleDeleteSales() {
        int selectedIndex = saleTable.getSelectionModel().getSelectedIndex();
        saleTable.getItems().remove(selectedIndex);
    }
   
    @FXML
    private void handleCancel() {
    	clearContent();
    }

    @FXML
    private void handleOk() {
    	if (isValid()) {
    		SaleData inputSale = new SaleData(
    				saleNoTf.getText(),
    				clntNameCb.getValue(),
    				swNameCb.getValue(),
    				Integer.parseInt(sellingAmountTf.getText()),
    				isDepositCh.isSelected(),
    				orderDateDp.getValue()
    		); 
    		viewSales.getSaleDataList().add(inputSale);
    	}
    }
    /*******************************************************************/

    //빈 입력창이 있는지 확인
    private boolean isValid() {
    	String message = "";
    	if(saleNoTf.getText() == null || saleNoTf.getText().length() == 0) {
    		message += "주문번호를 입력해주세요!\n";
    	}
    	if(clntNameCb.getValue() == null || clntNameCb.getValue().length() == 0) {
    		message += "고객 상호명을 선택해주세요!\n";
    	}
    	if(swNameCb.getValue() == null || swNameCb.getValue().length() == 0) {
    		message += "품목명을 선택해주세요!\n";
    	}

    	if(sellingAmountTf.getText() == null || sellingAmountTf.getText().length() == 0) {
    		message += "주문수량을 입력해 주세요!\n";
    	}else{
    		// 주문 수량이 Int형인지 확인
    		try{
    			Integer.parseInt(sellingAmountTf.getText());
    		}catch (NumberFormatException e) {
    			message += "수량이 올바르지 않습니다!\n";
    		}
    	}
    	if(orderDateDp.getValue() == null) {
    		message += "주문일자를 선택해 주세요!\n";
    	}
    	if(message.length() == 0) {
    		return true;

    	}else{
    		JOptionPane.showOptionDialog(null, message, "Error!", JOptionPane.DEFAULT_OPTION, 
    				JOptionPane.ERROR_MESSAGE, null, null, null);
    		return false;
    	}
    }
}
