package hl7.model.V2_6.table;

import hl7.bean.table.Table;

public class Table0425 extends Table{
	private static final String VERSION = "2.6";
	public static Table getInstance(){
		if(table==null) new Table0425();
		return table;
	}

	public static final String _1 = "1";
	public static final String _2 = "2";
	public static final String _3 = "3";
	public static final String _4 = "4";
	public static final String _5 = "5";

	private Table0425(){
		setTableName("Newborn Code");
		setOID("2.16.840.1.113883.12.425");

		putMap("1", "Born in facility");
		putMap("2", "Transfer in");
		putMap("3", "Born en route");
		putMap("4", "Other");
		putMap("5", "Born at home");

	}

}
