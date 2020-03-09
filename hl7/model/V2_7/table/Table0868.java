package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0868 extends Table{
	private static final String VERSION = "2.7";
	public static Table getInstance(){
		if(table==null) new Table0868();
		return table;
	}

	public static final String C = "C";
	public static final String E = "E";
	public static final String M = "M";
	public static final String N = "N";
	public static final String R = "R";

	private Table0868(){
		setTableName("Telecommunication Expiration Reason");
		setOID("");

		putMap("C", "Corrected");
		putMap("E", "Added in error");
		putMap("M", "Moved");
		putMap("N", "No longer in service");
		putMap("R", "On request");

	}

}
