package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0131 extends Table{
	private static final String VERSION = "2.7";
	public static Table getInstance(){
		if(table==null) new Table0131();
		return table;
	}

	public static final String C = "C";
	public static final String E = "E";
	public static final String F = "F";
	public static final String I = "I";
	public static final String N = "N";
	public static final String O = "O";
	public static final String S = "S";
	public static final String U = "U";

	private Table0131(){
		setTableName("Contact Role");
		setOID("");

		putMap("C", "Emergency Contact");
		putMap("E", "Employer");
		putMap("F", "Federal Agency");
		putMap("I", "Insurance Company");
		putMap("N", "Next-of-Kin");
		putMap("O", "Other");
		putMap("S", "State Agency");
		putMap("U", "Unknown");

	}

}
