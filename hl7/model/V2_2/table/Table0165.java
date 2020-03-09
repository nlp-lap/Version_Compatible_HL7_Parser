package hl7.model.V2_2.table;

import hl7.bean.table.Table;

public class Table0165 extends Table{
	private static final String VERSION = "2.2";
	public static Table getInstance(){
		if(table==null) new Table0165();
		return table;
	}

	public static final String CH = "CH";
	public static final String DI = "DI";
	public static final String DU = "DU";
	public static final String IF = "IF";
	public static final String IR = "IR";
	public static final String IS = "IS";
	public static final String IVP = "IVP";
	public static final String IVPB = "IVPB";
	public static final String NB = "NB";
	public static final String PF = "PF";
	public static final String PT = "PT";
	public static final String SH = "SH";
	public static final String SO = "SO";
	public static final String WA = "WA";
	public static final String WI = "WI";

	private Table0165(){
		setTableName("ADMINISTRATION METHOD");
		setOID("2.16.840.1.113883.12.165");

		putMap("CH", "Chew");
		putMap("DI", "Dissolve");
		putMap("DU", "Dust");
		putMap("IF", "Inflitrate");
		putMap("IR", "Irrigate");
		putMap("IS", "Insert");
		putMap("IVP", "IV Push");
		putMap("IVPB", "IV Piggyback");
		putMap("NB", "Nebulized");
		putMap("PF", "Perfuse");
		putMap("PT", "Pain");
		putMap("SH", "Shampoo");
		putMap("SO", "Soak");
		putMap("WA", "Wash");
		putMap("WI", "Wipe");

	}

}
