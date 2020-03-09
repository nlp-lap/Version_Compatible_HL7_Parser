package hl7.model.V2_5.table;

import hl7.bean.table.Table;

public class Table0503 extends Table{
	private static final String VERSION = "2.5";
	public static Table getInstance(){
		if(table==null) new Table0503();
		return table;
	}

	public static final String C = "C";
	public static final String R = "R";
	public static final String S = "S";

	private Table0503(){
		setTableName("Sequence/Results Flag");
		setOID("2.16.840.1.113883.12.503");

		putMap("C", "Cyclical");
		putMap("R", "Reserved for future use");
		putMap("S", "Sequential");

	}

}
