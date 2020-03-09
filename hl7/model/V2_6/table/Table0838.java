package hl7.model.V2_6.table;

import hl7.bean.table.Table;

public class Table0838 extends Table{
	private static final String VERSION = "2.6";
	public static Table getInstance(){
		if(table==null) new Table0838();
		return table;
	}

	public static final String No_Values_Defined = "No Values Defined";

	private Table0838(){
		setTableName("Problem Perspective");
		setOID("2.16.840.1.113883.12.838");

		putMap("No Values Defined", "");

	}

}
