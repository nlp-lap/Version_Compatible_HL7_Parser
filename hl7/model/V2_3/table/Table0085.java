package hl7.model.V2_3.table;

import hl7.bean.table.Table;

public class Table0085 extends Table{
	private static final String VERSION = "2.3";
	public static Table getInstance(){
		if(table==null) new Table0085();
		return table;
	}

	public static final String C = "C";
	public static final String D = "D";
	public static final String F = "F";
	public static final String I = "I";
	public static final String P = "P";
	public static final String R = "R";
	public static final String S = "S";
	public static final String U = "U";
	public static final String X = "X";

	private Table0085(){
		setTableName("Observation Result Status Codes Interpretation");
		setOID("2.16.840.1.113883.12.85");

		putMap("C", "Record coming over is a correction and thus replaces a final result");
		putMap("D", "Deletes the OBX record");
		putMap("F", "Final results;  Can only be changed with a corrected result.");
		putMap("I", "Specimen in lab; results pending");
		putMap("P", "Preliminary results");
		putMap("R", "Results entered -- not verified");
		putMap("S", "Partial results");
		putMap("U", "Results status change to Final.  Results did not change (don't transmit test).  E.g., radiology changes status from preliminary to final");
		putMap("X", "Results cannot be obtained for this observation");

	}

}
