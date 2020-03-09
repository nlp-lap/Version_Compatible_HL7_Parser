package hl7.model.V2_1.table;

import hl7.bean.table.Table;

public class Table0006 extends Table{
	private static final String VERSION = "2.1";
	public static Table getInstance(){
		if(table==null) new Table0006();
		return table;
	}

	public static final String A = "A";
	public static final String B = "B";
	public static final String C = "C";
	public static final String E = "E";
	public static final String J = "J";
	public static final String L = "L";
	public static final String M = "M";
	public static final String N = "N";
	public static final String P = "P";

	private Table0006(){
		setTableName("RELIGION");
		setOID("2.16.840.1.113883.12.6");

		putMap("A", "Atheist");
		putMap("B", "Baptist");
		putMap("C", "Catholic");
		putMap("E", "Episcopalian");
		putMap("J", "Judaism");
		putMap("L", "Lutheran");
		putMap("M", "Church of Latter Day Saints (Mormon)");
		putMap("N", "Hindu");
		putMap("P", "Protestant");

	}

}
