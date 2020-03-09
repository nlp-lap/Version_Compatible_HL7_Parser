package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0126 extends Table{
	private static final String VERSION = "2.7";
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
		setTableName("Quantity Limited Request");
		setOID("");

		putMap("CH", "Characters");
		putMap("LI", "Lines");
		putMap("PG", "Pages");
		putMap("RD", "Records");
		putMap("ZO", "Locally defined");

	}

}
