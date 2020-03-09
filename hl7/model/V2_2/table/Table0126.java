package hl7.model.V2_2.table;

import hl7.bean.table.Table;

public class Table0126 extends Table{
	private static final String VERSION = "2.2";
	public static Table getInstance(){
		if(table==null) new Table0126();
		return table;
	}

	public static final String CH = "CH";
	public static final String LI = "LI";
	public static final String PG = "PG";
	public static final String RD = "RD";
	public static final String ZO = "ZO";

	private Table0126(){
		setTableName("QUANTITY LIMITED REQUEST");
		setOID("2.16.840.1.113883.12.126");

		putMap("CH", "Characters");
		putMap("LI", "Lines");
		putMap("PG", "Pages");
		putMap("RD", "Records");
		putMap("ZO", "Locally defined");

	}

}
