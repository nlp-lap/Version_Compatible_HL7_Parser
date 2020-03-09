package hl7.model.V2_51.table;

import hl7.bean.table.Table;

public class Table0495 extends Table{
	private static final String VERSION = "2.5.1";
	public static Table getInstance(){
		if(table==null) new Table0495();
		return table;
	}

	public static final String ANT = "ANT";
	public static final String BIL = "BIL";
	public static final String DIS = "DIS";
	public static final String EXT = "EXT";
	public static final String L = "L";
	public static final String LAT = "LAT";
	public static final String LLQ = "LLQ";
	public static final String LOW = "LOW";
	public static final String LUQ = "LUQ";
	public static final String MED = "MED";
	public static final String POS = "POS";
	public static final String PRO = "PRO";
	public static final String R = "R";
	public static final String RLQ = "RLQ";
	public static final String RUQ = "RUQ";
	public static final String UPP = "UPP";

	private Table0495(){
		setTableName("Body Site Modifier");
		setOID("2.16.840.1.113883.12.495");

		putMap("ANT", "Anterior");
		putMap("BIL", "Bilateral");
		putMap("DIS", "Distal");
		putMap("EXT", "External");
		putMap("L", "Left");
		putMap("LAT", "Lateral");
		putMap("LLQ", "Quadrant, Left Lower");
		putMap("LOW", "Lower");
		putMap("LUQ", "Quadrant, Left Upper");
		putMap("MED", "Medial");
		putMap("POS", "Posterior");
		putMap("PRO", "Proximal");
		putMap("R", "Right");
		putMap("RLQ", "Quadrant, Right Lower");
		putMap("RUQ", "Quadrant, Right Upper");
		putMap("UPP", "Upper");

	}

}
