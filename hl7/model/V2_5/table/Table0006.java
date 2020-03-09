package hl7.model.V2_5.table;

import hl7.bean.table.Table;

public class Table0006 extends Table{
	private static final String VERSION = "2.5";
	public static Table getInstance(){
		if(table==null) new Table0006();
		return table;
	}

	public static final String ABC = "ABC";
	public static final String AGN = "AGN";
	public static final String AME = "AME";
	public static final String AMT = "AMT";
	public static final String ANG = "ANG";
	public static final String AOG = "AOG";
	public static final String ATH = "ATH";
	public static final String BAH = "BAH";
	public static final String BAP = "BAP";
	public static final String BMA = "BMA";
	public static final String BOT = "BOT";
	public static final String BTA = "BTA";
	public static final String BTH = "BTH";
	public static final String BUD = "BUD";
	public static final String CAT = "CAT";
	public static final String CFR = "CFR";
	public static final String CHR = "CHR";
	public static final String CHS = "CHS";
	public static final String CMA = "CMA";
	public static final String CNF = "CNF";
	public static final String COC = "COC";
	public static final String COG = "COG";
	public static final String COI = "COI";
	public static final String COL = "COL";
	public static final String COM = "COM";
	public static final String COP = "COP";
	public static final String COT = "COT";
	public static final String CRR = "CRR";
	public static final String EOT = "EOT";
	public static final String EPI = "EPI";
	public static final String ERL = "ERL";
	public static final String EVC = "EVC";
	public static final String FRQ = "FRQ";
	public static final String FWB = "FWB";
	public static final String GRE = "GRE";
	public static final String HIN = "HIN";
	public static final String HOT = "HOT";
	public static final String HSH = "HSH";
	public static final String HVA = "HVA";
	public static final String JAI = "JAI";
	public static final String JCO = "JCO";
	public static final String JEW = "JEW";
	public static final String JOR = "JOR";
	public static final String JOT = "JOT";
	public static final String JRC = "JRC";
	public static final String JRF = "JRF";
	public static final String JRN = "JRN";
	public static final String JWN = "JWN";
	public static final String LMS = "LMS";
	public static final String LUT = "LUT";
	public static final String MEN = "MEN";
	public static final String MET = "MET";
	public static final String MOM = "MOM";
	public static final String MOS = "MOS";
	public static final String MOT = "MOT";
	public static final String MSH = "MSH";
	public static final String MSU = "MSU";
	public static final String NAM = "NAM";
	public static final String NAZ = "NAZ";
	public static final String NOE = "NOE";
	public static final String NRL = "NRL";
	public static final String ORT = "ORT";
	public static final String OTH = "OTH";
	public static final String PEN = "PEN";
	public static final String PRC = "PRC";
	public static final String PRE = "PRE";
	public static final String PRO = "PRO";
	public static final String QUA = "QUA";
	public static final String REC = "REC";
	public static final String REO = "REO";
	public static final String SAA = "SAA";
	public static final String SEV = "SEV";
	public static final String SHN = "SHN";
	public static final String SIK = "SIK";
	public static final String SOU = "SOU";
	public static final String SPI = "SPI";
	public static final String UCC = "UCC";
	public static final String UMD = "UMD";
	public static final String UNI = "UNI";
	public static final String UNU = "UNU";
	public static final String VAR = "VAR";
	public static final String WES = "WES";
	public static final String WMC = "WMC";

