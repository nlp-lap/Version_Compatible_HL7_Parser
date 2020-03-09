package hl7.model.V2_2.table;

import hl7.bean.table.Table;

public class Table0145 extends Table{
	private static final String VERSION = "2.2";
	public static Table getInstance(){
		if(table==null) new Table0145();
		return table;
	}

	public static final String _2ICU = "2ICU";
	public static final String _2PRI = "2PRI";
	public static final String _2SPR = "2SPR";
	public static final String ICU = "ICU";
	public static final String PRI = "PRI";
	public static final String SPR = "SPR";

	private Table0145(){
		setTableName("Room Type");
		setOID("2.16.840.1.113883.12.145");

		putMap("2ICU", "Second Intensive Care Unit");
		putMap("2PRI", "Second Private Room");
		putMap("2SPR", "Second Semi-private Room");
		putMap("ICU", "Intensive Care Unit");
		putMap("PRI", "Private Room");
		putMap("SPR", "Semi-private Room");

	}

}
