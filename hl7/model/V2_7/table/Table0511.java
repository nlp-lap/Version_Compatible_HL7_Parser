package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0511 extends Table{
	private static final String VERSION = "2.7";
	public static Table getInstance(){
		if(table==null) new Table0511();
		return table;
	}

	public static final String C = "C";
	public static final String D = "D";
	public static final String F = "F";
	public static final String O = "O";
	public static final String P = "P";
	public static final String W = "W";

	private Table0511(){
		setTableName("BP Observation Status Codes Interpretation");
		setOID("");

		putMap("C", "Record coming over is a correction and thus replaces a final status");
		putMap("D", "Deletes the BPX record");
		putMap("F", "Final status; Can only be changed with a corrected status");
		putMap("O", "Order detail description only (no status)");
		putMap("P", "Preliminary status");
		putMap("W", "Post original as wrong, e.g., transmitted for wrong patient");

	}

}
