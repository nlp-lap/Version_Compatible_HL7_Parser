package hl7.model.V2_31.table;

import hl7.bean.table.Table;

public class Table0074 extends Table{
	private static final String VERSION = "2.3.1";
	public static Table getInstance(){
		if(table==null) new Table0074();
		return table;
	}

	public static final String AU = "AU";
	public static final String BG = "BG";
	public static final String BLB = "BLB";
	public static final String CH = "CH";
	public static final String CP = "CP";
	public static final String CT = "CT";
	public static final String CTH = "CTH";
	public static final String CUS = "CUS";
	public static final String EC = "EC";
	public static final String EN = "EN";
	public static final String HM = "HM";
	public static final String ICU = "ICU";
	public static final String IMM = "IMM";
	public static final String LAB = "LAB";
	public static final String MB = "MB";
	public static final String MCB = "MCB";
	public static final String MYC = "MYC";
	public static final String NMR = "NMR";
	public static final String NMS = "NMS";
	public static final String NRS = "NRS";
	public static final String OSL = "OSL";
	public static final String OT = "OT";
	public static final String OTH = "OTH";
	public static final String OUS = "OUS";
	public static final String PF = "PF";
	public static final String PHR = "PHR";
	public static final String PHY = "PHY";
	public static final String PT = "PT";
	public static final String RAD = "RAD";
	public static final String RC = "RC";
	public static final String RT = "RT";
	public static final String RUS = "RUS";
	public static final String RX = "RX";
	public static final String SP = "SP";
	public static final String SR = "SR";
	public static final String TX = "TX";
	public static final String VR = "VR";
	public static final String VUS = "VUS";
	public static final String XRC = "XRC";

	private Table0074(){
		setTableName("Diagnostic service section ID");
		setOID("2.16.840.1.113883.12.74");

		putMap("AU", "Audiology");
		putMap("BG", "Blood Gases");
		putMap("BLB", "Blood Bank");
		putMap("CH", "Chemistry");
		putMap("CP", "Cytopathology");
		putMap("CT", "CAT Scan");
		putMap("CTH", "Cardiac Catheterization");
		putMap("CUS", "Cardiac Ultrasound");
		putMap("EC", "Electrocardiac (e.g., EKG,  EEC, Holter)");
		putMap("EN", "Electroneuro (EEG, EMG,EP,PSG)");
		putMap("HM", "Hematology");
		putMap("ICU", "Bedside ICU Monitoring");
		putMap("IMM", "Immunology");
		putMap("LAB", "Laboratory");
		putMap("MB", "Microbiology");
		putMap("MCB", "Mycobacteriology");
		putMap("MYC", "Mycology");
		putMap("NMR", "Nuclear Magnetic Resonance");
		putMap("NMS", "Nuclear Medicine Scan");
		putMap("NRS", "Nursing Service Measures");
		putMap("OSL", "Outside Lab");
		putMap("OT", "Occupational Therapy");
		putMap("OTH", "Other");
		putMap("OUS", "OB Ultrasound");
		putMap("PF", "Pulmonary Function");
		putMap("PHR", "Pharmacy");
		putMap("PHY", "Physician (Hx. Dx, admission note, etc.l)");
		putMap("PT", "Physical Therapy");
		putMap("RAD", "Radiology");
		putMap("RC", "Respiratory Care (therapy)");
		putMap("RT", "Radiation Therapy");
		putMap("RUS", "Radiology Ultrasound");
		putMap("RX", "Radiograph");
		putMap("SP", "Surgical Pathology");
		putMap("SR", "Serology");
		putMap("TX", "Toxicology");
		putMap("VR", "Virology");
		putMap("VUS", "Vascular Ultrasound");
		putMap("XRC", "Cineradiograph");

	}

}
