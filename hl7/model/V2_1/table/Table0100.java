package hl7.model.V2_1.table;

import hl7.bean.table.Table;

public class Table0100 extends Table{
	private static final String VERSION = "2.1";
	public static Table getInstance(){
		if(table==null) new Table0100();
		return table;
	}

	public static final String D = "D";
	public static final String O = "O";
	public static final String R = "R";
	public static final String S = "S";

	private Table0100(){
		setTableName("WHEN TO CHARGE");
		setOID("2.16.840.1.113883.12.100");

		putMap("D", "On discharge");
		putMap("O", "On receipt of order");
		putMap("R", "At time service is completed");
		putMap("S", "At time service is started");

	}

}
