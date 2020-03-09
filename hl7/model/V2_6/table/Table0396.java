package hl7.model.V2_6.table;

import hl7.bean.table.Table;

public class Table0396 extends Table{
	private static final String VERSION = "2.6";
	public static Table getInstance(){
		if(table==null) new Table0396();
		return table;
	}

	public static final String _99zzz_or_L = "99zzz or L";
	public static final String ACR = "ACR";
	public static final String ALPHAID2006 = "ALPHAID2006";
	public static final String ALPHAID2007 = "ALPHAID2007";
	public static final String ALPHAID2008 = "ALPHAID2008";
	public static final String ANS_PLUSE = "ANS+";
	public static final String ART = "ART";
	public static final String AS4 = "AS4";
	public static final String AS4E = "AS4E";
	public static final String ATC = "ATC";
	public static final String C4 = "C4";
	public static final String C5 = "C5";
	public static final String CAS = "CAS";
	public static final String CCC = "CCC";
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
	public static final String GDRG2004 = "GDRG2004";
	public static final String GDRG2005 = "GDRG2005";
	public static final String GDRG2006 = "GDRG2006";
	public static final String GDRG2007 = "GDRG2007";
	public static final String GDRG2008 = "GDRG2008";
	public static final String GMDC2004 = "GMDC2004";
	public static final String GMDC2005 = "GMDC2005";
	public static final String GMDC2006 = "GMDC2006";
	public static final String GMDC2007 = "GMDC2007";
	public static final String GMDC2008 = "GMDC2008";
	public static final String HB = "HB";
	public static final String HCPCS = "HCPCS";
	public static final String HCPT = "HCPT";
	public static final String HHC = "HHC";
	public static final String HI = "HI";
	public static final String HL7nnnn = "HL7nnnn";
	public static final String HOT = "HOT";
	public static final String HPC = "HPC";
	public static final String I10 = "I10";
	public static final String I10G2004 = "I10G2004";
	public static final String I10G2005 = "I10G2005";
	public static final String I10G2006 = "I10G2006";
	public static final String I10P = "I10P";
	public static final String I9 = "I9";
	public static final String I9C = "I9C";
	public static final String I9CDX = "I9CDX";
	public static final String I9CP = "I9CP";
	public static final String IBT = "IBT";
	public static final String IBTnnnn = "IBTnnnn";
	public static final String ICD10AM = "ICD10AM";
	public static final String ICD10CA = "ICD10CA";
	public static final String ICD10GM2007 = "ICD10GM2007";
	public static final String ICD10GM2008 = "ICD10GM2008";
	public static final String ICDO = "ICDO";
	public static final String ICS = "ICS";
	public static final String ICSD = "ICSD";
	public static final String ISO_PLUSE = "ISO+";
	public static final String ISOnnnn = "ISOnnnn";
	public static final String ITIS = "ITIS";
	public static final String IUPC = "IUPC";
	public static final String IUPP = "IUPP";
	public static final String JC10 = "JC10";
	public static final String JC8 = "JC8";
	public static final String JJ1017 = "JJ1017";
	public static final String LB = "LB";
	public static final String LN = "LN";
	public static final String MCD = "MCD";
	public static final String MCR = "MCR";
	public static final String MDC = "MDC";
	public static final String MDDX = "MDDX";
	public static final String MEDC = "MEDC";
	public static final String MEDR = "MEDR";
	public static final String MEDX = "MEDX";
	public static final String MGPI = "MGPI";
	public static final String MVX = "MVX";
	public static final String NCPDPnnnnsss = "NCPDPnnnnsss";
	public static final String NDA = "NDA";
	public static final String NDC = "NDC";
	public static final String NIC = "NIC";
	public static final String NPI = "NPI";
	public static final String NUBC = "NUBC";
	public static final String O301 = "O301";
	public static final String O3012004 = "O3012004";
	public static final String O3012005 = "O3012005";
	public static final String O3012006 = "O3012006";
	public static final String OHA = "OHA";
	public static final String OPS2007 = "OPS2007";
	public static final String OPS2008 = "OPS2008";
	public static final String POS = "POS";
	public static final String RC = "RC";
	public static final String SCT = "SCT";
	public static final String SCT2 = "SCT2";
	public static final String SDM = "SDM";
	public static final String SNM = "SNM";
	public static final String SNM3 = "SNM3";
	public static final String SNT = "SNT";
	public static final String UB04FL14 = "UB04FL14";
	public static final String UB04FL15 = "UB04FL15";
	public static final String UB04FL17 = "UB04FL17";
	public static final String UC = "UC";
	public static final String UCUM = "UCUM";
	public static final String UMD = "UMD";
	public static final String UML = "UML";
	public static final String UPC = "UPC";
	public static final String UPIN = "UPIN";
	public static final String USPS = "USPS";
	public static final String W1 = "W1";
	public static final String W2 = "W2";
	public static final String W4 = "W4";
	public static final String WC = "WC";
	public static final String X12DEnnnn = "X12DEnnnn";

