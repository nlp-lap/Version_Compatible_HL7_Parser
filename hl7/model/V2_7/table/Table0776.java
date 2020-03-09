package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0776 extends Table{
	private static final String VERSION = "2.7";
	public static Table getInstance(){
		if(table==null) new Table0776();
		return table;
	}

	public static final String A = "A";
	public static final String I = "I";
	public static final String P = "P";

	private Table0776(){
		setTableName("Item Status");
		setOID("");

		putMap("A", "Active");
		putMap("I", "Inactive");
		putMap("P", "Pending Inactive");

	}

}
