package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0169 extends Table{
	private static final String VERSION = "2.7";
	public static Table getInstance(){
		if(table==null) new Table0169();
		return table;
	}

	public static final String C = "C";
	public static final String R = "R";

	private Table0169(){
		setTableName("Reporting Priority");
		setOID("");

		putMap("C", "Call back results");
		putMap("R", "Rush reporting");

	}

}
