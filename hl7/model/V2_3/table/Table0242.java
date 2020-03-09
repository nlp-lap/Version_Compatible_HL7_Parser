package hl7.model.V2_3.table;

import hl7.bean.table.Table;

public class Table0242 extends Table{
	private static final String VERSION = "2.3";
	public static Table getInstance(){
		if(table==null) new Table0242();
		return table;
	}

	public static final String C = "C";
	public static final String H = "H";
	public static final String L = "L";
	public static final String M = "M";
	public static final String O = "O";
	public static final String P = "P";
	public static final String R = "R";

	private Table0242(){
		setTableName("Primary Observer's Qualification");
		setOID("2.16.840.1.113883.12.242");

		putMap("C", "Health care consumer/patient");
		putMap("H", "Other health professional");
		putMap("L", "Lawyer/attorney");
		putMap("M", "Mid-level professional (nurse, nurse practitioner, physician's assistant)");
		putMap("O", "Other non-health professional");
		putMap("P", "Physician (osteopath, homeopath)");
		putMap("R", "Pharmacist");

	}

}
