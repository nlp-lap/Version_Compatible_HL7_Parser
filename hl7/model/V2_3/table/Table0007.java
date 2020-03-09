package hl7.model.V2_3.table;

import hl7.bean.table.Table;

public class Table0007 extends Table{
	private static final String VERSION = "2.3";
	public static Table getInstance(){
		if(table==null) new Table0007();
		return table;
	}

	public static final String A = "A";
	public static final String E = "E";
	public static final String L = "L";
	public static final String R = "R";

	private Table0007(){
		setTableName("Admission Type");
		setOID("2.16.840.1.113883.12.7");

		putMap("A", "Accident");
		putMap("E", "Emergency");
		putMap("L", "Labor and Delivery");
		putMap("R", "Routine");

	}

}
