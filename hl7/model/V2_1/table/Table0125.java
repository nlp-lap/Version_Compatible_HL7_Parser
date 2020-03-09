package hl7.model.V2_1.table;

import hl7.bean.table.Table;

public class Table0125 extends Table{
	private static final String VERSION = "2.1";
	public static Table getInstance(){
		if(table==null) new Table0125();
		return table;
	}

	public static final String AD = "AD";
	public static final String CK = "CK";
	public static final String FT = "FT";
	public static final String PN = "PN";
	public static final String ST = "ST";
	public static final String TM = "TM";
	public static final String TS = "TS";
	public static final String TX = "TX";

	private Table0125(){
		setTableName("VALUE TYPE");
		setOID("2.16.840.1.113883.12.125");

		putMap("AD", "Address");
		putMap("CK", "Composite ID with check digit");
		putMap("FT", "Formatted Text");
		putMap("PN", "Person name");
		putMap("ST", "String data. Used to transmit numerics.");
		putMap("TM", "Time");
		putMap("TS", "Time stamp");
		putMap("TX", "Text");

	}

}
