package hl7.model.V2_3.table;

import hl7.bean.table.Table;

public class Table0223 extends Table{
	private static final String VERSION = "2.3";
	public static Table getInstance(){
		if(table==null) new Table0223();
		return table;
	}

	public static final String CB = "CB";
	public static final String D = "D";
	public static final String M = "M";
	public static final String S = "S";
	public static final String WU = "WU";

	private Table0223(){
		setTableName("Living Dependency");
		setOID("2.16.840.1.113883.12.223");

		putMap("CB", "Common bath");
		putMap("D", "Spouse dependent");
		putMap("M", "Medical supervision required");
		putMap("S", "Small children");
		putMap("WU", "Walk up");

	}

}
