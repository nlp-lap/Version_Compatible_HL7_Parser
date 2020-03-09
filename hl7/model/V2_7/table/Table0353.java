package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0353 extends Table{
	private static final String VERSION = "2.7";
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
		setOID("");

		putMap("NA", "Not applicable");
		putMap("NASK", "Not asked");
		putMap("NAV", "Not available");
		putMap("U", "Unknown");
		putMap("UASK", "Asked but Unknown");

	}

}
