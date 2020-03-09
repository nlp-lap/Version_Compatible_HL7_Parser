package hl7.model.V2_6.table;

import hl7.bean.table.Table;

public class Table0235 extends Table{
	private static final String VERSION = "2.6";
	public static Table getInstance(){
		if(table==null) new Table0235();
		return table;
	}

	public static final String C = "C";
	public static final String D = "D";
	public static final String E = "E";
	public static final String H = "H";
	public static final String L = "L";
	public static final String M = "M";
	public static final String N = "N";
	public static final String O = "O";
	public static final String P = "P";
	public static final String R = "R";

	private Table0235(){
		setTableName("Report source");
		setOID("2.16.840.1.113883.12.235");

		putMap("C", "Clinical trial");
		putMap("D", "Database/registry/poison control center");
		putMap("E", "Distributor");
		putMap("H", "Health professional");
		putMap("L", "Literature");
		putMap("M", "Manufacturer/marketing authority holder");
		putMap("N", "Non-healthcare professional");
		putMap("O", "Other");
		putMap("P", "Patient");
		putMap("R", "Regulatory agency");

	}

}
