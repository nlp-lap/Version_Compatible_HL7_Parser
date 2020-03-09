package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0227 extends Table{
	private static final String VERSION = "2.7";
	public static Table getInstance(){
		if(table==null) new Table0227();
		return table;
	}

	public static final String AB = "AB";
	public static final String AD = "AD";
	public static final String ALP = "ALP";
	public static final String AR = "AR";
	public static final String AVB = "AVB";
	public static final String AVI = "AVI";
	public static final String BA = "BA";
	public static final String BAH = "BAH";
	public static final String BAY = "BAY";
	public static final String BP = "BP";
	public static final String BPC = "BPC";
	public static final String CEN = "CEN";
	public static final String CHI = "CHI";
	public static final String CMP = "CMP";
	public static final String CNJ = "CNJ";
	public static final String CON = "CON";
	public static final String DVC = "DVC";
	public static final String EVN = "EVN";
	public static final String GEO = "GEO";
	public static final String GRE = "GRE";
	public static final String IAG = "IAG";
	public static final String IM = "IM";
	public static final String IUS = "IUS";
	public static final String JPN = "JPN";
	public static final String KGC = "KGC";
	public static final String LED = "LED";
	public static final String MA = "MA";
	public static final String MBL = "MBL";
	public static final String MED = "MED";
	public static final String MIL = "MIL";
	public static final String MIP = "MIP";
	public static final String MSD = "MSD";
	public static final String NAB = "NAB";
	public static final String NAV = "NAV";
	public static final String NOV = "NOV";
	public static final String NVX = "NVX";
	public static final String NYB = "NYB";
	public static final String ORT = "ORT";
	public static final String OTC = "OTC";
	public static final String OTH = "OTH";
	public static final String PD = "PD";
	public static final String PMC = "PMC";
	public static final String PRX = "PRX";
	public static final String PWJ = "PWJ";
	public static final String SCL = "SCL";
	public static final String SI = "SI";
	public static final String SKB = "SKB";
	public static final String SOL = "SOL";
	public static final String TAL = "TAL";
	public static final String UNK = "UNK";
	public static final String USA = "USA";
	public static final String VXG = "VXG";
	public static final String WA = "WA";
	public static final String WAL = "WAL";
	public static final String ZLB = "ZLB";

	private Table0227(){
		setTableName("Manufacturers of Vaccines (code=MVX)");
		setOID("");

		putMap("AB", "Abbott Laboratories");
		putMap("AD", "Adams Laboratories, Inc.");
		putMap("ALP", "Alpha Therapeutic Corporation");
		putMap("AR", "Armour");
		putMap("AVB", "Aventis Behring L.L.C.");
		putMap("AVI", "Aviron");
		putMap("BA", "Baxter Healthcare Corporation");
		putMap("BAH", "Baxter Healthcare Corporation");
		putMap("BAY", "Bayer Corporation");
		putMap("BP", "Berna Products");
		putMap("BPC", "Berna Products Corporation");
		putMap("CEN", "Centeon L.L.C.");
		putMap("CHI", "Chiron Corporation");
		putMap("CMP", "Celltech Medeva Pharmaceuticals");
		putMap("CNJ", "Cangene Corporation");
		putMap("CON", "Connaught");
		putMap("DVC", "DynPort Vaccine Company, LLC");
		putMap("EVN", "Evans Medical Limited");
		putMap("GEO", "GeoVax Labs, Inc.");
		putMap("GRE", "Greer Laboratories, Inc.");
		putMap("IAG", "Immuno International AG");
		putMap("IM", "Merieux");
		putMap("IUS", "Immuno-U.S., Inc.");
		putMap("JPN", "The Research Foundation for Microbial Diseases of Osaka University");
		putMap("KGC", "Korea Green Cross Corporation");
		putMap("LED", "Lederle");
		putMap("MA", "Massachusetts Public Health Biologic Laboratories");
		putMap("MBL", "Massachusetts Biologic Laboratories");
		putMap("MED", "MedImmune, Inc.");
		putMap("MIL", "Miles");
		putMap("MIP", "Bioport Corporation");
		putMap("MSD", "Merck & Co., Inc.");
		putMap("NAB", "NABI");
		putMap("NAV", "North American Vaccine, Inc.");
		putMap("NOV", "Novartis Pharmaceutical Corporation");
		putMap("NVX", "Novavax, Inc.");
		putMap("NYB", "New York Blood Center");
		putMap("ORT", "Ortho-Clinical Diagnostics");
		putMap("OTC", "Organon Teknika Corporation");
		putMap("OTH", "Other manufacturer");
		putMap("PD", "Parkedale Pharmaceuticals");
		putMap("PMC", "sanofi pasteur");
		putMap("PRX", "Praxis Biologics");
		putMap("PWJ", "PowderJect Pharmaceuticals");
		putMap("SCL", "Sclavo, Inc.");
		putMap("SI", "Swiss Serum and Vaccine Inst.");
		putMap("SKB", "GlaxoSmithKline");
		putMap("SOL", "Solvay Pharmaceuticals");
		putMap("TAL", "Talecris Biotherapeutics");
		putMap("UNK", "Unknown manufacturer");
		putMap("USA", "United States Army Medical Research and Material Command");
		putMap("VXG", "VaxGen");
		putMap("WA", "Wyeth-Ayerst");
		putMap("WAL", "Wyeth-Ayerst");
		putMap("ZLB", "ZLB Behring");

	}

}
