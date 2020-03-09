package hl7.model.V2_51.table;

import hl7.bean.table.Table;

public class Table0329 extends Table{
	private static final String VERSION = "2.5.1";
	public static Table getInstance(){
		if(table==null) new Table0329();
		return table;
	}

	public static final String A = "A";
	public static final String E = "E";

	private Table0329(){
		setTableName("Quantity method");
		setOID("2.16.840.1.113883.12.329");

		putMap("A", "Actual count");
		putMap("E", "Estimated (see comment)");

	}

}
