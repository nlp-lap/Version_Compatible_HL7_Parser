package hl7.model.V2_5.table;

import hl7.bean.table.Table;

public class Table0389 extends Table{
	private static final String VERSION = "2.5";
	public static Table getInstance(){
		if(table==null) new Table0389();
		return table;
	}

	public static final String D = "D";
	public static final String F = "F";
	public static final String O = "O";
	public static final String R = "R";

	private Table0389(){
		setTableName("Analyte repeat status");
		setOID("2.16.840.1.113883.12.389");

		putMap("D", "Repeated with dilution");
		putMap("F", "Reflex test");
		putMap("O", "Original, first run");
		putMap("R", "Repeated without dilution");

	}

}
