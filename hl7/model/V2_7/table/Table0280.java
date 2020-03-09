package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0280 extends Table{
	private static final String VERSION = "2.7";
	public static Table getInstance(){
		if(table==null) new Table0280();
		return table;
	}

	public static final String A = "A";
	public static final String R = "R";
	public static final String S = "S";

	private Table0280(){
		setTableName("Referral Priority");
		setOID("");

		putMap("A", "ASAP");
		putMap("R", "Routine");
		putMap("S", "STAT");

	}

}
