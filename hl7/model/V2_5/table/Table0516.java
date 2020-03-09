package hl7.model.V2_5.table;

import hl7.bean.table.Table;

public class Table0516 extends Table{
	private static final String VERSION = "2.5";
	public static Table getInstance(){
		if(table==null) new Table0516();
		return table;
	}

	public static final String E = "E";
	public static final String I = "I";
	public static final String W = "W";

	private Table0516(){
		setTableName("Error severity");
		setOID("2.16.840.1.113883.12.516");

		putMap("E", "Error");
		putMap("I", "Information");
		putMap("W", "Warning");

	}

}
