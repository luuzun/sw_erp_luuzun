package kr.or.dgit.sw_erp_luuzun.dto;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Client {
	private StringProperty clntNo;
	private StringProperty clntName;
	private StringProperty clntAddr;
	private StringProperty clntTel;
	
	// For Test
	public Client(String clntName) {
		this(null,clntName,null,null);
	}
	
	// For Test
	public Client(String clntNo, String clntName) {
		this(clntNo,clntName,null,null);
	}
	
	public Client(String clntNo, String clntName, String clntAddr, String clntTel) {
		this.clntNo = new SimpleStringProperty(clntNo);
		this.clntName = new SimpleStringProperty(clntName);
		this.clntAddr = new SimpleStringProperty(clntAddr);
		this.clntTel = new SimpleStringProperty(clntTel);
	}
	
	@Override
	public String toString() {
		return String.format("%s", clntName.get());
	}
	
	//
	public String getClntNo() {
		return clntNo.get();
	}
	public StringProperty ClntNoProperty() {
		return clntNo;
	}
	public void setClntNo(String clntNo) {
		this.clntNo.set(clntNo);
	}
	
	//
	public String getClntName() {
		return clntName.get();
	}
	public StringProperty ClntNameProperty() {
		return clntName;
	}
	public void setClntName(String clntName) {
		this.clntName.set(clntName);
	}
	
	//
	public String getClntAddr() {
		return clntAddr.get();
	}
	public StringProperty ClntAddrProperty() {
		return clntAddr;
	}
	public void setClntAddr(String clntAddr) {
		this.clntAddr.set(clntAddr);
	}

	//
	public String getClntTel() {
		return clntTel.get();
	}
	public StringProperty ClntTelProperty() {
		return clntTel;
	}
	public void setClntTel(String clntTel) {
		this.clntTel.set(clntTel);
	}
}