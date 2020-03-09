package hl7.model.V2_51.table;

import hl7.bean.table.Table;

public class Table0500 extends Table{
	private static final String VERSION = "2.5.1";
	public static Table getInstance(){
		if(table==null) new Table0500();
		return table;
	}

	public static final String F = "F";
	public static final String N = "N";
	public static final String P = "P";

	private Table0500(){
		setTableName("Consent Disclosure Level");
		setOID("2.16.840.1.113883.12.500");

		putMap("F", "Full Disclosure");
		putMap("N", "No Disclosure");
		putMap("P", "Partial Disclosure");

	}

}
