package hl7.model.V2_2.table;

import hl7.bean.table.Table;

public class Table0144 extends Table{
	private static final String VERSION = "2.2";
	public static Table getInstance(){
		if(table==null) new Table0144();
		return table;
	}

	public static final String _1 = "1";
	public static final String _2 = "2";
	public static final String _3 = "3";
	public static final String _4 = "4";
	public static final String _5 = "5";
	public static final String _6 = "6";
	public static final String _7 = "7";

	private Table0144(){
		setTableName("ELIGIBILITY SOURCE");
		setOID("2.16.840.1.113883.12.144");

		putMap("1", "Insurance Company");
		putMap("2", "Employer");
		putMap("3", "Insured Presented Policy");
		putMap("4", "Insured Presented Card");
		putMap("5", "Signed Statement on File");
		putMap("6", "Verbal Information");
		putMap("7", "None");

	}

}
