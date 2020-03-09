package hl7.model.V2_3.table;

import hl7.bean.table.Table;

public class Table0162 extends Table{
	private static final String VERSION = "2.3";
	public static Table getInstance(){
		if(table==null) new Table0162();
		return table;
	}

	public static final String AP = "AP";
	public static final String B = "B";
	public static final String DT = "DT";
	public static final String EP = "EP";
	public static final String ET = "ET";
	public static final String GTT = "GTT";
	public static final String GU = "GU";
	public static final String IA = "IA";
	public static final String IB = "IB";
	public static final String IC = "IC";
	public static final String ICV = "ICV";
	public static final String ID = "ID";
	public static final String IH = "IH";
	public static final String IMR = "IMR";
	public static final String MM = "MM";
	public static final String NG = "NG";
	public static final String NP = "NP";
	public static final String NS = "NS";
	public static final String NT = "NT";
	public static final String OP = "OP";
	public static final String OT = "OT";
	public static final String OTH = "OTH";
	public static final String PF = "PF";
	public static final String PO = "PO";
	public static final String PR = "PR";
	public static final String RM = "RM";
	public static final String SC = "SC";
	public static final String SD = "SD";
	public static final String SL = "SL";
	public static final String TD = "TD";
	public static final String TL = "TL";
	public static final String TP = "TP";
	public static final String TRA = "TRA";
	public static final String UR = "UR";
	public static final String VG = "VG";
	public static final String VM = "VM";
	public static final String WND = "WND";

	private Table0162(){
		setTableName("Route of Administration");
		setOID("2.16.840.1.113883.12.162");

		putMap("AP", "Apply Externally");
		putMap("B", "Buccal");
		putMap("DT", "Dental");
		putMap("EP", "Epidural");
		putMap("ET", "Endotrachial Tube (Used primarily for respiratory therapy and anesthesia delivery)");
		putMap("GTT", "Gastronomy Tube");
		putMap("GU", "GU Irrigant");
		putMap("IA", "Intra-arterial");
		putMap("IB", "Intrabursal");
		putMap("IC", "Intracardiac");
		putMap("ICV", "Intracervical (uterus)");
		putMap("ID", "Intradermal");
		putMap("IH", "Inhalation");
		putMap("IMR", "Immerse (Soak) Body Part");
		putMap("MM", "Mucous Membrane");
		putMap("NG", "Nasogastric");
		putMap("NP", "Nasal Prongs (Used primarily for respiratory therapy and anesthesia delivery)");
		putMap("NS", "Nasal");
		putMap("NT", "Nasotrachial Tube");
		putMap("OP", "Ophthalmic");
		putMap("OT", "Otic");
		putMap("OTH", "Other/Miscellaneous");
		putMap("PF", "Perfusion");
		putMap("PO", "Oral");
		putMap("PR", "Rectal");
		putMap("RM", "Rebreather Mask (Used primarily for respiratory therapy and anesthesia delivery)");
		putMap("SC", "Subcutaneous");
		putMap("SD", "Soaked Dressing");
		putMap("SL", "Sublingual");
		putMap("TD", "Transdermal");
		putMap("TL", "Translingual");
		putMap("TP", "Topical");
		putMap("TRA", "Tracheostomy (Used primarily for respiratory therapy and anesthesia delivery)");
		putMap("UR", "Urethral");
		putMap("VG", "Vaginal");
		putMap("VM", "Ventimask");
		putMap("WND", "Wound");

	}

}
