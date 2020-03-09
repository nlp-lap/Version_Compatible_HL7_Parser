package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0553 extends Table{
	private static final String VERSION = "2.7";
	public static Table getInstance(){
		if(table==null) new Table0553();
		return table;
	}

	public static final String AA = "AA";
	public static final String AI = "AI";
	public static final String CA = "CA";
	public static final String CG = "CG";
	public static final String CL = "CL";
	public static final String CN = "CN";
	public static final String CP = "CP";
	public static final String CQ = "CQ";
	public static final String EA = "EA";
	public static final String OA = "OA";
	public static final String OR = "OR";
	public static final String PA = "PA";
	public static final String PD = "PD";
	public static final String RA = "RA";
	public static final String RC = "RC";
	public static final String RU = "RU";
	public static final String SA = "SA";

	private Table0553(){
		setTableName("Invoice Control Code");
		setOID("");

		putMap("AA", "Authorization request for inpatient admission");
		putMap("AI", "Combined Authorization and Adjudication request");
		putMap("CA", "Cancel Authorization request");
		putMap("CG", "Cancel Invoice Product/Service Group");
		putMap("CL", "Cancel Invoice Product/Service Line Item");
		putMap("CN", "Cancel Invoice");
		putMap("CP", "Copy of Invoice");
		putMap("CQ", "Coverage Register Query");
		putMap("EA", "Authorization request for inpatient stay extension");
		putMap("OA", "Original Authorization");
		putMap("OR", "Original Invoice");
		putMap("PA", "Pre-Authorization");
		putMap("PD", "Pre-Determination Invoice");
		putMap("RA", "Re-Assessment");
		putMap("RC", "Referral Pre-Authorization");
		putMap("RU", "Referral authorization");
		putMap("SA", "Special Authorization");

	}

}
