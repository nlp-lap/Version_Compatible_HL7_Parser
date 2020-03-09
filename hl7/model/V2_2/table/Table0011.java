package hl7.model.V2_2.table;

import hl7.bean.table.Table;

public class Table0011 extends Table{
	private static final String VERSION = "2.2";
	public static Table getInstance(){
		if(table==null) new Table0011();
		return table;
	}

	public static final String R = "R";
	public static final String S = "S";

	private Table0011(){
		setTableName("CHARGING SYSTEM");
		setOID("2.16.840.1.113883.12.11");

		putMap("R", "");
		putMap("S", "System that sent the order");

	}

}
