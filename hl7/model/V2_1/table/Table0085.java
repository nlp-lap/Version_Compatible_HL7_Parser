package hl7.model.V2_1.table;

import hl7.bean.table.Table;

public class Table0085 extends Table{
	private static final String VERSION = "2.1";
	public static Table getInstance(){
		if(table==null) new Table0085();
		return table;
	}

	public static final String D = "D";
	public static final String F = "F";
	public static final String I = "I";
	public static final String R = "R";
	public static final String S = "S";

	private Table0085(){
		setTableName("OBSERVATION RESULT STATUS");
		setOID("2.16.840.1.113883.12.85");

		putMap("D", "Delete previously transmitted observation");
		putMap("F", "Complete/final results (entered and verified)");
		putMap("I", "Specimen in lab--results pending");
		putMap("R", "Results entered - not verified");
		putMap("S", "Partial results");

	}

}
