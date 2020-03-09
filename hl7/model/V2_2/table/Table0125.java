package hl7.model.V2_2.table;

import hl7.bean.table.Table;

public class Table0125 extends Table{
	private static final String VERSION = "2.2";
	public static Table getInstance(){
		if(table==null) new Table0125();
		return table;
	}

	public static final String AD = "AD";
	public static final String CE = "CE";
	public static final String CF = "CF";
	public static final String CK = "CK";
	public static final String CM = "CM";
	public static final String CN = "CN";
	public static final String CQ = "CQ";
	public static final String DT = "DT";
	public static final String FT = "FT";
	public static final String ID = "ID";
	public static final String MO = "MO";
	public static final String NM = "NM";
	public static final String PN = "PN";
	public static final String RP = "RP";
	public static final String SI = "SI";
	public static final String ST = "ST";
	public static final String TM = "TM";
	public static final String TN = "TN";
	public static final String TQ = "TQ";
	public static final String TS = "TS";
	public static final String TX = "TX";

	private Table0125(){
		setTableName("VALUE TYPE");
		setOID("2.16.840.1.113883.12.125");

		putMap("AD", "Address");
		putMap("CE", "Coded element");
		putMap("CF", "Coded element with formatted values");
		putMap("CK", "Composite ID with check digit");
		putMap("CM", "Composite");
		putMap("CN", "Composite ID and name");
		putMap("CQ", "Composite quantity with units");
		putMap("DT", "Date");
		putMap("FT", "Formatted text (display)");
		putMap("ID", "Coded value");
		putMap("MO", "Money");
		putMap("NM", "Numeric");
		putMap("PN", "Person name");
		putMap("RP", "Reference pointer");
		putMap("SI", "Sequence ID");
		putMap("ST", "String data");
		putMap("TM", "Time");
		putMap("TN", "Telephone number");
		putMap("TQ", "Timing / quantity");
		putMap("TS", "Time stamp ( date & time)");
		putMap("TX", "Text data (display)");

	}

}
