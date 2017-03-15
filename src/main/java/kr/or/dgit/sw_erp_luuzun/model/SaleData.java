package kr.or.dgit.sw_erp_luuzun.model;

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
	private final ObjectProperty<Client> client;
	private final ObjectProperty<SoftWare> softWare;
	private final IntegerProperty sellingAmount;
	private final BooleanProperty isDeposit;
	private final ObjectProperty<LocalDate> orderDate;
	
	public SaleData() {
		this(null, null, null, 0, false, null);
	}

	public SaleData(String saleNo, Client client, SoftWare softWare,
			int sellingAmount, boolean isDeposit, LocalDate orderDate) {
		
		this.saleNo = new SimpleStringProperty(saleNo);
		this.client = new SimpleObjectProperty<Client>(client);
		this.softWare = new SimpleObjectProperty<SoftWare>(softWare);
		this.sellingAmount = new SimpleIntegerProperty(sellingAmount);
		this.isDeposit = new SimpleBooleanProperty(isDeposit);
		this.orderDate = new SimpleObjectProperty<LocalDate>(orderDate);
	}

	@Override
	public String toString() {
		return String.format("%s, %s, %s, %s, %s, %s", 
				saleNo,	client, softWare, sellingAmount, isDeposit, orderDate);
	}
	
	//
	public String getSaleNo() {
		return saleNo.get();
	}
	public void setSaleNo(String saleNo) {
		this.saleNo.set(saleNo);
	}
	public StringProperty SaleNoProperty(){
		return saleNo;
	}
	
	//
	public Client getClient() {
		return client.get();
	}
	public ObjectProperty<Client> ClientProperty(){
		return client;
	}
	public void setClient(Client client) {
		this.client.set(client);
	}

	//
	public SoftWare getSoftWare() {
		return softWare.get();
	}
	public ObjectProperty<SoftWare> SoftWareProperty(){
		return softWare;
	}
	public void setSoftWare(SoftWare softWare) {
		this.softWare.set(softWare);
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
