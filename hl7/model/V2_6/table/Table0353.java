package hl7.model.V2_6.table;

import hl7.bean.table.Table;

public class Table0353 extends Table{
	private static final String VERSION = "2.6";
	public static Table getInstance(){
		if(table==null) new Table0353();
		return table;
	}

	public static final String NA = "NA";
	public static final String NASK = "NASK";
	public static final String NAV = "NAV";
	public static final String U = "U";
	public static final String UASK = "UASK";

	private Table0353(){
		setTableName("CWE statuses");
		setOID("2.16.840.1.113883.12.353");

		putMap("NA", "Not applicable");
		putMap("NASK", "Not asked");
		putMap("NAV", "Not available");
		putMap("U", "Unknown");
		putMap("UASK", "Asked but Unknown");

	}

}
