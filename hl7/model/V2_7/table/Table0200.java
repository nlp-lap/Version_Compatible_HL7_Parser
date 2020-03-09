package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0200 extends Table{
	private static final String VERSION = "2.7";
	public static Table getInstance(){
		if(table==null) new Table0200();
		return table;
	}

	public static final String A = "A";
	public static final String B = "B";
	public static final String BAD = "BAD";
	public static final String C = "C";
	public static final String D = "D";
	public static final String I = "I";
	public static final String K = "K";
	public static final String L = "L";
	public static final String M = "M";
	public static final String MSK = "MSK";
	public static final String N = "N";
	public static final String NAV = "NAV";
	public static final String NB = "NB";
	public static final String NOUSE = "NOUSE";
	public static final String P = "P";
	public static final String R = "R";
	public static final String REL = "REL";
	public static final String S = "S";
	public static final String T = "T";
	public static final String TEMP = "TEMP";
	public static final String U = "U";

	private Table0200(){
		setTableName("Name Type");
		setOID("");

		putMap("A", "Assigned");
		putMap("B", "Birth name");
		putMap("BAD", "Bad Name");
		putMap("C", "Adopted Name");
		putMap("D", "Customary Name");
		putMap("I", "Licensing Name");
		putMap("K", "Business name");
		putMap("L", "Official Registry Name");
		putMap("M", "Maiden Name");
		putMap("MSK", "Masked");
		putMap("N", "Nickname");
		putMap("NAV", "Temporarily Unavailable");
		putMap("NB", "Newborn Name");
		putMap("NOUSE", "No Longer To Be Used");
		putMap("P", "Name of Partner/Spouse");
		putMap("R", "Registered Name");
		putMap("REL", "Religious");
		putMap("S", "Pseudonym");
		putMap("T", "Indigenous/Tribal");
		putMap("TEMP", "Temporary Name");
		putMap("U", "Unknown");

	}

}
