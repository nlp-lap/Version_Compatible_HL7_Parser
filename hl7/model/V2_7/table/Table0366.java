package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0366 extends Table{
	private static final String VERSION = "2.7";
	public static Table getInstance(){
		if(table==null) new Table0366();
		return table;
	}

	public static final String L = "L";
	public static final String R = "R";

	private Table0366(){
		setTableName("Local/Remote Control State");
		setOID("");

		putMap("L", "Local");
		putMap("R", "Remote");

	}

}
