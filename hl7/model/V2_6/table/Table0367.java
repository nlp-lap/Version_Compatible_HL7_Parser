package hl7.model.V2_6.table;

import hl7.bean.table.Table;

public class Table0367 extends Table{
	private static final String VERSION = "2.6";
	public static Table getInstance(){
		if(table==null) new Table0367();
		return table;
	}

	public static final String C = "C";
	public static final String N = "N";
	public static final String S = "S";
	public static final String W = "W";

	private Table0367(){
		setTableName("Alert level");
		setOID("2.16.840.1.113883.12.367");

		putMap("C", "Critical");
		putMap("N", "Normal");
		putMap("S", "Serious");
		putMap("W", "Warning");

	}

}
