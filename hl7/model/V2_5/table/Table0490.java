package hl7.model.V2_5.table;

import hl7.bean.table.Table;

public class Table0490 extends Table{
	private static final String VERSION = "2.5";
	public static Table getInstance(){
		if(table==null) new Table0490();
		return table;
	}

	public static final String EX = "EX";
	public static final String QS = "QS";
	public static final String RA = "RA";
	public static final String RB = "RB";
	public static final String RC = "RC";
	public static final String RD = "RD";
	public static final String RE = "RE";
	public static final String RH = "RH";
	public static final String RI = "RI";
	public static final String RM = "RM";
	public static final String RN = "RN";
	public static final String RP = "RP";
	public static final String RR = "RR";
	public static final String RS = "RS";

	private Table0490(){
		setTableName("Specimen Reject Reason");
		setOID("2.16.840.1.113883.12.490");

		putMap("EX", "Expired");
		putMap("QS", "Quantity not sufficient");
		putMap("RA", "Missing patient ID number");
		putMap("RB", "Broken container");
		putMap("RC", "Clotting");
		putMap("RD", "Missing collection date");
		putMap("RE", "Missing patient name");
		putMap("RH", "Hemolysis");
		putMap("RI", "Identification problem");
		putMap("RM", "Labeling");
		putMap("RN", "Contamination");
		putMap("RP", "Missing phlebotomist ID");
		putMap("RR", "Improper storage");
		putMap("RS", "Name misspelling");

	}

}
