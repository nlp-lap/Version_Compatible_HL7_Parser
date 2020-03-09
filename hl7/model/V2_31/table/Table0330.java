package hl7.model.V2_31.table;

import hl7.bean.table.Table;

public class Table0330 extends Table{
	private static final String VERSION = "2.3.1";
	public static Table getInstance(){
		if(table==null) new Table0330();
		return table;
	}

	public static final String _510E = "510E";
	public static final String _510K = "510K";
	public static final String _522S = "522S";
	public static final String PMA = "PMA";
	public static final String PRE = "PRE";
	public static final String TXN = "TXN";

	private Table0330(){
		setTableName("Marketing basis");
		setOID("2.16.840.1.113883.12.330");

		putMap("510E", "510 (K) exempt");
		putMap("510K", "510 (K)");
		putMap("522S", "Post marketing study (522)");
		putMap("PMA", "Premarketing authorization");
		putMap("PRE", "Preamendment");
		putMap("TXN", "Transitional");

	}

}
