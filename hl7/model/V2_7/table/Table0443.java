package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0443 extends Table{
	private static final String VERSION = "2.7";
	public static Table getInstance(){
		if(table==null) new Table0443();
		return table;
	}

	public static final String AD = "AD";
	public static final String AI = "AI";
	public static final String AP = "AP";
	public static final String AT = "AT";
	public static final String CLP = "CLP";
	public static final String CP = "CP";
	public static final String DP = "DP";
	public static final String EP = "EP";
	public static final String FHCP = "FHCP";
	public static final String IP = "IP";
	public static final String MDIR = "MDIR";
	public static final String OP = "OP";
	public static final String PH = "PH";
	public static final String PI = "PI";
	public static final String PP = "PP";
	public static final String RO = "RO";
	public static final String RP = "RP";
	public static final String RT = "RT";
	public static final String TN = "TN";
	public static final String TR = "TR";
	public static final String VP = "VP";
	public static final String VPS = "VPS";
	public static final String VTS = "VTS";

	private Table0443(){
		setTableName("Provider Role");
		setOID("");

		putMap("AD", "Admitting");
		putMap("AI", "Assistant/Alternate Interpreter");
		putMap("AP", "Administering Provider");
		putMap("AT", "Attending");
		putMap("CLP", "Collecting Provider");
		putMap("CP", "Consulting Provider");
		putMap("DP", "Dispensing Provider");
		putMap("EP", "Entering Provider (probably not the same as transcriptionist?)");
		putMap("FHCP", "Family Health Care Professional");
		putMap("IP", "Initiating Provider (as in action by)");
		putMap("MDIR", "Medical Director");
		putMap("OP", "Ordering Provider");
		putMap("PH", "Pharmacist   (not sure how to dissect Pharmacist/Treatment Supplier's Verifier ID)");
		putMap("PI", "Primary Interpreter");
		putMap("PP", "Primary Care Provider");
		putMap("RO", "Responsible Observer");
		putMap("RP", "Referring Provider");
		putMap("RT", "Referred to Provider");
		putMap("TN", "Technician");
		putMap("TR", "Transcriptionist");
		putMap("VP", "Verifying Provider");
		putMap("VPS", "Verifying Pharmaceutical Supplier   (not sure how to dissect Pharmacist/Treatment Supplier's Verifier ID)");
		putMap("VTS", "Verifying Treatment Supplier   (not sure how to dissect Pharmacist/Treatment Supplier's Verifier ID)");

	}

}
