package hl7.model.V2_4.table;

import hl7.bean.table.Table;

public class Table0125 extends Table{
	private static final String VERSION = "2.4";
	public static Table getInstance(){
		if(table==null) new Table0125();
		return table;
	}

	public static final String AD = "AD";
	public static final String CE = "CE";
	public static final String CF = "CF";
	public static final String CK = "CK";
	public static final String CN = "CN";
	public static final String CP = "CP";
	public static final String CX = "CX";
	public static final String DT = "DT";
	public static final String ED = "ED";
	public static final String FT = "FT";
	public static final String MO = "MO";
	public static final String NM = "NM";
	public static final String PN = "PN";
	public static final String RP = "RP";
	public static final String SN = "SN";
	public static final String ST = "ST";
	public static final String TM = "TM";
	public static final String TN = "TN";
	public static final String TS = "TS";
	public static final String TX = "TX";
	public static final String XAD = "XAD";
	public static final String XCN = "XCN";
	public static final String XON = "XON";
	public static final String XPN = "XPN";
	public static final String XTN = "XTN";

	private Table0125(){
		setTableName("Value type");
		setOID("2.16.840.1.113883.12.125");

		putMap("AD", "Address");
		putMap("CE", "Coded Entry");
		putMap("CF", "Coded Element With Formatted Values");
		putMap("CK", "Composite ID With Check Digit");
		putMap("CN", "Composite ID And Name");
		putMap("CP", "Composite Price");
		putMap("CX", "Extended Composite ID With Check Digit");
		putMap("DT", "Date");
		putMap("ED", "Encapsulated Data");
		putMap("FT", "Formatted Text (Display)");
		putMap("MO", "Money");
		putMap("NM", "Numeric");
		putMap("PN", "Person Name");
		putMap("RP", "Reference Pointer");
		putMap("SN", "Structured Numeric");
		putMap("ST", "String Data.");
		putMap("TM", "Time");
		putMap("TN", "Telephone Number");
		putMap("TS", "Time Stamp (Date & Time)");
		putMap("TX", "Text Data (Display)");
		putMap("XAD", "Extended Address");
		putMap("XCN", "Extended Composite Name And Number For Persons");
		putMap("XON", "Extended Composite Name And Number For Organizations");
		putMap("XPN", "Extended Person Name");
		putMap("XTN", "Extended Telecommunications Number");

	}

}