	private Table0396(){
		setTableName("Coding system");
		setOID("2.16.840.1.113883.12.396");

		putMap("99zzz or L", "Local general code (where z is an alphanumeric character)");
		putMap("ACR", "American College of Radiology finding codes");
		putMap("ALPHAID2006", "German Alpha-ID v2006");
		putMap("ALPHAID2007", "German Alpha-ID v2007");
		putMap("ALPHAID2008", "German Alpha-ID v2008");
		putMap("ANS+", "HL7 set of units of measure");
		putMap("ART", "WHO Adverse Reaction Terms");
		putMap("AS4", "ASTM E1238/ E1467 Universal");
		putMap("AS4E", "AS4 Neurophysiology Codes");
		putMap("ATC", "American Type Culture Collection");
		putMap("C4", "CPT-4");
		putMap("C5", "CPT-5");
		putMap("CAS", "Chemical abstract codes");
		putMap("CCC", "Clinical Care Classification system");
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
		putMap("GDRG2004", "G-DRG German DRG Codes v2004");
		putMap("GDRG2005", "G-DRG German DRG Codes v2005");
		putMap("GDRG2006", "G-DRG German DRG Codes v2006");
		putMap("GDRG2007", "G-DRG German DRG Codes v2007");
		putMap("GDRG2008", "G-DRG German DRG Codes v2008");
		putMap("GMDC2004", "German Major Diagnostic Codes v2004");
		putMap("GMDC2005", "German Major Diagnostic Codes v2005");
		putMap("GMDC2006", "German Major Diagnostic Codes v2006");
		putMap("GMDC2007", "German Major Diagnostic Codes v2007");
		putMap("GMDC2008", "German Major Diagnostic Codes v2008");
		putMap("HB", "HIBCC");
		putMap("HCPCS", "CMS (formerly HCFA)  Common Procedure Coding System");
		putMap("HCPT", "Health Care Provider Taxonomy");
		putMap("HHC", "Home Health Care");
		putMap("HI", "Health Outcomes");
		putMap("HL7nnnn", "HL7 Defined Codes where nnnn is the HL7 table number");
		putMap("HOT", "Japanese Nationwide Medicine Code");
		putMap("HPC", "CMS (formerly HCFA )Procedure Codes (HCPCS)");
		putMap("I10", "ICD-10");
		putMap("I10G2004", "ICD 10 Germany v2004");
		putMap("I10G2005", "ICD 10 Germany v2005");
		putMap("I10G2006", "ICD 10 Germany v2006");
		putMap("I10P", "ICD-10  Procedure Codes");
		putMap("I9", "ICD9");
		putMap("I9C", "ICD-9CM");
		putMap("I9CDX", "ICD-9CM Diagnosis codes");
		putMap("I9CP", "ICD-9CM Procedure codes");
		putMap("IBT", "ISBT");
		putMap("IBTnnnn", "ISBT 128 codes where nnnn  specifies a specific table within ISBT 128.");
		putMap("ICD10AM", "ICD-10 Australian modification");
		putMap("ICD10CA", "ICD-10 Canada");
		putMap("ICD10GM2007", "ICD 10 Germany v2007");
		putMap("ICD10GM2008", "ICD 10 Germany v2008");
		putMap("ICDO", "International Classification of Diseases for Oncology");
		putMap("ICS", "ICCS");
		putMap("ICSD", "International Classification of Sleep Disorders");
		putMap("ISO+", "ISO 2955.83 (units of measure) with HL7 extensions");
		putMap("ISOnnnn", "ISO Defined Codes where nnnn is the ISO table number");
		putMap("ITIS", "Integrated Taxonomic Information System");
		putMap("IUPC", "IUPAC/IFCC Component Codes");
		putMap("IUPP", "IUPAC/IFCC Property Codes");
		putMap("JC10", "JLAC/JSLM, nationwide laboratory code");
		putMap("JC8", "Japanese Chemistry");
		putMap("JJ1017", "Japanese Image Examination Cache");
		putMap("LB", "Local billing code");
		putMap("LN", "Logical Observation Identifier Names and Codes (LOINCA��)");
		putMap("MCD", "Medicaid");
		putMap("MCR", "Medicare");
		putMap("MDC", "Medical Device Communication");
		putMap("MDDX", "Medispan Diagnostic Codes");
		putMap("MEDC", "Medical Economics Drug Codes");
		putMap("MEDR", "Medical Dictionary for Drug Regulatory Affairs (MEDDRA)");
		putMap("MEDX", "Medical Economics Diagnostic Codes");
		putMap("MGPI", "Medispan GPI");
		putMap("MVX", "CDC Vaccine Manufacturer Codes");
		putMap("NCPDPnnnnsss", "NCPDP code list for data element nnnn [as used in segment sss]");
		putMap("NDA", "NANDA");
		putMap("NDC", "National drug codes");
		putMap("NIC", "Nursing Interventions Classification");
		putMap("NPI", "National Provider Identifier");
		putMap("NUBC", "National Uniform Billing Committee Code");
		putMap("O301", "German Procedure Codes");
		putMap("O3012004", "OPS Germany v2004");
		putMap("O3012005", "OPS Germany v2005");
		putMap("O3012006", "OPS Germany v2006");
		putMap("OHA", "Omaha System");
		putMap("OPS2007", "OPS Germany v2007");
		putMap("OPS2008", "OPS Germany v2008");
		putMap("POS", "POS Codes");
		putMap("RC", "Read Classification");
		putMap("SCT", "SNOMED Clinical Terms");
		putMap("SCT2", "SNOMED Clinical Terms alphanumeric codes");
		putMap("SDM", "SNOMED- DICOM Microglossary");
		putMap("SNM", "Systemized Nomenclature of Medicine (SNOMED)");
		putMap("SNM3", "SNOMED International");
		putMap("SNT", "SNOMED topology codes (anatomic sites)");
		putMap("UB04FL14", "Priority (Type) of Visit");
		putMap("UB04FL15", "Point of Origin");
		putMap("UB04FL17", "Patient Discharge Status");
		putMap("UC", "UCDS");
		putMap("UCUM", "UCUM code set for units of measure(from Regenstrief)");
		putMap("UMD", "MDNS");
		putMap("UML", "Unified Medical Language");
		putMap("UPC", "Universal Product Code");
		putMap("UPIN", "UPIN");
		putMap("USPS", "United States Postal Service");
		putMap("W1", "WHO record # drug codes (6 digit)");
		putMap("W2", "WHO record # drug codes (8 digit)");
		putMap("W4", "WHO record # code with ASTM extension");
		putMap("WC", "WHO ATC");
		putMap("X12DEnnnn", "ASC X12 Code List nnnn");

	}

}
