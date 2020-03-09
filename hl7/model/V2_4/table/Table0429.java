package hl7.model.V2_4.table;

import hl7.bean.table.Table;

public class Table0429 extends Table{
	private static final String VERSION = "2.4";
	public static Table getInstance(){
		if(table==null) new Table0429();
		return table;
	}

	public static final String BR = "BR";
	public static final String DA = "DA";
	public static final String DR = "DR";
	public static final String DU = "DU";
	public static final String LY = "LY";
	public static final String MT = "MT";
	public static final String NA = "NA";
	public static final String OT = "OT";
	public static final String PL = "PL";
	public static final String RA = "RA";
	public static final String SH = "SH";
	public static final String U = "U";

	private Table0429(){
		setTableName("Production class Code");
		setOID("2.16.840.1.113883.12.429");

		putMap("BR", "Breeding/genetic stock");
		putMap("DA", "Dairy");
		putMap("DR", "Draft");
		putMap("DU", "Dual Purpose");
		putMap("LY", "Layer, Includes Multiplier flocks");
		putMap("MT", "Meat");
		putMap("NA", "Not Applicable");
		putMap("OT", "Other");
		putMap("PL", "Pleasure");
		putMap("RA", "Racing");
		putMap("SH", "Show");
		putMap("U", "Unknown");

	}

}
