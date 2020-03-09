package hl7.model.V2_5.table;

import hl7.bean.table.Table;

public class Table0241 extends Table{
	private static final String VERSION = "2.5";
	public static Table getInstance(){
		if(table==null) new Table0241();
		return table;
	}

	public static final String D = "D";
	public static final String F = "F";
	public static final String N = "N";
	public static final String R = "R";
	public static final String S = "S";
	public static final String U = "U";
	public static final String W = "W";

	private Table0241(){
		setTableName("Patient Outcome");
		setOID("2.16.840.1.113883.12.241");

		putMap("D", "Died");
		putMap("F", "Fully recovered");
		putMap("N", "Not recovering/unchanged");
		putMap("R", "Recovering");
		putMap("S", "Sequelae");
		putMap("U", "Unknown");
		putMap("W", "Worsening");

	}

}
