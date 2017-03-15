package kr.or.dgit.sw_erp_luuzun.model;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Client {
	private final StringProperty clntNo;
	private final StringProperty clntName;
	private final StringProperty clntAddr;
	private final StringProperty clntTel;
	
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
}
