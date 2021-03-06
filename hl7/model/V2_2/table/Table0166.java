package hl7.model.V2_2.table;

import hl7.bean.table.Table;

public class Table0166 extends Table{
	private static final String VERSION = "2.2";
	public static Table getInstance(){
		if(table==null) new Table0166();
		return table;
	}

	public static final String A = "A";
	public static final String B = "B";

	private Table0166(){
		setTableName("RX COMPONENT TYPE");
		setOID("2.16.840.1.113883.12.166");

		putMap("A", "Additive");
		putMap("B", "Base");

	}

}
