package hl7.model.V2_2.table;

import hl7.bean.table.Table;

public class Table0137 extends Table{
	private static final String VERSION = "2.2";
	public static Table getInstance(){
		if(table==null) new Table0137();
		return table;
	}

	public static final String E = "E";
	public static final String G = "G";
	public static final String I = "I";
	public static final String O = "O";
	public static final String P = "P";

	private Table0137(){
		setTableName("MAIL CLAIM PARTY");
		setOID("2.16.840.1.113883.12.137");

		putMap("E", "Employer");
		putMap("G", "Guarantor");
		putMap("I", "Insurance Company");
		putMap("O", "Other");
		putMap("P", "Patient");

	}

}
