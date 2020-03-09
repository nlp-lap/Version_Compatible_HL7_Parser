package hl7.model.V2_6.table;

import hl7.bean.table.Table;

public class Table0868 extends Table{
	private static final String VERSION = "2.6";
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
		setTableName("Telecommunication expiration reason");
		setOID("2.16.840.1.113883.12.868");

		putMap("C", "Corrected");
		putMap("E", "Added in error");
		putMap("M", "Moved");
		putMap("N", "No longer in service");
		putMap("R", "On request");

	}

}
