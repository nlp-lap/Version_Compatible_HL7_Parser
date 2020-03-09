package hl7.model.V2_4.table;

import hl7.bean.table.Table;

public class Table0366 extends Table{
	private static final String VERSION = "2.4";
	public static Table getInstance(){
		if(table==null) new Table0366();
		return table;
	}

	public static final String L = "L";
	public static final String R = "R";

	private Table0366(){
		setTableName("Local/remote control state");
		setOID("2.16.840.1.113883.12.366");

		putMap("L", "Local");
		putMap("R", "Remote");

	}

}
