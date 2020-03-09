package hl7.model.V2_5.table;

import hl7.bean.table.Table;

public class Table0231 extends Table{
	private static final String VERSION = "2.5";
	public static Table getInstance(){
		if(table==null) new Table0231();
		return table;
	}

	public static final String F = "F";
	public static final String N = "N";
	public static final String P = "P";

	private Table0231(){
		setTableName("Student Status");
		setOID("2.16.840.1.113883.12.231");

		putMap("F", "Full-time student");
		putMap("N", "Not a student");
		putMap("P", "Part-time student");

	}

}
