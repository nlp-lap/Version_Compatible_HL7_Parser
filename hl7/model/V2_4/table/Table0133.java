package hl7.model.V2_4.table;

import hl7.bean.table.Table;

public class Table0133 extends Table{
	private static final String VERSION = "2.4";
	public static Table getInstance(){
		if(table==null) new Table0133();
		return table;
	}

	public static final String AN = "AN";
	public static final String AS = "AS";
	public static final String CM = "CM";
	public static final String NP = "NP";
	public static final String PR = "PR";
	public static final String PS = "PS";
	public static final String RD = "RD";
	public static final String RS = "RS";
	public static final String SN = "SN";

	private Table0133(){
		setTableName("Procedure practitioner identifier code type");
		setOID("2.16.840.1.113883.12.133");

		putMap("AN", "Anesthesiologist/Anesthetist");
		putMap("AS", "Assistant Surgeon");
		putMap("CM", "Certified Nurse Midwife");
		putMap("NP", "Nurse Practitioner");
		putMap("PR", "Procedure MD/ Surgeon");
		putMap("PS", "Primary Surgeon");
		putMap("RD", "Radiologist");
		putMap("RS", "Resident");
		putMap("SN", "Scrub Nurse");

	}

}
