package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0262 extends Table{
	private static final String VERSION = "2.7";
	public static Table getInstance(){
		if(table==null) new Table0262();
		return table;
	}

	public static final String F = "F";
	public static final String J = "J";
	public static final String P = "P";
	public static final String Q = "Q";
	public static final String S = "S";
	public static final String W = "W";

	private Table0262(){
		setTableName("Privacy Level");
		setOID("");

		putMap("F", "Isolation");
		putMap("J", "Private room - medically justified");
		putMap("P", "Private room");
		putMap("Q", "Private room - due to overflow");
		putMap("S", "Semi-private room");
		putMap("W", "Ward");

	}

}
