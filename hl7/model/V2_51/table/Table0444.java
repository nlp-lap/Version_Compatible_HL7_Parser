package hl7.model.V2_51.table;

import hl7.bean.table.Table;

public class Table0444 extends Table{
	private static final String VERSION = "2.5.1";
	public static Table getInstance(){
		if(table==null) new Table0444();
		return table;
	}

	public static final String F = "F";
	public static final String G = "G";

	private Table0444(){
		setTableName("Name assembly order");
		setOID("2.16.840.1.113883.12.444");

		putMap("F", "Prefix Family Middle Given Suffix");
		putMap("G", "Prefix Given Middle Family Suffix");

	}

}
