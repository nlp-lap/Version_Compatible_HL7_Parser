package hl7.model.V2_4.table;

import hl7.bean.table.Table;

public class Table0474 extends Table{
	private static final String VERSION = "2.4";
	public static Table getInstance(){
		if(table==null) new Table0474();
		return table;
	}

	public static final String D = "D";
	public static final String F = "F";
	public static final String L = "L";
	public static final String M = "M";
	public static final String S = "S";
	public static final String U = "U";
	public static final String V = "V";

	private Table0474(){
		setTableName("Organization unit type - ORG");
		setOID("2.16.840.1.113883.12.474");

		putMap("D", "Department");
		putMap("F", "Facility");
		putMap("L", "Local market area");
		putMap("M", "Medical Center Area");
		putMap("S", "Subdivision");
		putMap("U", "Subdepartment");
		putMap("V", "Division");

	}

}
