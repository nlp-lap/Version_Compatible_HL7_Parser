package hl7.model.V2_4.table;

import hl7.bean.table.Table;

public class Table0270 extends Table{
	private static final String VERSION = "2.4";
	public static Table getInstance(){
		if(table==null) new Table0270();
		return table;
	}

	public static final String AR = "AR";
	public static final String CD = "CD";
	public static final String CN = "CN";
	public static final String DI = "DI";
	public static final String DS = "DS";
	public static final String ED = "ED";
	public static final String HP = "HP";
	public static final String OP = "OP";
	public static final String PC = "PC";
	public static final String PH = "PH";
	public static final String PN = "PN";
	public static final String PR = "PR";
	public static final String SP = "SP";
	public static final String TS = "TS";

	private Table0270(){
		setTableName("Document type");
		setOID("2.16.840.1.113883.12.270");

		putMap("AR", "Autopsy report");
		putMap("CD", "Cardiodiagnostics");
		putMap("CN", "Consultation");
		putMap("DI", "Diagnostic imaging");
		putMap("DS", "Discharge summary");
		putMap("ED", "Emergency department report");
		putMap("HP", "History and physical examination");
		putMap("OP", "Operative report");
		putMap("PC", "Psychiatric consultation");
		putMap("PH", "Psychiatric history and physical examination");
		putMap("PN", "Procedure note");
		putMap("PR", "Progress note");
		putMap("SP", "Surgical pathology");
		putMap("TS", "Transfer summary");

	}

}
