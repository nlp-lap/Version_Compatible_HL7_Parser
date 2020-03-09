package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0092 extends Table{
	private static final String VERSION = "2.7";
	public static Table getInstance(){
		if(table==null) new Table0092();
		return table;
	}

	public static final String R = "R";

	private Table0092(){
		setTableName("Re-Admission Indicator");
		setOID("");

		putMap("R", "Re-admission");

	}

}
