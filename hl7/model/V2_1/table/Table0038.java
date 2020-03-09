package hl7.model.V2_1.table;

import hl7.bean.table.Table;

public class Table0038 extends Table{
	private static final String VERSION = "2.1";
	public static Table getInstance(){
		if(table==null) new Table0038();
		return table;
	}

	public static final String CA = "CA";
	public static final String CM = "CM";
	public static final String DC = "DC";
	public static final String ER = "ER";
	public static final String HD = "HD";
	public static final String IP = "IP";
	public static final String SC = "SC";

	private Table0038(){
		setTableName("ORDER STATUS");
		setOID("2.16.840.1.113883.12.38");

		putMap("CA", "Order was canceled");
		putMap("CM", "Order is completed");
		putMap("DC", "Order was discontinued");
		putMap("ER", "Error, order not found");
		putMap("HD", "Order is on hold");
		putMap("IP", "In process, unspecified");
		putMap("SC", "In process, scheduled");

	}

}
