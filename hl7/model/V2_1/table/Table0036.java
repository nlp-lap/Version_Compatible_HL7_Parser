package hl7.model.V2_1.table;

import hl7.bean.table.Table;

public class Table0036 extends Table{
	private static final String VERSION = "2.1";
	public static Table getInstance(){
		if(table==null) new Table0036();
		return table;
	}

	public static final String BT = "BT";
	public static final String EA = "EA";
	public static final String GM = "GM";
	public static final String KG = "KG";
	public static final String MEQ = "MEQ";
	public static final String MG = "MG";
	public static final String OZ = "OZ";
	public static final String SC = "SC";
	public static final String TB = "TB";
	public static final String VL = "VL";

	private Table0036(){
		setTableName("UNITS OF MEASURE - ISO528,1977");
		setOID("2.16.840.1.113883.12.36");

		putMap("BT", "Bottle");
		putMap("EA", "Each");
		putMap("GM", "Grams");
		putMap("KG", "Kilograms");
		putMap("MEQ", "Milliequivalent");
		putMap("MG", "Milligrams");
		putMap("OZ", "Ounces");
		putMap("SC", "Square centimeters");
		putMap("TB", "Tablet");
		putMap("VL", "Vial");

	}

}
