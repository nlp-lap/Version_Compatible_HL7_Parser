package hl7.model.V2_1.table;

import hl7.bean.table.Table;

public class Table0012 extends Table{
	private static final String VERSION = "2.1";
	public static Table getInstance(){
		if(table==null) new Table0012();
		return table;
	}

	public static final String FL = "FL";

	private Table0012(){
		setTableName("STOCK LOCATION");
		setOID("2.16.840.1.113883.12.12");

		putMap("FL", "Filled from floor stock");

	}

}
