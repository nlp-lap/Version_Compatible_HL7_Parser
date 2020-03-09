package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0634 extends Table{
	private static final String VERSION = "2.7";
	public static Table getInstance(){
		if(table==null) new Table0634();
		return table;
	}

	public static final String CRT = "CRT";

	private Table0634(){
		setTableName("Item Importance Codes");
		setOID("");

		putMap("CRT", "Critical");

	}

}
