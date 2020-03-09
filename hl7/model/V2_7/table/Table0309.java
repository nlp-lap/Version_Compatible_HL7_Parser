package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0309 extends Table{
	private static final String VERSION = "2.7";
	public static Table getInstance(){
		if(table==null) new Table0309();
		return table;
	}

	public static final String B = "B";
	public static final String H = "H";
	public static final String P = "P";
	public static final String RX = "RX";

	private Table0309(){
		setTableName("Coverage Type");
		setOID("");

		putMap("B", "Both hospital and physician");
		putMap("H", "Hospital/institutional");
		putMap("P", "Physician/professional");
		putMap("RX", "Pharmacy");

	}

}
