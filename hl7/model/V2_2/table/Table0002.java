package hl7.model.V2_2.table;

import hl7.bean.table.Table;

public class Table0002 extends Table{
	private static final String VERSION = "2.2";
	public static Table getInstance(){
		if(table==null) new Table0002();
		return table;
	}

	public static final String A = "A";
	public static final String D = "D";
	public static final String M = "M";
	public static final String S = "S";
	public static final String W = "W";

	private Table0002(){
		setTableName("MARITAL STATUS");
		setOID("2.16.840.1.113883.12.2");

		putMap("A", "Separated");
		putMap("D", "Divorced");
		putMap("M", "Married");
		putMap("S", "Single");
		putMap("W", "Widowed");

	}

}
