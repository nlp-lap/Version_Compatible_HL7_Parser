package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0437 extends Table{
	private static final String VERSION = "2.7";
	public static Table getInstance(){
		if(table==null) new Table0437();
		return table;
	}

	public static final String B = "B";
	public static final String N = "N";
	public static final String W = "W";

	private Table0437(){
		setTableName("Alert Device Code");
		setOID("");

		putMap("B", "Bracelet");
		putMap("N", "Necklace");
		putMap("W", "Wallet Card");

	}

}
