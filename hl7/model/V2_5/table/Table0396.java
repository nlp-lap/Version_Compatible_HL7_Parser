package hl7.model.V2_5.table;

import hl7.bean.table.Table;

public class Table0396 extends Table{
	private static final String VERSION = "2.5";
	public static Table getInstance(){
		if(table==null) new Table0396();
		return table;
	}

	public static final String _99zzz_or_L = "99zzz or L";
	public static final String ACR = "ACR";
	public static final String ANS_PLUSE = "ANS+";
	public static final String ART = "ART";
	public static final String AS4 = "AS4";
	public static final String AS4E = "AS4E";
	public static final String ATC = "ATC";
	public static final String C4 = "C4";
	public static final String C5 = "C5";
	public static final String CAS = "CAS";
	public static final String CD2 = "CD2";
	public static final String CDCA = "CDCA";
	public static final String CDCM = "CDCM";
	public static final String CDS = "CDS";
	public static final String CE = "CE";
	public static final String CLP = "CLP";
	public static final String CPTM = "CPTM";
	public static final String CST = "CST";
	public static final String CVX = "CVX";
	public static final String DCM = "DCM";
	public static final String E = "E";
	public static final String E5 = "E5";
	public static final String E6 = "E6";
	public static final String E7 = "E7";
	public static final String ENZC = "ENZC";
	public static final String FDDC = "FDDC";
	public static final String FDDX = "FDDX";
	public static final String FDK = "FDK";
	public static final String HB = "HB";
	public static final String HCPCS = "HCPCS";
	public static final String HCPT = "HCPT";
	public static final String HHC = "HHC";
	public static final String HI = "HI";
	public static final String HL7nnnn = "HL7nnnn";
	public static final String HOT = "HOT";
	public static final String HPC = "HPC";
	public static final String I10 = "I10";
	public static final String I10P = "I10P";
	public static final String I9 = "I9";
	public static final String I9C = "I9C";
	public static final String IBT = "IBT";
	public static final String IBTnnnn = "IBTnnnn";
	public static final String IC2 = "IC2";
	public static final String ICD10AM = "ICD10AM";
	public static final String ICD10CA = "ICD10CA";
	public static final String ICDO = "ICDO";
	public static final String ICS = "ICS";
	public static final String ICSD = "ICSD";
	public static final String ISO_PLUSE = "ISO+";
	public static final String ISOnnnn = "ISOnnnn";
	public static final String IUPC = "IUPC";
	public static final String IUPP = "IUPP";
	public static final String JC10 = "JC10";
	public static final String JC8 = "JC8";
	public static final String JJ1017 = "JJ1017";
	public static final String LB = "LB";
	public static final String LN = "LN";
	public static final String MCD = "MCD";
	public static final String MCR = "MCR";
	public static final String MDDX = "MDDX";
	public static final String MEDC = "MEDC";
	public static final String MEDR = "MEDR";
	public static final String MEDX = "MEDX";
	public static final String MGPI = "MGPI";
	public static final String MVX = "MVX";
	public static final String NDA = "NDA";
	public static final String NDC = "NDC";
	public static final String NIC = "NIC";
	public static final String NPI = "NPI";
	public static final String NUBC = "NUBC";
	public static final String OHA = "OHA";
	public static final String POS = "POS";
	public static final String RC = "RC";
	public static final String SDM = "SDM";
	public static final String SNM = "SNM";
	public static final String SNM3 = "SNM3";
	public static final String SNT = "SNT";
	public static final String UC = "UC";
	public static final String UMD = "UMD";
	public static final String UML = "UML";
	public static final String UPC = "UPC";
	public static final String UPIN = "UPIN";
	public static final String USPS = "USPS";
	public static final String W1 = "W1";
	public static final String W2 = "W2";
	public static final String W4 = "W4";
	public static final String WC = "WC";

