package hl7.model.V2_3.table;

import hl7.bean.table.Table;

public class Table0203 extends Table{
	private static final String VERSION = "2.3";
	public static Table getInstance(){
		if(table==null) new Table0203();
		return table;
	}

	public static final String AM = "AM";
	public static final String AN = "AN";
	public static final String BR = "BR";
	public static final String DI = "DI";
	public static final String DL = "DL";
	public static final String DN = "DN";
	public static final String DS = "DS";
	public static final String EI = "EI";
	public static final String EN = "EN";
	public static final String GI = "GI";
	public static final String GN = "GN";
	public static final String MA = "MA";
	public static final String MC = "MC";
	public static final String MR = "MR";
	public static final String MS = "MS";
	public static final String PI = "PI";
	public static final String PT = "PT";
	public static final String RR = "RR";
	public static final String SS = "SS";
	public static final String VN = "VN";
	public static final String VS = "VS";
	public static final String XX = "XX";

	private Table0203(){
		setTableName("Identifier Type");
		setOID("2.16.840.1.113883.12.203");

		putMap("AM", "American Express");
		putMap("AN", "Account Number");
		putMap("BR", "Birth Registry Number");
		putMap("DI", "Diner's Club Card");
		putMap("DL", "Driver's License Number");
		putMap("DN", "Doctor Number");
		putMap("DS", "Discover Card");
		putMap("EI", "Employee Number");
		putMap("EN", "Employer Number");
		putMap("GI", "Guarantor Internal Identifier");
		putMap("GN", "Guarantor External Identifier");
		putMap("MA", "Medicaid Number");
		putMap("MC", "Medicare Number");
		putMap("MR", "Medical Record Number");
		putMap("MS", "Master Card");
		putMap("PI", "Patient Internal Identifier");
		putMap("PT", "Patient External Identifier");
		putMap("RR", "Railroad Retirement Number");
		putMap("SS", "Social Security Number");
		putMap("VN", "Visit Number");
		putMap("VS", "VISA");
		putMap("XX", "Organizaiton Indentifier");

	}

}
