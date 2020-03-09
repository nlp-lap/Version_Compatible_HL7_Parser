package hl7.model.V2_4.table;

import hl7.bean.table.Table;

public class Table0027 extends Table{
	private static final String VERSION = "2.4";
	public static Table getInstance(){
		if(table==null) new Table0027();
		return table;
	}

	public static final String A = "A";
	public static final String P = "P";
	public static final String R = "R";
	public static final String S = "S";
	public static final String T = "T";

	private Table0027(){
		setTableName("Priority");
		setOID("2.16.840.1.113883.12.27");

		putMap("A", "As soon as possible (a priority lower than stat)");
		putMap("P", "Preoperative (to be done prior to surgery)");
		putMap("R", "Routine");
		putMap("S", "Stat (do immediately)");
		putMap("T", "Timing critical (do as near as possible to requested time)");

	}

}
