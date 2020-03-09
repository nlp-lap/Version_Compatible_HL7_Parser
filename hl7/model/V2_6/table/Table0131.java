package hl7.model.V2_6.table;

import hl7.bean.table.Table;

public class Table0131 extends Table{
	private static final String VERSION = "2.6";
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
		setOID("2.16.840.1.113883.12.131");

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
