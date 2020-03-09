package hl7.model.V2_4.table;

import hl7.bean.table.Table;

public class Table0002 extends Table{
	private static final String VERSION = "2.4";
	public static Table getInstance(){
		if(table==null) new Table0002();
		return table;
	}

	public static final String A = "A";
	public static final String B = "B";
	public static final String C = "C";
	public static final String D = "D";
	public static final String E = "E";
	public static final String G = "G";
	public static final String I = "I";
	public static final String M = "M";
	public static final String N = "N";
	public static final String O = "O";
	public static final String P = "P";
	public static final String R = "R";
	public static final String S = "S";
	public static final String T = "T";
	public static final String U = "U";
	public static final String W = "W";

	private Table0002(){
		setTableName("Marital status");
		setOID("2.16.840.1.113883.12.2");

		putMap("A", "Separated");
		putMap("B", "Unmarried");
		putMap("C", "Common law");
		putMap("D", "Divorced");
		putMap("E", "Legally Separated");
		putMap("G", "Living together");
		putMap("I", "Interlocutory");
		putMap("M", "Married");
		putMap("N", "Annulled");
		putMap("O", "Other");
		putMap("P", "Domestic partner");
		putMap("R", "Registered domestic partner");
		putMap("S", "Single");
		putMap("T", "Unreported");
		putMap("U", "Unknown");
		putMap("W", "Widowed");

	}

}
