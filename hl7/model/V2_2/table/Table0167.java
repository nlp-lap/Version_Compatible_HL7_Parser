package hl7.model.V2_2.table;

import hl7.bean.table.Table;

public class Table0167 extends Table{
	private static final String VERSION = "2.2";
	public static Table getInstance(){
		if(table==null) new Table0167();
		return table;
	}

	public static final String G = "G";
	public static final String N = "N";
	public static final String T = "T";

	private Table0167(){
		setTableName("SUBSTITUTION STATUS");
		setOID("2.16.840.1.113883.12.167");

		putMap("G", "A generic substitution was dispensed");
		putMap("N", "No substitute was dispensed");
		putMap("T", "A therapeutic substitution was dispensed");

	}

}
