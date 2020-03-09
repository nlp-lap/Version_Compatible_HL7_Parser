package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0235 extends Table{
	private static final String VERSION = "2.7";
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
		setTableName("Report Source");
		setOID("");

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
