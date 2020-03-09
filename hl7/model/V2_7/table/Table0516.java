package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0516 extends Table{
	private static final String VERSION = "2.7";
	public static Table getInstance(){
		if(table==null) new Table0516();
		return table;
	}

	public static final String E = "E";
	public static final String F = "F";
	public static final String I = "I";
	public static final String W = "W";

	private Table0516(){
		setTableName("Error Severity");
		setOID("");

		putMap("E", "Error");
		putMap("F", "Fatal Error");
		putMap("I", "Information");
		putMap("W", "Warning");

	}

}
