package hl7.model.V2_5.table;

import hl7.bean.table.Table;

public class Table0323 extends Table{
	private static final String VERSION = "2.5";
	public static Table getInstance(){
		if(table==null) new Table0323();
		return table;
	}

	public static final String A = "A";
	public static final String D = "D";
	public static final String U = "U";
	public static final String X = "X";

	private Table0323(){
		setTableName("Action Code");
		setOID("2.16.840.1.113883.12.323");

		putMap("A", "Add/Insert");
		putMap("D", "Delete");
		putMap("U", "Update");
		putMap("X", "No change");

	}

}
