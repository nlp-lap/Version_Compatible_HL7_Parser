package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0881 extends Table{
	private static final String VERSION = "2.7";
	public static Table getInstance(){
		if(table==null) new Table0881();
		return table;
	}

	public static final String B = "B";
	public static final String P = "P";
	public static final String T = "T";

	private Table0881(){
		setTableName("Role Executing Physician");
		setOID("");

		putMap("B", "Both");
		putMap("P", "Professional Part");
		putMap("T", "Technical Part");

	}

}
