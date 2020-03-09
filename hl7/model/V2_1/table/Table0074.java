package hl7.model.V2_1.table;

import hl7.bean.table.Table;

public class Table0074 extends Table{
	private static final String VERSION = "2.1";
	public static Table getInstance(){
		if(table==null) new Table0074();
		return table;
	}

	public static final String BG = "BG";
	public static final String CH = "CH";
	public static final String CP = "CP";
	public static final String CT = "CT";
	public static final String CUS = "CUS";
	public static final String EC = "EC";
	public static final String HM = "HM";
	public static final String IMM = "IMM";
	public static final String MB = "MB";
	public static final String MCB = "MCB";
	public static final String MYC = "MYC";
	public static final String NMR = "NMR";
	public static final String NMS = "NMS";
	public static final String NRS = "NRS";
	public static final String OT = "OT";
	public static final String OTH = "OTH";
	public static final String OUS = "OUS";
	public static final String PHR = "PHR";
	public static final String PT = "PT";
	public static final String RC = "RC";
	public static final String RT = "RT";
	public static final String RUS = "RUS";
	public static final String SP = "SP";
	public static final String SR = "SR";
	public static final String TX = "TX";
	public static final String VUS = "VUS";
	public static final String XRC = "XRC";

	private Table0074(){
		setTableName("DIAGNOSTIC SERVICE SECTION ID");
		setOID("2.16.840.1.113883.12.74");

		putMap("BG", "Blood gases");
		putMap("CH", "Chemistry");
		putMap("CP", "Cytopathology");
		putMap("CT", "CAT scan");
		putMap("CUS", "Cardiac Ultrasound");
		putMap("EC", "Electrocardiac (e.g., EKG, EEC, Holter)");
		putMap("HM", "Hematology");
		putMap("IMM", "Immunology");
		putMap("MB", "Microbiology");
		putMap("MCB", "Mycobacteriology");
		putMap("MYC", "Mycology");
		putMap("NMR", "Nuclear magnetic resonance");
		putMap("NMS", "Nuclear medicine scan");
		putMap("NRS", "Nursing service measures");
		putMap("OT", "Occupational Therapy");
		putMap("OTH", "Other");
		putMap("OUS", "OB Ultrasound");
		putMap("PHR", "Pharmacy");
		putMap("PT", "Physical Therapy");
		putMap("RC", "Respiratory Care");
		putMap("RT", "Radiation Therapy");
		putMap("RUS", "Radiology ultrasound");
		putMap("SP", "Surgical Pathology");
		putMap("SR", "Serology");
		putMap("TX", "Toxicology");
		putMap("VUS", "Vascular Ultrasound");
		putMap("XRC", "Cineradiography");

	}

}
