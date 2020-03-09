package hl7.model.V2_51.table;

import hl7.bean.table.Table;

public class Table0442 extends Table{
	private static final String VERSION = "2.5.1";
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
		setOID("2.16.840.1.113883.12.442");

		putMap("D", "Diagnostic");
		putMap("E", "Emergency Room Casualty");
		putMap("P", "Primary Care");
		putMap("T", "Therapeutic");

	}

}
