package hl7.model.V2_31.table;

import hl7.bean.table.Table;

public class Table0080 extends Table{
	private static final String VERSION = "2.3.1";
	public static Table getInstance(){
		if(table==null) new Table0080();
		return table;
	}

	public static final String A = "A";
	public static final String N = "N";
	public static final String R = "R";
	public static final String S = "S";

	private Table0080(){
		setTableName("Nature of abnormal testing");
		setOID("2.16.840.1.113883.12.80");

		putMap("A", "An age-based population");
		putMap("N", "None - generic normal range");
		putMap("R", "A race-based population");
		putMap("S", "A sex-based population");

	}

}
