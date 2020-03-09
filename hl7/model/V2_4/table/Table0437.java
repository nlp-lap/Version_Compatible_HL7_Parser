package hl7.model.V2_4.table;

import hl7.bean.table.Table;

public class Table0437 extends Table{
	private static final String VERSION = "2.4";
	public static Table getInstance(){
		if(table==null) new Table0437();
		return table;
	}

	public static final String B = "B";
	public static final String N = "N";
	public static final String W = "W";

	private Table0437(){
		setTableName("Alert device code");
		setOID("2.16.840.1.113883.12.437");

		putMap("B", "Bracelet");
		putMap("N", "Necklace");
		putMap("W", "Wallet Card");

	}

}
