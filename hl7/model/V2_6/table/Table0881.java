package hl7.model.V2_6.table;

import hl7.bean.table.Table;

public class Table0881 extends Table{
	private static final String VERSION = "2.6";
	public static Table getInstance(){
		if(table==null) new Table0881();
		return table;
	}

	public static final String B = "B";
	public static final String P = "P";
	public static final String T = "T";

	private Table0881(){
		setTableName("Role Executing Physician");
		setOID("2.16.840.1.113883.12.881");

		putMap("B", "Both");
		putMap("P", "Professional Part");
		putMap("T", "Technical Part");

	}

}
