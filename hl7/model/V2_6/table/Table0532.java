package hl7.model.V2_6.table;

import hl7.bean.table.Table;

public class Table0532 extends Table{
	private static final String VERSION = "2.6";
	public static Table getInstance(){
		if(table==null) new Table0532();
		return table;
	}

	public static final String ASKU = "ASKU";
	public static final String N = "N";
	public static final String NA = "NA";
	public static final String NASK = "NASK";
	public static final String NAV = "NAV";
	public static final String NI = "NI";
	public static final String NP = "NP";
	public static final String UNK = "UNK";
	public static final String Y = "Y";

	private Table0532(){
		setTableName("Expanded yes/no indicator");
		setOID("2.16.840.1.113883.12.532");

		putMap("ASKU", "asked but unknown");
		putMap("N", "No");
		putMap("NA", "not applicable");
		putMap("NASK", "not asked");
		putMap("NAV", "temporarily unavailable");
		putMap("NI", "No Information");
		putMap("NP", "not present");
		putMap("UNK", "unknown");
		putMap("Y", "Yes");

	}

}
