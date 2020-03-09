package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0554 extends Table{
	private static final String VERSION = "2.7";
	public static Table getInstance(){
		if(table==null) new Table0554();
		return table;
	}

	public static final String LATE = "LATE";
	public static final String NORM = "NORM";
	public static final String SUB = "SUB";

	private Table0554(){
		setTableName("Invoice Reason Codes");
		setOID("");

		putMap("LATE", "Late Invoice");
		putMap("NORM", "Normal submission");
		putMap("SUB", "Subscriber coverage problem");

	}

}
