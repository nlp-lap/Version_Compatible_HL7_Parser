package hl7.model.V2_6.table;

import hl7.bean.table.Table;

public class Table0625 extends Table{
	private static final String VERSION = "2.6";
	public static Table getInstance(){
		if(table==null) new Table0625();
		return table;
	}

	public static final String _1 = "1";
	public static final String _2 = "2";
	public static final String _3 = "3";

	private Table0625(){
		setTableName("Item Status Codes");
		setOID("2.16.840.1.113883.12.625");

		putMap("1", "Active");
		putMap("2", "Pending Inactive");
		putMap("3", "Inactive");

	}

}
