package hl7.model.V2_2.table;

import hl7.bean.table.Table;

public class Table0183 extends Table{
	private static final String VERSION = "2.2";
	public static Table getInstance(){
		if(table==null) new Table0183();
		return table;
	}

	public static final String A = "A";
	public static final String I = "I";

	private Table0183(){
		setTableName("Active/Inactive");
		setOID("2.16.840.1.113883.12.183");

		putMap("A", "Active staff");
		putMap("I", "Inactive staff");

	}

}
