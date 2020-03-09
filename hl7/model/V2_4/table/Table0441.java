package hl7.model.V2_4.table;

import hl7.bean.table.Table;

public class Table0441 extends Table{
	private static final String VERSION = "2.4";
	public static Table getInstance(){
		if(table==null) new Table0441();
		return table;
	}

	public static final String A = "A";
	public static final String I = "I";
	public static final String L = "L";
	public static final String M = "M";
	public static final String O = "O";
	public static final String P = "P";
	public static final String U = "U";

	private Table0441(){
		setTableName("Immunization registry status");
		setOID("2.16.840.1.113883.12.441");

		putMap("A", "Active");
		putMap("I", "Inactive");
		putMap("L", "Inactive - Lost to follow-up (cancel contract)");
		putMap("M", "Inactive - Moved or gone elsewhere (cancel contract)");
		putMap("O", "Other");
		putMap("P", "Inactive - Permanently inactive (Do not reactivate or add new entries to the record)");
		putMap("U", "Unknown");

	}

}
