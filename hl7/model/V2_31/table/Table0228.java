package hl7.model.V2_31.table;

import hl7.bean.table.Table;

public class Table0228 extends Table{
	private static final String VERSION = "2.3.1";
	public static Table getInstance(){
		if(table==null) new Table0228();
		return table;
	}

	public static final String C = "C";
	public static final String D = "D";
	public static final String I = "I";
	public static final String M = "M";
	public static final String O = "O";
	public static final String R = "R";
	public static final String S = "S";
	public static final String T = "T";

	private Table0228(){
		setTableName("Diagnosis classification");
		setOID("2.16.840.1.113883.12.228");

		putMap("C", "Consultation");
		putMap("D", "Diagnosis");
		putMap("I", "Invasive procedure not classified elsewhere (I.V., catheter, etc.)");
		putMap("M", "Medication (antibiotic)");
		putMap("O", "Other");
		putMap("R", "Radiological scheduling (not using ICDA codes)");
		putMap("S", "Sign and symptom");
		putMap("T", "Tissue diagnosis");

	}

}
