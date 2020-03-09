package hl7.model.V2_4.table;

import hl7.bean.table.Table;

public class Table0440 extends Table{
	private static final String VERSION = "2.4";
	public static Table getInstance(){
		if(table==null) new Table0440();
		return table;
	}

	public static final String AD = "AD";
	public static final String CD = "CD";
	public static final String CE = "CE";
	public static final String CF = "CF";
	public static final String CK = "CK";
	public static final String CM = "CM";
	public static final String CN = "CN";
	public static final String CNE = "CNE";
	public static final String CP = "CP";
	public static final String CQ = "CQ";
	public static final String CWE = "CWE";
	public static final String CX = "CX";
	public static final String DLN = "DLN";
	public static final String DR = "DR";
	public static final String DT = "DT";
	public static final String ED = "ED";
	public static final String EI = "EI";
	public static final String FC = "FC";
	public static final String FN = "FN";
	public static final String FT = "FT";
	public static final String HD = "HD";
	public static final String ID = "ID";
	public static final String IS = "IS";
	public static final String JCC = "JCC";
	public static final String MA = "MA";
	public static final String MO = "MO";
	public static final String NA = "NA";
	public static final String NM = "NM";
	public static final String PL = "PL";
	public static final String PN = "PN";
	public static final String PPN = "PPN";
	public static final String PT = "PT";
	public static final String QIP = "QIP";
	public static final String QSC = "QSC";
	public static final String RCD = "RCD";
	public static final String RI = "RI";
	public static final String RP = "RP";
	public static final String SAD = "SAD";
	public static final String SCV = "SCV";
	public static final String SI = "SI";
	public static final String SN = "SN";
	public static final String SRT = "SRT";
	public static final String ST = "ST";
	public static final String TM = "TM";
	public static final String TN = "TN";
	public static final String TQ = "TQ";
	public static final String TS = "TS";
	public static final String TX = "TX";
	public static final String VH = "VH";
	public static final String VID = "VID";
	public static final String XAD = "XAD";
	public static final String XCN = "XCN";
	public static final String XON = "XON";
	public static final String XPN = "XPN";
	public static final String XTN = "XTN";

	private Table0440(){
		setTableName("Data types");
		setOID("2.16.840.1.113883.12.440");

		putMap("AD", "Address");
		putMap("CD", "Channel definition");
		putMap("CE", "Coded element");
		putMap("CF", "Coded element with formatted values");
		putMap("CK", "Composite ID with check digit");
		putMap("CM", "Composite");
		putMap("CN", "Composite ID number and name");
		putMap("CNE", "Coded with no exceptions");
		putMap("CP", "Composite price");
		putMap("CQ", "Composite quantity with units");
		putMap("CWE", "Coded with exceptions");
		putMap("CX", "Extended composite ID with check digit");
		putMap("DLN", "Driver's license number");
		putMap("DR", "Date/time range");
		putMap("DT", "Date");
		putMap("ED", "Encapsulated data");
		putMap("EI", "Entity identifier");
		putMap("FC", "Financial class");
		putMap("FN", "Family name");
		putMap("FT", "Formatted text");
		putMap("HD", "Hierarchic designator");
		putMap("ID", "Coded values for HL7 tables");
		putMap("IS", "Coded value for user-defined tables");
		putMap("JCC", "Job code/class");
		putMap("MA", "Multiplexed array");
		putMap("MO", "Money");
		putMap("NA", "Numeric array");
		putMap("NM", "Numeric");
		putMap("PL", "Person location");
		putMap("PN", "Person name");
		putMap("PPN", "Performing person time stamp");
		putMap("PT", "Processing type");
		putMap("QIP", "Query input parameter list");
		putMap("QSC", "Query selection criteria");
		putMap("RCD", "Row column definition");
		putMap("RI", "Repeat interval");
		putMap("RP", "Reference pointer");
		putMap("SAD", "Street Address");
		putMap("SCV", "Scheduling class value pair");
		putMap("SI", "Sequence ID");
		putMap("SN", "Structured numeric");
		putMap("SRT", "Sort order");
		putMap("ST", "String");
		putMap("TM", "Time");
		putMap("TN", "Telephone number");
		putMap("TQ", "Timing/quantity");
		putMap("TS", "Time stamp");
		putMap("TX", "Text data");
		putMap("VH", "Visiting hours");
		putMap("VID", "Version identifier");
		putMap("XAD", "Extended address");
		putMap("XCN", "Extended composite ID number and name");
		putMap("XON", "Extended composite name and ID number for organizations");
		putMap("XPN", "Extended person name");
		putMap("XTN", "Extended telecommunications number");

	}

}
