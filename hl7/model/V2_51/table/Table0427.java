package hl7.model.V2_51.table;

import hl7.bean.table.Table;

public class Table0427 extends Table{
	private static final String VERSION = "2.5.1";
	public static Table getInstance(){
		if(table==null) new Table0427();
		return table;
	}

	public static final String B = "B";
	public static final String C = "C";
	public static final String D = "D";
	public static final String E = "E";
	public static final String F = "F";
	public static final String H = "H";
	public static final String I = "I";
	public static final String J = "J";
	public static final String K = "K";
	public static final String O = "O";
	public static final String P = "P";
	public static final String R = "R";
	public static final String S = "S";
	public static final String T = "T";

	private Table0427(){
		setTableName("Risk Management Incident Code");
		setOID("2.16.840.1.113883.12.427");

		putMap("B", "Body fluid exposure");
		putMap("C", "Contaminated Substance");
		putMap("D", "Diet Errors");
		putMap("E", "Equipment problem");
		putMap("F", "Patient fell (not from bed)");
		putMap("H", "Patient fell from bed");
		putMap("I", "Infusion error");
		putMap("J", "Foreign object left during surgery");
		putMap("K", "Sterile precaution violated");
		putMap("O", "Other");
		putMap("P", "Procedure error");
		putMap("R", "Pharmaceutical error");
		putMap("S", "Suicide Attempt");
		putMap("T", "Transfusion error");

	}

}
