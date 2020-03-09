package hl7.model.V2_4.table;

import hl7.bean.table.Table;

public class Table0052 extends Table{
	private static final String VERSION = "2.4";
	public static Table getInstance(){
		if(table==null) new Table0052();
		return table;
	}

	public static final String A = "A";
	public static final String F = "F";
	public static final String W = "W";

	private Table0052(){
		setTableName("Diagnosis type");
		setOID("2.16.840.1.113883.12.52");

		putMap("A", "Admitting");
		putMap("F", "Final");
		putMap("W", "Working");

	}

}
