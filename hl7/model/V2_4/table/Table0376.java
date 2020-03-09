package hl7.model.V2_4.table;

import hl7.bean.table.Table;

public class Table0376 extends Table{
	private static final String VERSION = "2.4";
	public static Table getInstance(){
		if(table==null) new Table0376();
		return table;
	}

	public static final String C37 = "C37";
	public static final String CAMB = "CAMB";
	public static final String CATM = "CATM";
	public static final String CFRZ = "CFRZ";
	public static final String CREF = "CREF";
	public static final String PRTL = "PRTL";

	private Table0376(){
		setTableName("Special handling considerations");
		setOID("2.16.840.1.113883.12.376");

		putMap("C37", "Critical maintain at 37C (e.g., cryoglobulin specimen");
		putMap("CAMB", "Critical ambient temperature");
		putMap("CATM", "Critical do not expose to atmosphere - Do not uncap");
		putMap("CFRZ", "Critical Frozen");
		putMap("CREF", "Critical refrigerated");
		putMap("PRTL", "Protect from light");

	}

}
