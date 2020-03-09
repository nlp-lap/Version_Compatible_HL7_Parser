package hl7.model.V2_4.table;

import hl7.bean.table.Table;

public class Table0169 extends Table{
	private static final String VERSION = "2.4";
	public static Table getInstance(){
		if(table==null) new Table0169();
		return table;
	}

	public static final String C = "C";
	public static final String R = "R";

	private Table0169(){
		setTableName("Reporting priority");
		setOID("2.16.840.1.113883.12.169");

		putMap("C", "Call back results");
		putMap("R", "Rush reporting");

	}

}
