package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0838 extends Table{
	private static final String VERSION = "2.7";
	public static Table getInstance(){
		if(table==null) new Table0838();
		return table;
	}

	public static final String No_Values_Defined = "No Values Defined";

	private Table0838(){
		setTableName("Problem Perspective");
		setOID("");

		putMap("No Values Defined", "");

	}

}
