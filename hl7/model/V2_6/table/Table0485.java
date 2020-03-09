package hl7.model.V2_6.table;

import hl7.bean.table.Table;

public class Table0485 extends Table{
	private static final String VERSION = "2.6";
	public static Table getInstance(){
		if(table==null) new Table0485();
		return table;
	}

	public static final String A = "A";
	public static final String C = "C";
	public static final String P = "P";
	public static final String PRN = "PRN";
	public static final String R = "R";
	public static final String S = "S";
	public static final String T = "T";
	public static final String TD_integer_ = "TD<integer>";
	public static final String TH_integer_ = "TH<integer>";
	public static final String TL_integer_ = "TL<integer>";
	public static final String TM_integer_ = "TM<integer>";
	public static final String TS_integer_ = "TS<integer>";
	public static final String TW_integer_ = "TW<integer>";

	private Table0485(){
		setTableName("Extended Priority Codes");
		setOID("2.16.840.1.113883.12.485");

		putMap("A", "ASAP");
		putMap("C", "Callback");
		putMap("P", "Preop");
		putMap("PRN", "As needed");
		putMap("R", "Routine");
		putMap("S", "Stat");
		putMap("T", "Timing critical");
		putMap("TD<integer>", "");
		putMap("TH<integer>", "");
		putMap("TL<integer>", "");
		putMap("TM<integer>", "");
		putMap("TS<integer>", "");
		putMap("TW<integer>", "");

	}

}
