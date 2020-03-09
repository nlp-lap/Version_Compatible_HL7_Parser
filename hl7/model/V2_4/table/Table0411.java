package hl7.model.V2_4.table;

import hl7.bean.table.Table;

public class Table0411 extends Table{
	private static final String VERSION = "2.4";
	public static Table getInstance(){
		if(table==null) new Table0411();
		return table;
	}

	public static final String _1ST = "1ST";
	public static final String _2ND = "2ND";
	public static final String _3RD = "3RD";
	public static final String _4TH = "4TH";
	public static final String _5TH = "5TH";
	public static final String A_P = "A/P";
	public static final String ANT = "ANT";
	public static final String BLT = "BLT";
	public static final String DEC = "DEC";
	public static final String DST = "DST";
	public static final String LAT = "LAT";
	public static final String LFT = "LFT";
	public static final String LLQ = "LLQ";
	public static final String LOW = "LOW";
	public static final String LUQ = "LUQ";
	public static final String MED = "MED";
	public static final String OR = "OR";
	public static final String PED = "PED";
	public static final String POS = "POS";
	public static final String PRT = "PRT";
	public static final String PRX = "PRX";
	public static final String REC = "REC";
	public static final String RGH = "RGH";
	public static final String RLQ = "RLQ";
	public static final String RUQ = "RUQ";
	public static final String UPP = "UPP";
	public static final String UPR = "UPR";
	public static final String WCT = "WCT";
	public static final String WOC = "WOC";
	public static final String WSD = "WSD";

	private Table0411(){
		setTableName("Supplemental service information values");
		setOID("2.16.840.1.113883.12.411");

		putMap("1ST", "First");
		putMap("2ND", "Second");
		putMap("3RD", "Third");
		putMap("4TH", "Fourth");
		putMap("5TH", "Fifth");
		putMap("A/P", "Anterior/Posterior");
		putMap("ANT", "Anterior");
		putMap("BLT", "Bilateral");
		putMap("DEC", "Decubitus");
		putMap("DST", "Distal");
		putMap("LAT", "Lateral");
		putMap("LFT", "Left");
		putMap("LLQ", "Left Lower Quadrant");
		putMap("LOW", "Lower");
		putMap("LUQ", "Left Upper Quadrant");
		putMap("MED", "Medial");
		putMap("OR", "Operating Room");
		putMap("PED", "Pediatric");
		putMap("POS", "Posterior");
		putMap("PRT", "Portable");
		putMap("PRX", "Proximal");
		putMap("REC", "Recumbent");
		putMap("RGH", "Right");
		putMap("RLQ", "Right Lower Quadrant");
		putMap("RUQ", "Right Upper Quadrant");
		putMap("UPP", "Upper");
		putMap("UPR", "Upright");
		putMap("WCT", "With Contrast");
		putMap("WOC", "Without Contrast");
		putMap("WSD", "With Sedation");

	}

}
