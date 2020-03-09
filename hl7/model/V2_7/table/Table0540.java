package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0540 extends Table{
	private static final String VERSION = "2.7";
	public static Table getInstance(){
		if(table==null) new Table0540();
		return table;
	}

	public static final String L = "L";
	public static final String R = "R";
	public static final String T = "T";

	private Table0540(){
		setTableName("Inactive Reason Code");
		setOID("");

		putMap("L", "Leave of Absence");
		putMap("R", "Retired");
		putMap("T", "Termination");

	}

}