	private Table0006(){
		setTableName("Religion");
		setOID("2.16.840.1.113883.12.6");

		putMap("ABC", "Christian: American Baptist Church");
		putMap("AGN", "Agnostic");
		putMap("AME", "Christian: African Methodist Episcopal Zion");
		putMap("AMT", "Christian: African Methodist Episcopal");
		putMap("ANG", "Christian: Anglican");
		putMap("AOG", "Christian: Assembly of God");
		putMap("ATH", "Atheist");
		putMap("BAH", "Baha'i");
		putMap("BAP", "Christian: Baptist");
		putMap("BMA", "Buddhist: Mahayana");
		putMap("BOT", "Buddhist: Other");
		putMap("BTA", "Buddhist: Tantrayana");
		putMap("BTH", "Buddhist: Theravada");
		putMap("BUD", "Buddhist");
		putMap("CAT", "Christian: Roman Catholic");
		putMap("CFR", "Chinese Folk Religionist");
		putMap("CHR", "Christian");
		putMap("CHS", "Christian: Christian Science");
		putMap("CMA", "Christian: Christian Missionary Alliance");
		putMap("CNF", "Confucian");
		putMap("COC", "Christian: Church of Christ");
		putMap("COG", "Christian: Church of God");
		putMap("COI", "Christian: Church of God in Christ");
		putMap("COL", "Christian: Congregational");
		putMap("COM", "Christian: Community");
		putMap("COP", "Christian: Other Pentecostal");
		putMap("COT", "Christian: Other");
		putMap("CRR", "Christian: Christian Reformed");
		putMap("EOT", "Christian: Eastern Orthodox");
		putMap("EPI", "Christian: Episcopalian");
		putMap("ERL", "Ethnic Religionist");
		putMap("EVC", "Christian: Evangelical Church");
		putMap("FRQ", "Christian: Friends");
		putMap("FWB", "Christian: Free Will Baptist");
		putMap("GRE", "Christian: Greek Orthodox");
		putMap("HIN", "Hindu");
		putMap("HOT", "Hindu: Other");
		putMap("HSH", "Hindu: Shaivites");
		putMap("HVA", "Hindu: Vaishnavites");
		putMap("JAI", "Jain");
		putMap("JCO", "Jewish: Conservative");
		putMap("JEW", "Jewish");
		putMap("JOR", "Jewish: Orthodox");
		putMap("JOT", "Jewish: Other");
		putMap("JRC", "Jewish: Reconstructionist");
		putMap("JRF", "Jewish: Reform");
		putMap("JRN", "Jewish: Renewal");
		putMap("JWN", "Christian: Jehovah's Witness");
		putMap("LMS", "Christian: Lutheran Missouri Synod");
		putMap("LUT", "Christian: Lutheran");
		putMap("MEN", "Christian: Mennonite");
		putMap("MET", "Christian: Methodist");
		putMap("MOM", "Christian: Latter-day Saints");
		putMap("MOS", "Muslim");
		putMap("MOT", "Muslim: Other");
		putMap("MSH", "Muslim: Shiite");
		putMap("MSU", "Muslim: Sunni");
		putMap("NAM", "Native American");
		putMap("NAZ", "Christian: Church of the Nazarene");
		putMap("NOE", "Nonreligious");
		putMap("NRL", "New Religionist");
		putMap("ORT", "Christian: Orthodox");
		putMap("OTH", "Other");
		putMap("PEN", "Christian: Pentecostal");
		putMap("PRC", "Christian: Other Protestant");
		putMap("PRE", "Christian: Presbyterian");
		putMap("PRO", "Christian: Protestant");
		putMap("QUA", "Christian: Friends");
		putMap("REC", "Christian: Reformed Church");
		putMap("REO", "Christian: Reorganized Church of Jesus Christ-LDS");
		putMap("SAA", "Christian: Salvation Army");
		putMap("SEV", "Christian: Seventh Day Adventist");
		putMap("SHN", "Shintoist");
		putMap("SIK", "Sikh");
		putMap("SOU", "Christian: Southern Baptist");
		putMap("SPI", "Spiritist");
		putMap("UCC", "Christian: United Church of Christ");
		putMap("UMD", "Christian: United Methodist");
		putMap("UNI", "Christian: Unitarian");
		putMap("UNU", "Christian: Unitarian Universalist");
		putMap("VAR", "Unknown");
		putMap("WES", "Christian: Wesleyan");
		putMap("WMC", "Christian: Wesleyan Methodist");

	}

}