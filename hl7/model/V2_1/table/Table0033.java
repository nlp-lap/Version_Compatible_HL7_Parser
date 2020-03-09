package hl7.model.V2_1.table;

import hl7.bean.table.Table;

public class Table0033 extends Table{
	private static final String VERSION = "2.1";
	public static Table getInstance(){
		if(table==null) new Table0033();
		return table;
	}

	public static final String AP = "AP";
	public static final String CH = "CH";
	public static final String DU = "DU";
	public static final String EA = "EA";
	public static final String EY = "EY";
	public static final String IA = "IA";
	public static final String ID = "ID";
	public static final String IF = "IF";
	public static final String IH = "IH";
	public static final String IM = "IM";
	public static final String IN = "IN";
	public static final String IR = "IR";
	public static final String IS = "IS";
	public static final String IT = "IT";
	public static final String IV = "IV";
	public static final String NB = "NB";
	public static final String NG = "NG";
	public static final String PA = "PA";
	public static final String PT = "PT";
	public static final String PU = "PU";
	public static final String RC = "RC";
	public static final String SH = "SH";
	public static final String SL = "SL";
	public static final String SO = "SO";
	public static final String SS = "SS";
	public static final String TP = "TP";
	public static final String WA = "WA";
	public static final String WI = "WI";

	private Table0033(){
		setTableName("ROUTE");
		setOID("2.16.840.1.113883.12.33");

		putMap("AP", "Apply externally");
		putMap("CH", "Chew");
		putMap("DU", "Dust");
		putMap("EA", "Ear");
		putMap("EY", "Eye");
		putMap("IA", "Intro-arterial");
		putMap("ID", "Intra-dermal");
		putMap("IF", "Infiltrate");
		putMap("IH", "Inhalation");
		putMap("IM", "Intra-muscular");
		putMap("IN", "Intra-nasal");
		putMap("IR", "Irrigate");
		putMap("IS", "Inserted");
		putMap("IT", "Intrathecal");
		putMap("IV", "Intravenous");
		putMap("NB", "Nebulized");
		putMap("NG", "Nathogasic");
		putMap("PA", "Peri-anally");
		putMap("PT", "Paint");
		putMap("PU", "IV push");
		putMap("RC", "Rectally");
		putMap("SH", "Shampoo");
		putMap("SL", "Sublingual");
		putMap("SO", "Soak");
		putMap("SS", "IV soluset");
		putMap("TP", "Topically");
		putMap("WA", "Wash");
		putMap("WI", "Wipe");

	}

}
