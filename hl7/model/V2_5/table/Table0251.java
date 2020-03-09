package hl7.model.V2_5.table;

import hl7.bean.table.Table;

public class Table0251 extends Table{
	private static final String VERSION = "2.5";
	public static Table getInstance(){
		if(table==null) new Table0251();
		return table;
	}

	public static final String DI = "DI";
	public static final String DR = "DR";
	public static final String N = "N";
	public static final String OT = "OT";
	public static final String WP = "WP";
	public static final String WT = "WT";

	private Table0251(){
		setTableName("Action Taken in Response to the Event");
		setOID("2.16.840.1.113883.12.251");

		putMap("DI", "Product dose or frequency of use increased");
		putMap("DR", "Product dose or frequency of use reduced");
		putMap("N", "None");
		putMap("OT", "Other");
		putMap("WP", "Product withdrawn permanently");
		putMap("WT", "Product withdrawn temporarily");

	}

}
