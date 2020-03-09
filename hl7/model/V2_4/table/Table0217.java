package hl7.model.V2_4.table;

import hl7.bean.table.Table;

public class Table0217 extends Table{
	private static final String VERSION = "2.4";
	public static Table getInstance(){
		if(table==null) new Table0217();
		return table;
	}

	public static final String _1 = "1";
	public static final String _2 = "2";
	public static final String _3 = "3";

	private Table0217(){
		setTableName("Visit priority code");
		setOID("2.16.840.1.113883.12.217");

		putMap("1", "Emergency");
		putMap("2", "Urgent");
		putMap("3", "Elective");

	}

}
