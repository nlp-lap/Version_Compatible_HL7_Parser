package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0444 extends Table{
	private static final String VERSION = "2.7";
	public static Table getInstance(){
		if(table==null) new Table0444();
		return table;
	}

	public static final String F = "F";
	public static final String G = "G";

	private Table0444(){
		setTableName("Name Assembly Order");
		setOID("");

		putMap("F", "Prefix Family Middle Given Suffix");
		putMap("G", "Prefix Given Middle Family Suffix");

	}

}
