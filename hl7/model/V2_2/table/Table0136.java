package hl7.model.V2_2.table;

import hl7.bean.table.Table;

public class Table0136 extends Table{
	private static final String VERSION = "2.2";
	public static Table getInstance(){
		if(table==null) new Table0136();
		return table;
	}

	public static final String N = "N";
	public static final String Y = "Y";

	private Table0136(){
		setTableName("Y/N Indicator");
		setOID("2.16.840.1.113883.12.136");

		putMap("N", "No");
		putMap("Y", "Yes");

	}

}
