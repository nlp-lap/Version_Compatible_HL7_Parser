package hl7.model.V2_2.table;

import hl7.bean.table.Table;

public class Table0012 extends Table{
	private static final String VERSION = "2.2";
	public static Table getInstance(){
		if(table==null) new Table0012();
		return table;
	}

	public static final String AN = "AN";
	public static final String FL = "FL";

	private Table0012(){
		setTableName("STOCK LOCATION");
		setOID("2.16.840.1.113883.12.12");

		putMap("AN", "Filled from ancillary department stock");
		putMap("FL", "Filled from floor stock");

	}

}
