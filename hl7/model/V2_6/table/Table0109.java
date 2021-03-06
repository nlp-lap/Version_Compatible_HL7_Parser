package hl7.model.V2_6.table;

import hl7.bean.table.Table;

public class Table0109 extends Table{
	private static final String VERSION = "2.6";
	public static Table getInstance(){
		if(table==null) new Table0109();
		return table;
	}

	public static final String R = "R";
	public static final String S = "S";

	private Table0109(){
		setTableName("Report priority");
		setOID("2.16.840.1.113883.12.109");

		putMap("R", "Routine");
		putMap("S", "Stat");

	}

}
