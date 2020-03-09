package hl7.model.V2_5.table;

import hl7.bean.table.Table;

public class Table0398 extends Table{
	private static final String VERSION = "2.5";
	public static Table getInstance(){
		if(table==null) new Table0398();
		return table;
	}

	public static final String F = "F";
	public static final String I = "I";

	private Table0398(){
		setTableName("Continuation style code");
		setOID("2.16.840.1.113883.12.398");

		putMap("F", "Fragmentation");
		putMap("I", "Interactive Continuation");

	}

}
