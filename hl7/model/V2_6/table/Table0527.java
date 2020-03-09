package hl7.model.V2_6.table;

import hl7.bean.table.Table;

public class Table0527 extends Table{
	private static final String VERSION = "2.6";
	public static Table getInstance(){
		if(table==null) new Table0527();
		return table;
	}

	public static final String DM = "DM";
	public static final String DW = "DW";
	public static final String DY = "DY";
	public static final String HD = "HD";
	public static final String MY = "MY";
	public static final String NH = "NH";
	public static final String SN = "SN";
	public static final String WY = "WY";

	private Table0527(){
		setTableName("Calendar alignment");
		setOID("2.16.840.1.113883.12.527");

		putMap("DM", "day of the month");
		putMap("DW", "day of the week (begins with Monday)");
		putMap("DY", "day of the year");
		putMap("HD", "hour of the day");
		putMap("MY", "month of the year");
		putMap("NH", "minute of the hour");
		putMap("SN", "second of the minute");
		putMap("WY", "week of the year");

	}

}
