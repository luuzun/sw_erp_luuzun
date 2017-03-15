package kr.or.dgit.sw_erp_luuzun.model;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class SupplyComp {
	private final StringProperty compNo;
	private final StringProperty compName;
	private final StringProperty compAddr; 
	private final StringProperty compTel;
	
	public SupplyComp(String compNo, String compName, String compAddr, String compTel) {
		this.compNo = new SimpleStringProperty(compNo);
		this.compName = new SimpleStringProperty(compName);
		this.compAddr = new SimpleStringProperty(compAddr);
		this.compTel = new SimpleStringProperty(compTel);
	}

	@Override
	public String toString() {
		return String.format("%s, %s, %s, %s", compNo, compName, compAddr, compTel);
	}
}
