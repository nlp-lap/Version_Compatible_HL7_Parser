package hl7.model.V2_4.table;

import hl7.bean.table.Table;

public class Table0403 extends Table{
	private static final String VERSION = "2.4";
	public static Table getInstance(){
		if(table==null) new Table0403();
		return table;
	}

	public static final String _1 = "1";
	public static final String _2 = "2";
	public static final String _3 = "3";
	public static final String _4 = "4";
	public static final String _5 = "5";

	private Table0403(){
		setTableName("Language ability");
		setOID("2.16.840.1.113883.12.403");

		putMap("1", "Read");
		putMap("2", "Write");
		putMap("3", "Speak");
		putMap("4", "Understand");
		putMap("5", "Sign");

	}

}
