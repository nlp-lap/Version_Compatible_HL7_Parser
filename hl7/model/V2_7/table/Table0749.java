package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0749 extends Table{
	private static final String VERSION = "2.7";
	public static Table getInstance(){
		if(table==null) new Table0749();
		return table;
	}

	public static final String _0 = "0";
	public static final String _1 = "1";
	public static final String _2 = "2";
	public static final String _3 = "3";

	private Table0749(){
		setTableName("DRG Grouping Status");
		setOID("");

		putMap("0", "Valid code; not used for grouping");
		putMap("1", "Valid code; used for grouping");
		putMap("2", "Invalid code; not used for grouping");
		putMap("3", "Invalid code; code is relevant for grouping");

	}

}
