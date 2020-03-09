package hl7.model.V2_51.table;

import hl7.bean.table.Table;

public class Table0540 extends Table{
	private static final String VERSION = "2.5.1";
	public static Table getInstance(){
		if(table==null) new Table0540();
		return table;
	}

	public static final String L = "L";
	public static final String R = "R";
	public static final String T = "T";

	private Table0540(){
		setTableName("Inactive Reason Code");
		setOID("2.16.840.1.113883.12.540");

		putMap("L", "Leave of Absence");
		putMap("R", "Retired");
		putMap("T", "Termination");

	}

}
