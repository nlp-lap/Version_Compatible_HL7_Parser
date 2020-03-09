package hl7.model.V2_5.table;

import hl7.bean.table.Table;

public class Table0215 extends Table{
	private static final String VERSION = "2.5";
	public static Table getInstance(){
		if(table==null) new Table0215();
		return table;
	}

	public static final String F = "F";
	public static final String N = "N";
	public static final String O = "O";
	public static final String U = "U";

	private Table0215(){
		setTableName("Publicity Code");
		setOID("2.16.840.1.113883.12.215");

		putMap("F", "Family only");
		putMap("N", "No Publicity");
		putMap("O", "Other");
		putMap("U", "Unknown");

	}

}
