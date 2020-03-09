package hl7.model.V2_31.table;

import hl7.bean.table.Table;

public class Table0220 extends Table{
	private static final String VERSION = "2.3.1";
	public static Table getInstance(){
		if(table==null) new Table0220();
		return table;
	}

	public static final String A = "A";
	public static final String F = "F";
	public static final String I = "I";
	public static final String R = "R";
	public static final String S = "S";
	public static final String U = "U";

	private Table0220(){
		setTableName("Living arrangement");
		setOID("2.16.840.1.113883.12.220");

		putMap("A", "Alone");
		putMap("F", "Family");
		putMap("I", "Institution");
		putMap("R", "Relative");
		putMap("S", "Spouse Only");
		putMap("U", "Unknown");

	}

}
