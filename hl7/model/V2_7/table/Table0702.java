package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0702 extends Table{
	private static final String VERSION = "2.7";
	public static Table getInstance(){
		if(table==null) new Table0702();
		return table;
	}

	public static final String _2RS = "2RS";
	public static final String ANR = "ANR";
	public static final String BDP = "BDP";
	public static final String BWD = "BWD";
	public static final String CMW = "CMW";
	public static final String COD = "COD";
	public static final String CRT = "CRT";
	public static final String DEC = "DEC";
	public static final String DRT = "DRT";
	public static final String DRW = "DRW";
	public static final String EOH = "EOH";
	public static final String EOL = "EOL";
	public static final String EXP = "EXP";
	public static final String FLS = "FLS";
	public static final String GLS = "GLS";
	public static final String GNP = "GNP";
	public static final String GRV = "GRV";
	public static final String GTL = "GTL";
	public static final String ISO = "ISO";
	public static final String IST = "IST";
	public static final String LKT = "LKT";
	public static final String LQD = "LQD";
	public static final String OPW = "OPW";
	public static final String PEA = "PEA";
	public static final String PLA = "PLA";
	public static final String PRV = "PRV";
	public static final String RNS = "RNS";
	public static final String SFP = "SFP";
	public static final String THR = "THR";
	public static final String TRB = "TRB";
	public static final String UTL = "UTL";
	public static final String WFP = "WFP";

	private Table0702(){
		setTableName("Cycle Type-");
		setOID("");

		putMap("2RS", "Second Rinse");
		putMap("ANR", "Anesthesia/Respiratory");
		putMap("BDP", "Bedpans");
		putMap("BWD", "Bowie-Dick Test");
		putMap("CMW", "Chemical Wash");
		putMap("COD", "Code");
		putMap("CRT", "Cart Wash");
		putMap("DEC", "Decontamination");
		putMap("DRT", "Dart");
		putMap("DRW", "Dart Warm-up Cycle");
		putMap("EOH", "EO High Temperature");
		putMap("EOL", "EO Low Temperature");
		putMap("EXP", "Express");
		putMap("FLS", "Flash");
		putMap("GLS", "Glassware");
		putMap("GNP", "Gen. Purpose");
		putMap("GRV", "Gravity");
		putMap("GTL", "Gentle");
		putMap("ISO", "Isothermal");
		putMap("IST", "Instrument Wash");
		putMap("LKT", "Leak Test");
		putMap("LQD", "Liquid");
		putMap("OPW", "Optional Wash");
		putMap("PEA", "Peracetic Acid");
		putMap("PLA", "Plastic Goods Wash");
		putMap("PRV", "Prevac");
		putMap("RNS", "Rinse");
		putMap("SFP", "Steam Flush Pressure Pulse");
		putMap("THR", "Thermal");
		putMap("TRB", "Tray/Basin");
		putMap("UTL", "Utensil Wash");
		putMap("WFP", "Wrap/Steam Flush Pressure Pulse (Wrap/SFPP)");

	}

}
