package hl7.model.V2_6.table;

import hl7.bean.table.Table;

public class Table0489 extends Table{
	private static final String VERSION = "2.6";
	public static Table getInstance(){
		if(table==null) new Table0489();
		return table;
	}

	public static final String AGG = "AGG";
	public static final String BHZ = "BHZ";
	public static final String BIO = "BIO";
	public static final String COR = "COR";
	public static final String ESC = "ESC";
	public static final String EXP = "EXP";
	public static final String IFL = "IFL";
	public static final String INF = "INF";
	public static final String INJ = "INJ";
	public static final String POI = "POI";
	public static final String RAD = "RAD";

	private Table0489(){
		setTableName("Risk Codes");
		setOID("2.16.840.1.113883.12.489");

		putMap("AGG", "Aggressive");
		putMap("BHZ", "Biohazard");
		putMap("BIO", "Biological");
		putMap("COR", "Corrosive");
		putMap("ESC", "Escape Risk");
		putMap("EXP", "Explosive");
		putMap("IFL", "MaterialDangerInflammable");
		putMap("INF", "MaterialDangerInfectious");
		putMap("INJ", "Injury Hazard");
		putMap("POI", "Poison");
		putMap("RAD", "Radioactive");

	}

}
