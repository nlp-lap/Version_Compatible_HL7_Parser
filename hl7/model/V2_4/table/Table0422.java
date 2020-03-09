package hl7.model.V2_4.table;

import hl7.bean.table.Table;

public class Table0422 extends Table{
	private static final String VERSION = "2.4";
	public static Table getInstance(){
		if(table==null) new Table0422();
		return table;
	}

	public static final String _1 = "1";
	public static final String _2 = "2";
	public static final String _3 = "3";
	public static final String _4 = "4";
	public static final String _5 = "5";
	public static final String _99 = "99";

	private Table0422(){
		setTableName("Triage code");
		setOID("2.16.840.1.113883.12.422");

		putMap("1", "Non-acute");
		putMap("2", "Acute");
		putMap("3", "Urgent");
		putMap("4", "Severe");
		putMap("5", "Dead on Arrival (DOA)");
		putMap("99", "Other");

	}

}
