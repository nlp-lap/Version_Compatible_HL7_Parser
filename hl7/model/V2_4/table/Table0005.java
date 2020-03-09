package hl7.model.V2_4.table;

import hl7.bean.table.Table;

public class Table0005 extends Table{
	private static final String VERSION = "2.4";
	public static Table getInstance(){
		if(table==null) new Table0005();
		return table;
	}

	public static final String _1002_5 = "1002-5";
	public static final String _2028_9 = "2028-9";
	public static final String _2054_5 = "2054-5";
	public static final String _2076_8 = "2076-8";
	public static final String _2106_3 = "2106-3";
	public static final String _2131_1 = "2131-1";

	private Table0005(){
		setTableName("Race");
		setOID("2.16.840.1.113883.12.5");

		putMap("1002-5", "American Indian or Alaska Native");
		putMap("2028-9", "Asian");
		putMap("2054-5", "Black or African American");
		putMap("2076-8", "Native Hawaiian or Other Pacific Islander");
		putMap("2106-3", "White");
		putMap("2131-1", "Other Race");

	}

}
