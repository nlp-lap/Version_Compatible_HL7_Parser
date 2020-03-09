package hl7.model.V2_2.table;

import hl7.bean.table.Table;

public class Table0018 extends Table{
	private static final String VERSION = "2.2";
	public static Table getInstance(){
		if(table==null) new Table0018();
		return table;
	}

	public static final String B = "B";
	public static final String E = "E";
	public static final String F = "F";
	public static final String G = "G";
	public static final String J = "J";
	public static final String K = "K";
	public static final String N = "N";
	public static final String P = "P";
	public static final String S = "S";

	private Table0018(){
		setTableName("PATIENT TYPE");
		setOID("2.16.840.1.113883.12.18");

		putMap("B", "");
		putMap("E", "");
		putMap("F", "");
		putMap("G", "");
		putMap("J", "");
		putMap("K", "");
		putMap("N", "");
		putMap("P", "");
		putMap("S", "");

	}

}
