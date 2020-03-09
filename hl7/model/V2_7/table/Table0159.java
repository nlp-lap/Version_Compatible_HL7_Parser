package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0159 extends Table{
	private static final String VERSION = "2.7";
	public static Table getInstance(){
		if(table==null) new Table0159();
		return table;
	}

	public static final String D = "D";
	public static final String P = "P";
	public static final String S = "S";

	private Table0159(){
		setTableName("Diet Code Specification Type");
		setOID("");

		putMap("D", "Diet");
		putMap("P", "Preference");
		putMap("S", "Supplement");

	}

}
