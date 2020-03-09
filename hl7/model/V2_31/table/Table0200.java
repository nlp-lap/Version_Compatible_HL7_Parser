package hl7.model.V2_31.table;

import hl7.bean.table.Table;

public class Table0200 extends Table{
	private static final String VERSION = "2.3.1";
	public static Table getInstance(){
		if(table==null) new Table0200();
		return table;
	}

	public static final String A = "A";
	public static final String B = "B";
	public static final String C = "C";
	public static final String D = "D";
	public static final String L = "L";
	public static final String M = "M";
	public static final String P = "P";
	public static final String S = "S";
	public static final String T = "T";
	public static final String U = "U";

	private Table0200(){
		setTableName("Name type");
		setOID("2.16.840.1.113883.12.200");

		putMap("A", "Alias Name");
		putMap("B", "Name at Birth");
		putMap("C", "Adopted Name");
		putMap("D", "Display Name");
		putMap("L", "Legal Name");
		putMap("M", "Maiden Name");
		putMap("P", "Name of Partner/Spouse");
		putMap("S", "Coded Pseudo-Name to ensure anonymity");
		putMap("T", "Tribal/Community Name");
		putMap("U", "Unspecified");

	}

}
