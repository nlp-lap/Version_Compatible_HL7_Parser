package hl7.model.V2_6.table;

import hl7.bean.table.Table;

public class Table0871 extends Table{
	private static final String VERSION = "2.6";
	public static Table getInstance(){
		if(table==null) new Table0871();
		return table;
	}

	public static final String COR = "COR";
	public static final String EXP = "EXP";
	public static final String FLA = "FLA";
	public static final String INJ = "INJ";
	public static final String RAD = "RAD";
	public static final String TOX = "TOX";
	public static final String UNK = "UNK";

	private Table0871(){
		setTableName("Supply Risk Codes");
		setOID("2.16.840.1.113883.12.871");

		putMap("COR", "Corrosive");
		putMap("EXP", "Explosive");
		putMap("FLA", "Flammable");
		putMap("INJ", "Injury Hazard");
		putMap("RAD", "Radioactive");
		putMap("TOX", "Toxic");
		putMap("UNK", "Unknown");

	}

}
