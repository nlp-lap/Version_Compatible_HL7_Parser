package hl7.model.V2_51.table;

import hl7.bean.table.Table;

public class Table0404 extends Table{
	private static final String VERSION = "2.5.1";
	public static Table getInstance(){
		if(table==null) new Table0404();
		return table;
	}

	public static final String _1 = "1";
	public static final String _2 = "2";
	public static final String _3 = "3";
	public static final String _4 = "4";
	public static final String _5 = "5";
	public static final String _6 = "6";

	private Table0404(){
		setTableName("Language Proficiency");
		setOID("2.16.840.1.113883.12.404");

		putMap("1", "Excellent");
		putMap("2", "Good");
		putMap("3", "Fair");
		putMap("4", "Poor");
		putMap("5", "Some (level unknown)");
		putMap("6", "None");

	}

}
