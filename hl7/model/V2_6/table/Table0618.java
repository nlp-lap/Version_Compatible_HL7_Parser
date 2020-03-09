package hl7.model.V2_6.table;

import hl7.bean.table.Table;

public class Table0618 extends Table{
	private static final String VERSION = "2.6";
	public static Table getInstance(){
		if(table==null) new Table0618();
		return table;
	}

	public static final String LI = "LI";
	public static final String UL = "UL";
	public static final String UP = "UP";

	private Table0618(){
		setTableName("Protection Code");
		setOID("2.16.840.1.113883.12.618");

		putMap("LI", "Listed");
		putMap("UL", "Unlisted (Should not appear in directories)");
		putMap("UP", "Unpublished");

	}

}
