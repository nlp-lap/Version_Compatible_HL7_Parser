package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0203 extends Table{
	private static final String VERSION = "2.7";
	public static Table getInstance(){
		if(table==null) new Table0203();
		return table;
	}

	public static final String ACSN = "ACSN";
	public static final String AM = "AM";
	public static final String AMA = "AMA";
	public static final String AN = "AN";
	public static final String An_Identifier_for_a_provi = "An Identifier for a provi";
	public static final String ANC = "ANC";
	public static final String AND = "AND";
	public static final String ANON = "ANON";
	public static final String ANT = "ANT";
	public static final String APRN = "APRN";
	public static final String ASID = "ASID";
	public static final String BA = "BA";
	public static final String BC = "BC";
	public static final String BCT = "BCT";
	public static final String BR = "BR";
	public static final String BRN = "BRN";
	public static final String BSNR = "BSNR";
	public static final String CC = "CC";
	public static final String CONM = "CONM";
	public static final String CY = "CY";
	public static final String CZ = "CZ";
	public static final String DDS = "DDS";
	public static final String DEA = "DEA";
	public static final String DFN = "DFN";
	public static final String DI = "DI";
	public static final String DL = "DL";
	public static final String DN = "DN";
	public static final String DO = "DO";
	public static final String DP = "DP";
	public static final String DPM = "DPM";
	public static final String DR = "DR";
	public static final String DS = "DS";
	public static final String EI = "EI";
	public static final String EN = "EN";
	public static final String ESN = "ESN";
	public static final String FI = "FI";
	public static final String GI = "GI";
	public static final String GL = "GL";
	public static final String GN = "GN";
	public static final String HC = "HC";
	public static final String IND = "IND";
	public static final String JHN = "JHN";
	public static final String LACSN = "LACSN";
	public static final String LANR = "LANR";
	public static final String LI = "LI";
	public static final String LN = "LN";
	public static final String LR = "LR";
	public static final String MA = "MA";
	public static final String MB = "MB";
	public static final String MC = "MC";
	public static final String MCD = "MCD";
	public static final String MCN = "MCN";
	public static final String MCR = "MCR";
	public static final String MCT = "MCT";
	public static final String MD = "MD";
	public static final String MI = "MI";
	public static final String MR = "MR";
	public static final String MRT = "MRT";
	public static final String MS = "MS";
	public static final String NBSNR = "NBSNR";
	public static final String NCT = "NCT";
	public static final String NE = "NE";
	public static final String NH = "NH";
	public static final String NI = "NI";
	public static final String NII = "NII";
	public static final String NIIP = "NIIP";
	public static final String NNxxx = "NNxxx";
	public static final String NP = "NP";
	public static final String NPI = "NPI";
	public static final String OD = "OD";
	public static final String PA = "PA";
	public static final String PC = "PC";
	public static final String PCN = "PCN";
	public static final String PE = "PE";
	public static final String PEN = "PEN";
	public static final String PI = "PI";
	public static final String PN = "PN";
	public static final String PNT = "PNT";
	public static final String PPIN = "PPIN";
	public static final String PPN = "PPN";
	public static final String PRC = "PRC";
	public static final String PRN = "PRN";
	public static final String PT = "PT";
	public static final String QA = "QA";
	public static final String RI = "RI";
	public static final String RN = "RN";
	public static final String RPH = "RPH";
	public static final String RR = "RR";
	public static final String RRI = "RRI";
	public static final String RRP = "RRP";
	public static final String SID = "SID";
	public static final String SL = "SL";
	public static final String SN = "SN";
	public static final String SP = "SP";
	public static final String SR = "SR";
	public static final String SS = "SS";
	public static final String TAX = "TAX";
	public static final String TN = "TN";
	public static final String TPR = "TPR";
	public static final String U = "U";
	public static final String UPIN = "UPIN";
	public static final String USID = "USID";
	public static final String VN = "VN";
	public static final String VP = "VP";
	public static final String VS = "VS";
	public static final String WC = "WC";
	public static final String WCN = "WCN";
	public static final String WP = "WP";
	public static final String XX = "XX";

	private Table0203(){
		setTableName("Identifier Type");
		setOID("");

		putMap("ACSN", "Accession ID");
		putMap("AM", "American Express");
		putMap("AMA", "American Medical Association Number");
		putMap("AN", "Account number");
		putMap("An Identifier for a provi", "");
		putMap("ANC", "Account number Creditor");
		putMap("AND", "Account number debitor");
		putMap("ANON", "Anonymous identifier");
		putMap("ANT", "Temporary Account Number");
		putMap("APRN", "Advanced Practice Registered Nurse number");
		putMap("ASID", "Ancestor Specimen ID");
		putMap("BA", "Bank Account Number");
		putMap("BC", "Bank Card Number");
		putMap("BCT", "Birth Certificate");
		putMap("BR", "Birth registry number");
		putMap("BRN", "Breed Registry Number");
		putMap("BSNR", "Primary physician office number");
		putMap("CC", "Cost Center number");
		putMap("CONM", "Change of Name Document");
		putMap("CY", "County number");
		putMap("CZ", "Citizenship Card");
		putMap("DDS", "Dentist license number");
		putMap("DEA", "Drug Enforcement Administration registration number");
		putMap("DFN", "Drug Furnishing or prescriptive authority Number");
		putMap("DI", "Diner's Club card");
		putMap("DL", "Driver's license number");
		putMap("DN", "Doctor number");
		putMap("DO", "Osteopathic License number");
		putMap("DP", "Diplomatic Passport");
		putMap("DPM", "Podiatrist license number");
		putMap("DR", "Donor Registration Number");
		putMap("DS", "Discover Card");
		putMap("EI", "Employee number");
		putMap("EN", "Employer number");
		putMap("ESN", "Staff Enterprise Number");
		putMap("FI", "Facility ID");
		putMap("GI", "Guarantor internal identifier");
		putMap("GL", "General ledger number");
		putMap("GN", "Guarantor external  identifier");
		putMap("HC", "Health Card Number");
		putMap("IND", "Indigenous/Aboriginal");
		putMap("JHN", "Jurisdictional health number (Canada)");
		putMap("LACSN", "Laboratory Accession ID");
		putMap("LANR", "Lifelong physician number");
		putMap("LI", "Labor and industries number");
		putMap("LN", "License number");
		putMap("LR", "Local Registry ID");
		putMap("MA", "Patient Medicaid number");
		putMap("MB", "Member Number");
		putMap("MC", "Patient's Medicare number");
		putMap("MCD", "Practitioner Medicaid number");
		putMap("MCN", "Microchip Number");
		putMap("MCR", "Practitioner Medicare number");
		putMap("MCT", "Marriage Certificate");
		putMap("MD", "Medical License number");
		putMap("MI", "Military ID number");
		putMap("MR", "Medical record number");
		putMap("MRT", "Temporary Medical Record Number");
		putMap("MS", "MasterCard");
		putMap("NBSNR", "Secondary physician office number");
		putMap("NCT", "Naturalization Certificate");
		putMap("NE", "National employer identifier");
		putMap("NH", "National Health Plan Identifier");
		putMap("NI", "National unique individual identifier");
		putMap("NII", "National Insurance Organization Identifier");
		putMap("NIIP", "National Insurance Payor Identifier (Payor)");
		putMap("NNxxx", "National Person Identifier where the xxx is the ISO table 3166 3-character (alphabetic) country code");
		putMap("NP", "Nurse practitioner number");
		putMap("NPI", "National provider identifier");
		putMap("OD", "Optometrist license number");
		putMap("PA", "Physician Assistant number");
		putMap("PC", "Parole Card");
		putMap("PCN", "Penitentiary/correctional institution Number");
		putMap("PE", "Living Subject Enterprise Number");
		putMap("PEN", "Pension Number");
		putMap("PI", "Patient internal identifier");
		putMap("PN", "Person number");
		putMap("PNT", "Temporary Living Subject Number");
		putMap("PPIN", "Medicare/CMS Performing Provider Identification Number");
		putMap("PPN", "Passport number");
		putMap("PRC", "Permanent Resident Card Number");
		putMap("PRN", "Provider number");
		putMap("PT", "Patient external identifier");
		putMap("QA", "QA number");
		putMap("RI", "Resource identifier");
		putMap("RN", "Registered Nurse Number");
		putMap("RPH", "Pharmacist license number");
		putMap("RR", "Railroad Retirement number");
		putMap("RRI", "Regional registry ID");
		putMap("RRP", "Railroad Retirement Provider");
		putMap("SID", "Specimen ID");
		putMap("SL", "State license");
		putMap("SN", "Subscriber Number");
		putMap("SP", "Study Permit");
		putMap("SR", "State registry ID");
		putMap("SS", "Social Security number");
		putMap("TAX", "Tax ID number");
		putMap("TN", "Treaty Number/ (Canada)");
		putMap("TPR", "Temporary Permanent Resident (Canada)");
		putMap("U", "Unspecified identifier");
		putMap("UPIN", "Medicare/CMS (formerly HCFA)'s Universal Physician Identification numbers");
		putMap("USID", "Unique Specimen ID");
		putMap("VN", "Visit number");
		putMap("VP", "Visitor Permit");
		putMap("VS", "VISA");
		putMap("WC", "WIC identifier");
		putMap("WCN", "Workers' Comp Number");
		putMap("WP", "Work Permit");
		putMap("XX", "Organization identifier");

	}

}