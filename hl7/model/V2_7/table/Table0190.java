package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0190 extends Table{
	private static final String VERSION = "2.7";
	public static Table getInstance(){
		if(table==null) new Table0190();
		return table;
	}

	public static final String B = "B";
	public static final String BA = "BA";
	public static final String BDL = "BDL";
	public static final String BI = "BI";
	public static final String BR = "BR";
	public static final String C = "C";
	public static final String F = "F";
	public static final String H = "H";
	public static final String L = "L";
	public static final String M = "M";
	public static final String N = "N";
	public static final String O = "O";
	public static final String P = "P";
	public static final String RH = "RH";
	public static final String S = "S";
	public static final String SH = "SH";
	public static final String TM = "TM";
	public static final String V = "V";

	private Table0190(){
		setTableName("Address Type");
		setOID("");

		putMap("B", "Firm/Business");
		putMap("BA", "Bad address");
		putMap("BDL", "Birth delivery location  (address where birth occurred)");
		putMap("BI", "Billing Address");
		putMap("BR", "Residence at birth (home address at time of birth)");
		putMap("C", "Current Or Temporary");
		putMap("F", "Country Of Origin");
		putMap("H", "Home");
		putMap("L", "Legal Address");
		putMap("M", "Mailing");
		putMap("N", "Birth (nee)  (birth address, not otherwise specified)");
		putMap("O", "Office/Business");
		putMap("P", "Permanent");
		putMap("RH", "Registry home. Refers to the information system, typically managed by a public health agency, that stores patient information such as immunization histories or cancer data, regardless of where the patient obtains services.");
		putMap("S", "Service Location");
		putMap("SH", "Shipping Address");
		putMap("TM", "Tube Address");
		putMap("V", "Vacation");

	}

}
