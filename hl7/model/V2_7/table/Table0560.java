package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0560 extends Table{
	private static final String VERSION = "2.7";
	public static Table getInstance(){
		if(table==null) new Table0560();
		return table;
	}

	public static final String DY = "DY";
	public static final String FL = "FL";
	public static final String HS = "HS";
	public static final String MN = "MN";
	public static final String YY = "YY";

	private Table0560(){
		setTableName("Quantity Units");
		setOID("");

		putMap("DY", "Days");
		putMap("FL", "Units");
		putMap("HS", "Hours");
		putMap("MN", "Month");
		putMap("YY", "Years");

	}

}
