package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0616 extends Table{
	private static final String VERSION = "2.7";
	public static Table getInstance(){
		if(table==null) new Table0616();
		return table;
	}

	public static final String C = "C";
	public static final String E = "E";
	public static final String M = "M";
	public static final String R = "R";

	private Table0616(){
		setTableName("Address Expiration Reason");
		setOID("");

		putMap("C", "Corrected");
		putMap("E", "Added in error");
		putMap("M", "Moved");
		putMap("R", "On request");

	}

}
