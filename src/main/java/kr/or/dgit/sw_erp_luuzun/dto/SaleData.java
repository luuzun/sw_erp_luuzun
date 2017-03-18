package kr.or.dgit.sw_erp_luuzun.dto;

import java.time.LocalDate;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class SaleData {
	private final StringProperty saleNo;
	private StringProperty clntName;
	private final StringProperty swName;
	private final IntegerProperty sellingAmount;
	private final BooleanProperty isDeposit;
	private final ObjectProperty<LocalDate> orderDate;
	
	public SaleData() {
		this("1", "1", null, 0, false, null);
	}

	public SaleData(String saleNo, String clntName, String swName,
			int sellingAmount, boolean isDeposit, LocalDate orderDate) {
		
		this.saleNo 		= new SimpleStringProperty(saleNo);
		this.clntName 	= new SimpleStringProperty(clntName);
		this.swName 	= new SimpleStringProperty(swName);
		this.sellingAmount 	= new SimpleIntegerProperty(sellingAmount);
		this.isDeposit 		= new SimpleBooleanProperty(isDeposit);
		this.orderDate 		= new SimpleObjectProperty<LocalDate>(orderDate);
	}

	@Override
	public String toString() {
		return String.format("%s, %s, %s, %s, %s, %s", 
				saleNo.get(), clntName.get(), swName.get(), 
				sellingAmount.get(), isDeposit.get(), orderDate.get());
	}
	
	//
	public String getSaleNo() {
		return saleNo.get();
	}
	public StringProperty SaleNoProperty(){
		return saleNo;
	}
	public void setSaleNo(String saleNo) {
		this.saleNo.set(saleNo);
	}
	
	//
	public String getClntName() {
		return clntName.get();
	}
	public StringProperty ClntNameProperty(){
		return clntName;
	}
	public void setClntName(String clntName) {
		this.clntName.set(clntName);
	}

	//
	public String getswName() {
		return swName.get();
	}
	public StringProperty swNameProperty(){
		return swName;
	}
	public void setswName(String swName) {
		this.swName.set(swName);
	}

	//
	public int getSellingAmount() {
		return sellingAmount.get();
	}
	public IntegerProperty SellingAmountProperty(){
		return sellingAmount;
	}
	public void setSellingAmount(int sellingAmount) {
		this.sellingAmount.set(sellingAmount);
	}

	//
	public boolean getIsDeposit() {
		return isDeposit.get();
	}
	public BooleanProperty IsDepositProperty(){
		return isDeposit;
	}
	public void setIsDeposit(boolean isDeposit) {
		this.isDeposit.set(isDeposit);
	}

	//
	public LocalDate getOrderDate() {
		return orderDate.get();
	}
	public ObjectProperty<LocalDate> OrderDateProperty(){
		return orderDate;
	}
	public void setOrderDate(LocalDate orderDate) {
		this.orderDate.set(orderDate);
	}
}
