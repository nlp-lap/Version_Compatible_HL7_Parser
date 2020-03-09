package hl7.model.V2_5.table;

import hl7.bean.table.Table;

public class Table0092 extends Table{
	private static final String VERSION = "2.5";
	public static Table getInstance(){
		if(table==null) new Table0092();
		return table;
	}

	public static final String R = "R";

	private Table0092(){
		setTableName("Re-Admission Indicator");
		setOID("2.16.840.1.113883.12.92");

		putMap("R", "Re-admission");

	}

}
