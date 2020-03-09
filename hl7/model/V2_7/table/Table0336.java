package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0336 extends Table{
	private static final String VERSION = "2.7";
	public static Table getInstance(){
		if(table==null) new Table0336();
		return table;
	}

	public static final String O = "O";
	public static final String P = "P";
	public static final String S = "S";
	public static final String W = "W";

	private Table0336(){
		setTableName("Referral Reason");
		setOID("");

		putMap("O", "Provider Ordered");
		putMap("P", "Patient Preference");
		putMap("S", "Second Opinion");
		putMap("W", "Work Load");

	}

}
