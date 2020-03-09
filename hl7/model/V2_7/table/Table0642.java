package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0642 extends Table{
	private static final String VERSION = "2.7";
	public static Table getInstance(){
		if(table==null) new Table0642();
		return table;
	}

	public static final String D = "D";
	public static final String M = "M";
	public static final String O = "O";

	private Table0642(){
		setTableName("Reorder Theory Codes");
		setOID("");

		putMap("D", "DOP/DOQ");
		putMap("M", "MIN/MAX");
		putMap("O", "Override");

	}

}
