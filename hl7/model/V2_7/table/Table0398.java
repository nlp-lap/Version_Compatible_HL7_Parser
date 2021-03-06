package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0398 extends Table{
	private static final String VERSION = "2.7";
	public static Table getInstance(){
		if(table==null) new Table0398();
		return table;
	}

	public static final String F = "F";
	public static final String I = "I";

	private Table0398(){
		setTableName("Continuation Style Code");
		setOID("");

		putMap("F", "Fragmentation");
		putMap("I", "Interactive Continuation");

	}

}
