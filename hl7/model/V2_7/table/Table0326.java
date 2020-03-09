package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0326 extends Table{
	private static final String VERSION = "2.7";
	public static Table getInstance(){
		if(table==null) new Table0326();
		return table;
	}

	public static final String A = "A";
	public static final String V = "V";

	private Table0326(){
		setTableName("Visit Indicator");
		setOID("");

		putMap("A", "Account level (default)");
		putMap("V", "Visit level");

	}

}
