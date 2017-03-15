package kr.or.dgit.sw_erp_luuzun.model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class SoftWare {
	private final StringProperty swNo;
	private final StringProperty swGroup;
	private final StringProperty swName;
	private final IntegerProperty swSupplyPrice;
	private final IntegerProperty swPrice;
	private final StringProperty supplyComp;
	
	public SoftWare(String swNo, String swName) {
		this(swNo, null, swName, 0, 0, null);
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
}
