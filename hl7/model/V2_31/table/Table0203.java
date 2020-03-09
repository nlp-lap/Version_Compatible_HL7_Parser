package hl7.model.V2_31.table;

import hl7.bean.table.Table;

public class Table0203 extends Table{
	private static final String VERSION = "2.3.1";
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
	public static final String FI = "FI";
	public static final String GI = "GI";
	public static final String GN = "GN";
	public static final String LN = "LN";
	public static final String LR = "LR";
	public static final String MA = "MA";
	public static final String MC = "MC";
	public static final String MR = "MR";
	public static final String MS = "MS";
	public static final String NE = "NE";
	public static final String NH = "NH";
	public static final String NI = "NI";
	public static final String NNxxx = "NNxxx";
	public static final String NPI = "NPI";
	public static final String PI = "PI";
	public static final String PN = "PN";
	public static final String PRN = "PRN";
	public static final String PT = "PT";
	public static final String RR = "RR";
	public static final String RRI = "RRI";
	public static final String SL = "SL";
	public static final String SR = "SR";
	public static final String SS = "SS";
	public static final String U = "U";
	public static final String UPIN = "UPIN";
	public static final String VN = "VN";
	public static final String VS = "VS";
	public static final String WC = "WC";
	public static final String XX = "XX";

	private Table0203(){
		setTableName("Identifier type");
		setOID("2.16.840.1.113883.12.203");

		putMap("AM", "American Express");
		putMap("AN", "Account number");
		putMap("BR", "Birth registry number");
		putMap("DI", "Diner¡¯s Club card");
		putMap("DL", "Driver¡¯s license number");
		putMap("DN", "Doctor number");
		putMap("DS", "Discover Card");
		putMap("EI", "Employee number");
		putMap("EN", "Employer number");
		putMap("FI", "Facility ID");
		putMap("GI", "Guarantor internal identifier");
		putMap("GN", "Guarantor external  identifier");
		putMap("LN", "License number");
		putMap("LR", "Local Registry ID");
		putMap("MA", "Medicaid number");
		putMap("MC", "Medicare number");
		putMap("MR", "Medical record number");
		putMap("MS", "MasterCard");
		putMap("NE", "National employer identifier");
		putMap("NH", "National Health Plan Identifier");
		putMap("NI", "National unique individual identifier");
		putMap("NNxxx", "National Person Identifier where the xxx is the ISO table 3166  3-character (alphabetic) country  code");
		putMap("NPI", "National provider identifier");
		putMap("PI", "Patient internal identifier");
		putMap("PN", "Person number");
		putMap("PRN", "Provider number");
		putMap("PT", "Patient external identifier");
		putMap("RR", "Railroad Retirement number");
		putMap("RRI", "Regional registry ID");
		putMap("SL", "State license");
		putMap("SR", "State registry ID");
		putMap("SS", "Social Security number");
		putMap("U", "Unspecified");
		putMap("UPIN", "Medicare/HCFA¡¯s Universal Physician Identification numbers");
		putMap("VN", "Visit number");
		putMap("VS", "VISA");
		putMap("WC", "WIC identifier");
		putMap("XX", "Organization identifier");

	}

}
