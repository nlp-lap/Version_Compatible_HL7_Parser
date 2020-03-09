package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0085 extends Table{
	private static final String VERSION = "2.7";
	public static Table getInstance(){
		if(table==null) new Table0085();
		return table;
	}

	public static final String C = "C";
	public static final String D = "D";
	public static final String F = "F";
	public static final String I = "I";
	public static final String N = "N";
	public static final String O = "O";
	public static final String P = "P";
	public static final String R = "R";
	public static final String S = "S";
	public static final String U = "U";
	public static final String W = "W";
	public static final String X = "X";

	private Table0085(){
		setTableName("Observation Result Status Codes Interpretation");
		setOID("");

		putMap("C", "Record coming over is a correction and thus replaces a final result");
		putMap("D", "Deletes the OBX record");
		putMap("F", "Final results; Can only be changed with a corrected result.");
		putMap("I", "Specimen in lab; results pending");
		putMap("N", "Not asked; used to affirmatively document that the observation identified in the OBX was not sought when the universal service ID in OBR-4 implies that it would be sought.");
		putMap("O", "Order detail description only (no result)");
		putMap("P", "Preliminary results");
		putMap("R", "Results entered -- not verified");
		putMap("S", "Partial results.   Deprecated. Retained only for backward compatibility as of V2.6.");
		putMap("U", "Results status change to final without retransmitting results already sent as 'preliminary.'  E.g., radiology changes status from preliminary to final");
		putMap("W", "Post original as wrong, e.g., transmitted for wrong patient");
		putMap("X", "Results cannot be obtained for this observation");

	}

}
