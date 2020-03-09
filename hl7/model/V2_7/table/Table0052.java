package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0052 extends Table{
	private static final String VERSION = "2.7";
	public static Table getInstance(){
		if(table==null) new Table0052();
		return table;
	}

	public static final String A = "A";
	public static final String F = "F";
	public static final String W = "W";

	private Table0052(){
		setTableName("Diagnosis Type");
		setOID("");

		putMap("A", "Admitting");
		putMap("F", "Final");
		putMap("W", "Working");

	}

}
