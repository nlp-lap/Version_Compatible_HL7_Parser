package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0166 extends Table{
	private static final String VERSION = "2.7";
	public static Table getInstance(){
		if(table==null) new Table0166();
		return table;
	}

	public static final String A = "A";
	public static final String B = "B";

	private Table0166(){
		setTableName("RX Component Type");
		setOID("");

		putMap("A", "Additive");
		putMap("B", "Base");

	}

}
