package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0442 extends Table{
	private static final String VERSION = "2.7";
	public static Table getInstance(){
		if(table==null) new Table0442();
		return table;
	}

	public static final String D = "D";
	public static final String E = "E";
	public static final String P = "P";
	public static final String T = "T";

	private Table0442(){
		setTableName("Location Service Code");
		setOID("");

		putMap("D", "Diagnostic");
		putMap("E", "Emergency Room Casualty");
		putMap("P", "Primary Care");
		putMap("T", "Therapeutic");

	}

}
