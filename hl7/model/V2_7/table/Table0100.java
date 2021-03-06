package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0100 extends Table{
	private static final String VERSION = "2.7";
	public static Table getInstance(){
		if(table==null) new Table0100();
		return table;
	}

	public static final String D = "D";
	public static final String O = "O";
	public static final String R = "R";
	public static final String S = "S";
	public static final String T = "T";

	private Table0100(){
		setTableName("Invocation event");
		setOID("");

		putMap("D", "On discharge");
		putMap("O", "On receipt of order");
		putMap("R", "At time service is completed");
		putMap("S", "At time service is started");
		putMap("T", "At a designated date/time");

	}

}
