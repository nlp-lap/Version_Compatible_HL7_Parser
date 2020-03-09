package hl7.model.V2_5.table;

import hl7.bean.table.Table;

public class Table0168 extends Table{
	private static final String VERSION = "2.5";
	public static Table getInstance(){
		if(table==null) new Table0168();
		return table;
	}

	public static final String A = "A";
	public static final String B = "B";
	public static final String C = "C";
	public static final String P = "P";
	public static final String R = "R";
	public static final String S = "S";
	public static final String T = "T";

	private Table0168(){
		setTableName("Processing priority");
		setOID("2.16.840.1.113883.12.168");

		putMap("A", "As soon as possible (a priority lower than stat)");
		putMap("B", "Do at bedside or portable (may be used with other codes)");
		putMap("C", "Measure continuously (e.g., arterial line blood pressure)");
		putMap("P", "Preoperative (to be done prior to surgery)");
		putMap("R", "Routine");
		putMap("S", "Stat (do immediately)");
		putMap("T", "Timing critical (do as near as possible to requested time)");

	}

}
