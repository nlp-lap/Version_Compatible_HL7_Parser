package hl7.model.V2_51.table;

import hl7.bean.table.Table;

public class Table0529 extends Table{
	private static final String VERSION = "2.5.1";
	public static Table getInstance(){
		if(table==null) new Table0529();
		return table;
	}

	public static final String D = "D";
	public static final String H = "H";
	public static final String L = "L";
	public static final String M = "M";
	public static final String S = "S";
	public static final String Y = "Y";

	private Table0529(){
		setTableName("Precision");
		setOID("2.16.840.1.113883.12.529");

		putMap("D", "day");
		putMap("H", "hour");
		putMap("L", "month");
		putMap("M", "minute");
		putMap("S", "second");
		putMap("Y", "year");

	}

}
