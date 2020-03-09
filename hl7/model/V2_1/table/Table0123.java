package hl7.model.V2_1.table;

import hl7.bean.table.Table;

public class Table0123 extends Table{
	private static final String VERSION = "2.1";
	public static Table getInstance(){
		if(table==null) new Table0123();
		return table;
	}

	public static final String C = "C";
	public static final String F = "F";
	public static final String I = "I";
	public static final String P = "P";
	public static final String R = "R";
	public static final String S = "S";
	public static final String Y = "Y";
	public static final String Z = "Z";

	private Table0123(){
		setTableName("RESULT STATUS - OBR");
		setOID("2.16.840.1.113883.12.123");

		putMap("C", "Correction of previously transmitted results");
		putMap("F", "Final results - results stored & verified");
		putMap("I", "Specimen in lab, not yet processed.");
		putMap("P", "Preliminary results");
		putMap("R", "Results stored - not yet verified");
		putMap("S", "Procedure scheduled, not done");
		putMap("Y", "No order on record for this test");
		putMap("Z", "No record of this patient");

	}

}
