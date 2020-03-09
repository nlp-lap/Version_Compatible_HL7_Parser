package hl7.model.V2_4.table;

import hl7.bean.table.Table;

public class Table0066 extends Table{
	private static final String VERSION = "2.4";
	public static Table getInstance(){
		if(table==null) new Table0066();
		return table;
	}

	public static final String _1 = "1";
	public static final String _2 = "2";
	public static final String _3 = "3";
	public static final String _4 = "4";
	public static final String _5 = "5";
	public static final String _6 = "6";
	public static final String _9 = "9";
	public static final String C = "C";
	public static final String D = "D";
	public static final String F = "F";
	public static final String L = "L";
	public static final String O = "O";
	public static final String P = "P";
	public static final String T = "T";

	private Table0066(){
		setTableName("Employment status");
		setOID("2.16.840.1.113883.12.66");

		putMap("1", "Full time employed");
		putMap("2", "Part time employed");
		putMap("3", "Unemployed");
		putMap("4", "Self-employed,");
		putMap("5", "Retired");
		putMap("6", "On active military duty");
		putMap("9", "Unknown");
		putMap("C", "Contract, per diem");
		putMap("D", "Per Diem");
		putMap("F", "Full Time");
		putMap("L", "Leave of absence (e.g. Family leave, sabbatical, etc.)");
		putMap("O", "Other");
		putMap("P", "Part Time");
		putMap("T", "Temporarily unemployed");

	}

}
