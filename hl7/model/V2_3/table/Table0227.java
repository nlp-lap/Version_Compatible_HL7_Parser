package hl7.model.V2_3.table;

import hl7.bean.table.Table;

public class Table0227 extends Table{
	private static final String VERSION = "2.3";
	public static Table getInstance(){
		if(table==null) new Table0227();
		return table;
	}

	public static final String AB = "AB";
	public static final String AD = "AD";
	public static final String ALP = "ALP";
	public static final String AR = "AR";
	public static final String BA = "BA";
	public static final String BAY = "BAY";
	public static final String BP = "BP";
	public static final String CON = "CON";
	public static final String EVN = "EVN";
	public static final String GRE = "GRE";
	public static final String IM = "IM";
	public static final String IUS = "IUS";
	public static final String JPN = "JPN";
	public static final String KGC = "KGC";
	public static final String LED = "LED";
	public static final String MA = "MA";
	public static final String MIL = "MIL";
	public static final String MIP = "MIP";
	public static final String MSD = "MSD";
	public static final String NAB = "NAB";
	public static final String NYB = "NYB";
	public static final String OTC = "OTC";
	public static final String OTH = "OTH";
	public static final String PD = "PD";
	public static final String PRX = "PRX";
	public static final String SCL = "SCL";
	public static final String SI = "SI";
	public static final String SKB = "SKB";
	public static final String UNK = "UNK";
	public static final String WA = "WA";

	private Table0227(){
		setTableName("Manufacturers of Vaccines");
		setOID("2.16.840.1.113883.12.227");

		putMap("AB", "Abbott");
		putMap("AD", "Adams");
		putMap("ALP", "Alpha");
		putMap("AR", "Armour");
		putMap("BA", "Baxter");
		putMap("BAY", "Bayer");
		putMap("BP", "Berna");
		putMap("CON", "Connaught");
		putMap("EVN", "Evans");
		putMap("GRE", "Greer");
		putMap("IM", "Merieux");
		putMap("IUS", "Immuno-US");
		putMap("JPN", "Microbial Dis/Osaka U");
		putMap("KGC", "Korea Green Cross");
		putMap("LED", "Lederle");
		putMap("MA", "Massachusetts Public Health");
		putMap("MIL", "Miles");
		putMap("MIP", "Michigan Dept Public Health");
		putMap("MSD", "Merck");
		putMap("NAB", "North American Biologicals, Inc.");
		putMap("NYB", "New York Blood Center");
		putMap("OTC", "Organon Teknika");
		putMap("OTH", "Other");
		putMap("PD", "Parke Davis");
		putMap("PRX", "Praxis Biologics");
		putMap("SCL", "Sclavo");
		putMap("SI", "Swiss Serum and Vaccine Inst.");
		putMap("SKB", "SmithKline");
		putMap("UNK", "Unknown manufacturer");
		putMap("WA", "Wyeth-Ayerst");

	}

}
