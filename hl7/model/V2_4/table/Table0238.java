package hl7.model.V2_4.table;

import hl7.bean.table.Table;

public class Table0238 extends Table{
	private static final String VERSION = "2.4";
	public static Table getInstance(){
		if(table==null) new Table0238();
		return table;
	}

	public static final String N = "N";
	public static final String S = "S";
	public static final String Y = "Y";

	private Table0238(){
		setTableName("Event seriousness");
		setOID("2.16.840.1.113883.12.238");

		putMap("N", "No");
		putMap("S", "Significant");
		putMap("Y", "Yes");

	}

}
