package hl7.model.V2_3.table;

import hl7.bean.table.Table;

public class Table0326 extends Table{
	private static final String VERSION = "2.3";
	public static Table getInstance(){
		if(table==null) new Table0326();
		return table;
	}

	public static final String A = "A";
	public static final String V = "V";

	private Table0326(){
		setTableName("Visit Indicator");
		setOID("2.16.840.1.113883.12.326");

		putMap("A", "Account level");
		putMap("V", "Visit Level");

	}

}
