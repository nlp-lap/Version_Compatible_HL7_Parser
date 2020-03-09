package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0231 extends Table{
	private static final String VERSION = "2.7";
	public static Table getInstance(){
		if(table==null) new Table0231();
		return table;
	}

	public static final String F = "F";
	public static final String N = "N";
	public static final String P = "P";

	private Table0231(){
		setTableName("Student Status");
		setOID("");

		putMap("F", "Full-time student");
		putMap("N", "Not a student");
		putMap("P", "Part-time student");

	}

}
