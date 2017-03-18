package kr.or.dgit.sw_erp_luuzun.dto;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class SoftWare {
	private StringProperty swNo;
	private StringProperty swGroup;
	private StringProperty swName;
	private IntegerProperty swSupplyPrice;
	private IntegerProperty swPrice;
	private StringProperty supplyComp;
	
	// For Test
	public SoftWare(String swNo, String swName) {
		this(swNo, null, swName, 0, 0, null);
	}
	
	// For Test
	public SoftWare(String swName) {
		this(null, null, swName, 0, 0, null);
	}
	
	public SoftWare(String swNo, String swGroup, String swName, int swSupplyPrice,
			int swPrice, String supplyComp) {
		this.swNo = new SimpleStringProperty(swNo);
		this.swGroup = new SimpleStringProperty(swGroup);
		this.swName = new SimpleStringProperty(swName);
		this.swSupplyPrice = new SimpleIntegerProperty(swSupplyPrice);
		this.swPrice = new SimpleIntegerProperty(swPrice);
		this.supplyComp = new SimpleStringProperty(supplyComp);
	}
	
	@Override
	public String toString() {
		return String.format("%s", swName.get());
	}

	//
	public String getSwNo() {
		return swNo.get();
	}
	public StringProperty SwNoProperty() {
		return swNo;
	}
	public void setSwNo(String swNo) {
		this.swNo.set(swNo);
	}

	//
	public String getSwGroup() {
		return swGroup.get();
	}
	public StringProperty SwGroupProperty() {
		return swGroup;
	}
	public void setSwGroup(String swGroup) {
		this.swGroup.set(swGroup);
	}

	//
	public String getSwName() {
		return swName.get();
	}
	public StringProperty SwNameProperty() {
		return swName;
	}
	public void setSwName(String swName) {
		this.swName.set(swName);
	}

	//
	public Integer getSwSupplyPrice() {
		return swSupplyPrice.get();
	}
	public IntegerProperty SwSupplyPriceProperty() {
		return swSupplyPrice;
	}
	public void setSwSupplyPrice(Integer swSupplyPrice) {
		this.swSupplyPrice.set(swSupplyPrice);
	}

	//
	public Integer getSwPrice() {
		return swPrice.get();
	}
	public IntegerProperty SwPriceProperty() {
		return swPrice;
	}
	public void setSwPrice(Integer swPrice) {
		this.swPrice.set(swPrice);
	}

	//
	public String getSupplyComp() {
		return supplyComp.get();
	}
	public StringProperty SupplyCompProperty() {
		return supplyComp;
	}
	public void setSupplyComp(String supplyComp) {
		this.supplyComp.set(supplyComp);
	}
}