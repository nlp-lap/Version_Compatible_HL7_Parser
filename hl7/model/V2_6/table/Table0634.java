package hl7.model.V2_6.table;

import hl7.bean.table.Table;

public class Table0634 extends Table{
	private static final String VERSION = "2.6";
	public static Table getInstance(){
		if(table==null) new Table0634();
		return table;
	}

	public static final String CRT = "CRT";

	private Table0634(){
		setTableName("Item Importance Codes");
		setOID("2.16.840.1.113883.12.634");

		putMap("CRT", "Critical");

	}

}
