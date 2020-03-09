package hl7.model.V2_6.table;

import hl7.bean.table.Table;

public class Table0836 extends Table{
	private static final String VERSION = "2.6";
	public static Table getInstance(){
		if(table==null) new Table0836();
		return table;
	}

	public static final String No_Values_Defined = "No Values Defined";

	private Table0836(){
		setTableName("Problem Severity");
		setOID("2.16.840.1.113883.12.836");

		putMap("No Values Defined", "");

	}

}
