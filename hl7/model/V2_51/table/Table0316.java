package hl7.model.V2_51.table;

import hl7.bean.table.Table;

public class Table0316 extends Table{
	private static final String VERSION = "2.5.1";
	public static Table getInstance(){
		if(table==null) new Table0316();
		return table;
	}

	public static final String F = "F";
	public static final String I = "I";
	public static final String N = "N";
	public static final String P = "P";
	public static final String R = "R";
	public static final String U = "U";
	public static final String Y = "Y";

	private Table0316(){
		setTableName("Organ Donor Code");
		setOID("2.16.840.1.113883.12.316");

		putMap("F", "Yes, patient is a documented donor, but documentation is not on file");
		putMap("I", "No, patient is not a documented donor, but information was provided");
		putMap("N", "No, patient has not agreed to be a donor");
		putMap("P", "Patient leaves organ donation decision to a specific person");
		putMap("R", "Patient leaves organ donation decision to relatives");
		putMap("U", "Unknown");
		putMap("Y", "Yes, patient is a documented donor and documentation is on file");

	}

}
