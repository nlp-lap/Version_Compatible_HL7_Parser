package hl7.model.V2_31.table;

import hl7.bean.table.Table;

public class Table0250 extends Table{
	private static final String VERSION = "2.3.1";
	public static Table getInstance(){
		if(table==null) new Table0250();
		return table;
	}

	public static final String H = "H";
	public static final String I = "I";
	public static final String M = "M";
	public static final String N = "N";
	public static final String S = "S";

	private Table0250(){
		setTableName("Relatedness assessment");
		setOID("2.16.840.1.113883.12.250");

		putMap("H", "Highly probable");
		putMap("I", "Improbable");
		putMap("M", "Moderately probable");
		putMap("N", "Not related");
		putMap("S", "Somewhat probable");

	}

}
