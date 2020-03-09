package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0137 extends Table{
	private static final String VERSION = "2.7";
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
		setTableName("Mail Claim Party");
		setOID("");

		putMap("E", "Employer");
		putMap("G", "Guarantor");
		putMap("I", "Insurance company");
		putMap("O", "Other");
		putMap("P", "Patient");

	}

}
