package hl7.model.V2_6.table;

import hl7.bean.table.Table;

public class Table0443 extends Table{
	private static final String VERSION = "2.6";
	public static Table getInstance(){
		if(table==null) new Table0443();
		return table;
	}

	public static final String AD = "AD";
	public static final String AI = "AI";
	public static final String AT = "AT";
	public static final String CP = "CP";
	public static final String FHCP = "FHCP";
	public static final String PI = "PI";
	public static final String PP = "PP";
	public static final String RP = "RP";
	public static final String RT = "RT";
	public static final String TN = "TN";
	public static final String TR = "TR";

	private Table0443(){
		setTableName("Provider role");
		setOID("2.16.840.1.113883.12.443");

		putMap("AD", "Admitting");
		putMap("AI", "Assistant/Alternate Interpreter");
		putMap("AT", "Attending");
		putMap("CP", "Consulting Provider");
		putMap("FHCP", "Family Health Care Professional");
		putMap("PI", "Primary Interpreter");
		putMap("PP", "Primary Care Provider");
		putMap("RP", "Referring Provider");
		putMap("RT", "Referred to Provider");
		putMap("TN", "Technician");
		putMap("TR", "Transcriptionist");

	}

}
