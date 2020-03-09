package hl7.model.V2_4.table;

import hl7.bean.table.Table;

public class Table0227 extends Table{
	private static final String VERSION = "2.4";
	public static Table getInstance(){
		if(table==null) new Table0227();
		return table;
	}

	public static final String AB = "AB";
	public static final String AD = "AD";
	public static final String ALP = "ALP";
	public static final String AR = "AR";
	public static final String AVI = "AVI";
	public static final String BA = "BA";
	public static final String BAY = "BAY";
	public static final String BP = "BP";
	public static final String BPC = "BPC";
	public static final String CEN = "CEN";
	public static final String CHI = "CHI";
	public static final String CON = "CON";
	public static final String EVN = "EVN";
	public static final String GRE = "GRE";
	public static final String IAG = "IAG";
	public static final String IM = "IM";
	public static final String IUS = "IUS";
	public static final String JPN = "JPN";
	public static final String KGC = "KGC";
	public static final String LED = "LED";
	public static final String MA = "MA";
	public static final String MED = "MED";
	public static final String MIL = "MIL";
	public static final String MIP = "MIP";
	public static final String MSD = "MSD";
	public static final String NAB = "NAB";
	public static final String NAV = "NAV";
	public static final String NOV = "NOV";
	public static final String NYB = "NYB";
	public static final String ORT = "ORT";
	public static final String OTC = "OTC";
	public static final String OTH = "OTH";
	public static final String PD = "PD";
	public static final String PMC = "PMC";
	public static final String PRX = "PRX";
	public static final String SCL = "SCL";
	public static final String SI = "SI";
	public static final String SKB = "SKB";
	public static final String UNK = "UNK";
	public static final String USA = "USA";
	public static final String WA = "WA";
	public static final String WAL = "WAL";

	private Table0227(){
		setTableName("Manufacturers of vaccines (code=MVX)");
		setOID("2.16.840.1.113883.12.227");

		putMap("AB", "Abbott Laboratories (includes Ross Products Division)");
		putMap("AD", "Adams Laboratories");
		putMap("ALP", "Alpha Therapeutic Corporation");
		putMap("AR", "Armour [Inactive-use CEN]");
		putMap("AVI", "Aviron");
		putMap("BA", "Baxter Healthcare Corporation");
		putMap("BAY", "Bayer Corporation(includes Miles, Inc. and Cutter Laboratories)");
		putMap("BP", "Berna Products [Inactive-use BPC]");
		putMap("BPC", "Berna Products Corporation (includes Swiss Serum and Vaccine Institute Berne)");
		putMap("CEN", "Centeon L.L.C. (includes Armour Pharmaceutical Company)");
		putMap("CHI", "Chiron Corporation");
		putMap("CON", "Connaught [Inactive-use PMC]");
		putMap("EVN", "Evans Medical Limited (an affiliate of Medeva Pharmaceuticals, Inc.)");
		putMap("GRE", "Greer Laboratories, Inc.");
		putMap("IAG", "Immuno International AG");
		putMap("IM", "Merieux [Inactive-use PMC]");
		putMap("IUS", "Immuno-U.S., Inc.");
		putMap("JPN", "The Research Foundation for Microbial Diseases of Osaka University (BIKEN)");
		putMap("KGC", "Korea Green Cross Corporation");
		putMap("LED", "Lederle [Inactive-use WAL]");
		putMap("MA", "Massachusetts Public Health Biologic Laboratories");
		putMap("MED", "MedImmune, Inc.");
		putMap("MIL", "Miles [Inactive-use BAY]");
		putMap("MIP", "Bioport Corporation (formerly Michigan Biologic Products Institute)");
		putMap("MSD", "Merck & Co., Inc.");
		putMap("NAB", "NABI (formerly North American Biologicals, Inc.)");
		putMap("NAV", "North American Vaccine, Inc.");
		putMap("NOV", "Novartis Pharmaceutical Corporation (includes Ciba-Geigy Limited and Sandoz Limited)");
		putMap("NYB", "New York Blood Center");
		putMap("ORT", "Ortho Diagnostic Systems, Inc.");
		putMap("OTC", "Organon Teknika Corporation");
		putMap("OTH", "Other manufacturer");
		putMap("PD", "Parkedale Pharmaceuticals (formerly Parke-Davis)");
		putMap("PMC", "Aventis Pasteur Inc. (formerly Pasteur Merieux Connaught; includes Connaught Laboratories and Pasteur Merieux)");
		putMap("PRX", "Praxis Biologics [Inactive-use WAL]");
		putMap("SCL", "Sclavo, Inc.");
		putMap("SI", "Swiss Serum and Vaccine Inst. [Inactive-use BPC]");
		putMap("SKB", "SmithKline Beecham");
		putMap("UNK", "Unknown manufacturer");
		putMap("USA", "United States Army Medical Research and Materiel Command");
		putMap("WA", "Wyeth-Ayerst [Inactive-use WAL]");
		putMap("WAL", "Wyeth-Ayerst (includes Wyeth-Lederle Vaccines and Pediatrics, Wyeth Laboratories, Lederle Laboratories, and Praxis Biologics)");

	}

}
