package hl7.model.V2_6.table;

import hl7.bean.table.Table;

public class Table0776 extends Table{
	private static final String VERSION = "2.6";
	public static Table getInstance(){
		if(table==null) new Table0776();
		return table;
	}

	public static final String A = "A";
	public static final String I = "I";
	public static final String P = "P";

	private Table0776(){
		setTableName("Item Status");
		setOID("2.16.840.1.113883.12.776");

		putMap("A", "Active");
		putMap("I", "Inactive");
		putMap("P", "Pending Inactive");

	}

}
