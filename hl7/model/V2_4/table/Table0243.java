package hl7.model.V2_4.table;

import hl7.bean.table.Table;

public class Table0243 extends Table{
	private static final String VERSION = "2.4";
	public static Table getInstance(){
		if(table==null) new Table0243();
		return table;
	}

	public static final String N = "N";
	public static final String NA = "NA";
	public static final String Y = "Y";

	private Table0243(){
		setTableName("Identity may be divulged");
		setOID("2.16.840.1.113883.12.243");

		putMap("N", "No");
		putMap("NA", "Not applicable");
		putMap("Y", "Yes");

	}

}
