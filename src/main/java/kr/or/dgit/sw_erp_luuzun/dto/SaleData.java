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
	private final StringProperty clientName;
	private final StringProperty softWareName;
	private final IntegerProperty sellingAmount;
	private final BooleanProperty isDeposit;
	private final ObjectProperty<LocalDate> orderDate;
	
	public SaleData() {
		this(null, null, null, 0, false, null);
	}

	public SaleData(String saleNo, String clientName, String softWareName,
			int sellingAmount, boolean isDeposit, LocalDate orderDate) {
		
		this.saleNo 		= new SimpleStringProperty(saleNo);
		this.clientName 	= new SimpleStringProperty(clientName);
		this.softWareName 	= new SimpleStringProperty(softWareName);
		this.sellingAmount 	= new SimpleIntegerProperty(sellingAmount);
		this.isDeposit 		= new SimpleBooleanProperty(isDeposit);
		this.orderDate 		= new SimpleObjectProperty<LocalDate>(orderDate);
	}

	@Override
	public String toString() {
		return String.format("%s, %s, %s, %s, %s, %s", 
				saleNo.get(), clientName.get(), softWareName.get(), 
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
	public String getClient() {
		return clientName.get();
	}
	public StringProperty ClientProperty(){
		return clientName;
	}
	public void setClient(String clientName) {
		this.clientName.set(clientName);
	}

	//
	public String getSoftWare() {
		return softWareName.get();
	}
	public StringProperty SoftWareProperty(){
		return softWareName;
	}
	public void setSoftWare(String softWareName) {
		this.softWareName.set(softWareName);
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
