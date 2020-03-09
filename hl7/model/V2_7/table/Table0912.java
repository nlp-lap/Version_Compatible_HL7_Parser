package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0912 extends Table{
	private static final String VERSION = "2.7";
	public static Table getInstance(){
		if(table==null) new Table0912();
		return table;
	}

	public static final String AD = "AD";
	public static final String AI = "AI";
	public static final String AP = "AP";
	public static final String ARI = "ARI";
	public static final String AT = "AT";
	public static final String AUT = "AUT";
	public static final String CP = "CP";
	public static final String DP = "DP";
	public static final String EP = "EP";
	public static final String EQUIP = "EQUIP";
	public static final String FHCP = "FHCP";
	public static final String MDIR = "MDIR";
	public static final String OP = "OP";
	public static final String PB = "PB";
	public static final String PH = "PH";
	public static final String PI = "PI";
	public static final String PO = "PO";
	public static final String POMD = "POMD";
	public static final String PP = "PP";
	public static final String PRI = "PRI";
	public static final String RCT = "RCT";
	public static final String RO = "RO";
	public static final String RP = "RP";
	public static final String RT = "RT";
	public static final String SB = "SB";
	public static final String SC = "SC";
	public static final String TN = "TN";
	public static final String TR = "TR";
	public static final String VP = "VP";
	public static final String VPS = "VPS";
	public static final String VTS = "VTS";
	public static final String WAY = "WAY";
	public static final String WAYR = "WAYR";

	private Table0912(){
		setTableName("Participation");
		setOID("");

		putMap("AD", "Admitting Provider");
		putMap("AI", "Assistant/Alternate Interpreter");
		putMap("AP", "Administering Provider");
		putMap("ARI", "Assistant Result Interpreter");
		putMap("AT", "Attending Provider");
		putMap("AUT", "AUT Author/Event Initiator");
		putMap("CP", "Consulting Provider");
		putMap("DP", "Dispensing Provider");
		putMap("EP", "Entering Provider (probably not the same as transcriptionist)");
		putMap("EQUIP", "Equipment");
		putMap("FHCP", "Family Health Care Professional");
		putMap("MDIR", "Medical Director");
		putMap("OP", "Ordering Provider");
		putMap("PB", "Packed by");
		putMap("PH", "Pharmacist   (not sure how to dissect Pharmacist/Treatment Supplier's Verifier ID)");
		putMap("PI", "Primary Interpreter");
		putMap("PO", "Performing Organization");
		putMap("POMD", "Performing Organization Medical Director");
		putMap("PP", "Primary Care Provider");
		putMap("PRI", "Principal Result Interpreter");
		putMap("RCT", "Results Copies To");
		putMap("RO", "Responsible Observer");
		putMap("RP", "Referring Provider");
		putMap("RT", "Referred to Provider");
		putMap("SB", "Send by");
		putMap("SC", "Specimen Collector");
		putMap("TN", "Technician");
		putMap("TR", "Transcriptionist");
		putMap("VP", "Verifying Provider");
		putMap("VPS", "Verifying Pharmaceutical Supplier   (not sure how to dissect Pharmacist/Treatment Supplier's Verifier ID)");
		putMap("VTS", "Verifying Treatment Supplier   (not sure how to dissect Pharmacist/Treatment Supplier's Verifier ID)");
		putMap("WAY", "Waypoint");
		putMap("WAYR", "Waypoint Recipient");

	}

}