	private Table0396(){
		setTableName("Coding system");
		setOID("2.16.840.1.113883.12.396");

		putMap("99zzz or L", "Local general code (where z is an alphanumeric character)");
		putMap("ACR", "American College of Radiology finding codes");
		putMap("ANS+", "HL7 set of units of measure");
		putMap("ART", "WHO Adverse Reaction Terms");
		putMap("AS4", "ASTM E1238/ E1467 Universal");
		putMap("AS4E", "AS4 Neurophysiology Codes");
		putMap("ATC", "American Type Culture Collection");
		putMap("C4", "CPT-4");
		putMap("C5", "CPT-5");
		putMap("CAS", "Chemical abstract codes");
		putMap("CD2", "CDT-2 Codes");
		putMap("CDCA", "CDC Analyte Codes");
		putMap("CDCM", "CDC Methods/Instruments Codes");
		putMap("CDS", "CDC Surveillance");
		putMap("CE", "CEN ECG diagnostic codes");
		putMap("CLP", "CLIP");
		putMap("CPTM", "CPT Modifier Code");
		putMap("CST", "COSTART");
		putMap("CVX", "CDC Vaccine Codes");
		putMap("DCM", "DICOM Controlled Terminology");
		putMap("E", "EUCLIDES");
		putMap("E5", "Euclides  quantity codes");
		putMap("E6", "Euclides Lab method codes");
		putMap("E7", "Euclides Lab equipment codes");
		putMap("ENZC", "Enzyme Codes");
		putMap("FDDC", "First DataBank Drug Codes");
		putMap("FDDX", "First DataBank Diagnostic Codes");
		putMap("FDK", "FDA K10");
		putMap("HB", "HIBCC");
		putMap("HCPCS", "CMS (formerly HCFA)  Common Procedure Coding System");
		putMap("HCPT", "Health Care Provider Taxonomy");
		putMap("HHC", "Home Health Care");
		putMap("HI", "Health Outcomes");
		putMap("HL7nnnn", "HL7 Defined Codes where nnnn is the HL7 table number");
		putMap("HOT", "Japanese Nationwide Medicine Code");
		putMap("HPC", "CMS (formerly HCFA )Procedure Codes (HCPCS)");
		putMap("I10", "ICD-10");
		putMap("I10P", "ICD-10  Procedure Codes");
		putMap("I9", "ICD9");
		putMap("I9C", "ICD-9CM");
		putMap("IBT", "ISBT");
		putMap("IBTnnnn", "ISBT 128 codes where nnnn  specifies a specific table within ISBT 128.");
		putMap("IC2", "ICHPPC-2");
		putMap("ICD10AM", "ICD-10 Australian modification");
		putMap("ICD10CA", "ICD-10 Canada");
		putMap("ICDO", "International Classification of Diseases for Oncology");
		putMap("ICS", "ICCS");
		putMap("ICSD", "International Classification of Sleep Disorders");
		putMap("ISO+", "ISO 2955.83 (units of measure) with HL7 extensions");
		putMap("ISOnnnn", "ISO Defined Codes where nnnn is the ISO table number");
		putMap("IUPC", "IUPAC/IFCC Component Codes");
		putMap("IUPP", "IUPAC/IFCC Property Codes");
		putMap("JC10", "JLAC/JSLM, nationwide laboratory code");
		putMap("JC8", "Japanese Chemistry");
		putMap("JJ1017", "Japanese Image Examination Cache");
		putMap("LB", "Local billing code");
		putMap("LN", "Logical Observation Identifier Names and Codes (LOINC��)");
		putMap("MCD", "Medicaid");
		putMap("MCR", "Medicare");
		putMap("MDDX", "Medispan Diagnostic Codes");
		putMap("MEDC", "Medical Economics Drug Codes");
		putMap("MEDR", "Medical Dictionary for Drug Regulatory Affairs (MEDDRA)");
		putMap("MEDX", "Medical Economics Diagnostic Codes");
		putMap("MGPI", "Medispan GPI");
		putMap("MVX", "CDC Vaccine Manufacturer Codes");
		putMap("NDA", "NANDA");
		putMap("NDC", "National drug codes");
		putMap("NIC", "Nursing Interventions Classification");
		putMap("NPI", "National Provider Identifier");
		putMap("NUBC", "National Uniform Billing Committee Code");
		putMap("OHA", "Omaha System");
		putMap("POS", "POS Codes");
		putMap("RC", "Read Classification");
		putMap("SDM", "SNOMED- DICOM Microglossary");
		putMap("SNM", "Systemized Nomenclature of Medicine (SNOMED)");
		putMap("SNM3", "SNOMED International");
		putMap("SNT", "SNOMED topology codes (anatomic sites)");
		putMap("UC", "UCDS");
		putMap("UMD", "MDNS");
		putMap("UML", "Unified Medical Language");
		putMap("UPC", "Universal Product Code");
		putMap("UPIN", "UPIN");
		putMap("USPS", "United States Postal Service");
		putMap("W1", "WHO record # drug codes (6 digit)");
		putMap("W2", "WHO record # drug codes (8 digit)");
		putMap("W4", "WHO record # code with ASTM extension");
		putMap("WC", "WHO ATC");

	}

}
