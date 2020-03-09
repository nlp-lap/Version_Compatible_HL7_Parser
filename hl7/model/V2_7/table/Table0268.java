package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0268 extends Table{
	private static final String VERSION = "2.7";
	public static Table getInstance(){
		if(table==null) new Table0268();
		return table;
	}

	public static final String A = "A";
	public static final String R = "R";
	public static final String X = "X";

	private Table0268(){
		setTableName("Override");
		setOID("");

		putMap("A", "Override allowed");
		putMap("R", "Override required");
		putMap("X", "Override not allowed");

	}

}
