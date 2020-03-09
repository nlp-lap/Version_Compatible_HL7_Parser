package hl7.model.V2_2.table;

import hl7.bean.table.Table;

public class Table0162 extends Table{
	private static final String VERSION = "2.2";
	public static Table getInstance(){
		if(table==null) new Table0162();
		return table;
	}

	public static final String AP = "AP";
	public static final String B = "B";
	public static final String DT = "DT";
	public static final String GTT = "GTT";
	public static final String GU = "GU";
	public static final String IA = "IA";
	public static final String IC = "IC";
	public static final String ID = "ID";
	public static final String IH = "IH";
	public static final String IM = "IM";
	public static final String IN = "IN";
	public static final String IO = "IO";
	public static final String IP = "IP";
	public static final String IS = "IS";
	public static final String IT = "IT";
	public static final String IV = "IV";
	public static final String NG = "NG";
	public static final String NS = "NS";
	public static final String OP = "OP";
	public static final String OT = "OT";
	public static final String PO = "PO";
	public static final String PR = "PR";
	public static final String SC = "SC";
	public static final String SL = "SL";
	public static final String TD = "TD";
	public static final String TL = "TL";
	public static final String TP = "TP";
	public static final String UR = "UR";
	public static final String VG = "VG";

	private Table0162(){
		setTableName("ROUTE OF ADMINISTRATION");
		setOID("2.16.840.1.113883.12.162");

		putMap("AP", "Apply Externally");
		putMap("B", "Buccal");
		putMap("DT", "Dental");
		putMap("GTT", "Gastronomy Tube");
		putMap("GU", "Magenspulung");
		putMap("IA", "Intra-arterial");
		putMap("IC", "Intracardiac");
		putMap("ID", "Intradermal");
		putMap("IH", "Inhalation");
		putMap("IM", "Intramuscular");
		putMap("IN", "Intranasal");
		putMap("IO", "Intraocular");
		putMap("IP", "Intraperitoneal");
		putMap("IS", "Intrasynovial");
		putMap("IT", "Intrathecal");
		putMap("IV", "Intravenous");
		putMap("NG", "Nasogastric");
		putMap("NS", "Nasal");
		putMap("OP", "Ophthalmic");
		putMap("OT", "Otic");
		putMap("PO", "Oral");
		putMap("PR", "Rectal");
		putMap("SC", "Subcutaneous");
		putMap("SL", "Sublingual");
		putMap("TD", "Transdermal");
		putMap("TL", "Translingual");
		putMap("TP", "Topical");
		putMap("UR", "Urethral");
		putMap("VG", "Vaginal");

	}

}
