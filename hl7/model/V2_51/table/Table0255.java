package hl7.model.V2_51.table;

import hl7.bean.table.Table;

public class Table0255 extends Table{
	private static final String VERSION = "2.5.1";
	public static Table getInstance(){
		if(table==null) new Table0255();
		return table;
	}

	public static final String STAR = "*";
	public static final String _12H = "12H";
	public static final String _1H = "1H";
	public static final String _1L = "1L";
	public static final String _1W = "1W";
	public static final String _2_5H = "2.5H";
	public static final String _24H = "24H";
	public static final String _2D = "2D";
	public static final String _2H = "2H";
	public static final String _2L = "2L";
	public static final String _2W = "2W";
	public static final String _30M = "30M";
	public static final String _3D = "3D";
	public static final String _3H = "3H";
	public static final String _3L = "3L";
	public static final String _3W = "3W";
	public static final String _4D = "4D";
	public static final String _4H = "4H";
	public static final String _4W = "4W";
	public static final String _5D = "5D";
	public static final String _5H = "5H";
	public static final String _6D = "6D";
	public static final String _6H = "6H";
	public static final String _7H = "7H";
	public static final String _8H = "8H";
	public static final String PT = "PT";

	private Table0255(){
		setTableName("Duration categories");
		setOID("2.16.840.1.113883.12.255");

		putMap("*", "(asterisk) Life of the unit.  Used for blood products.");
		putMap("12H", "12 hours");
		putMap("1H", "1 hour");
		putMap("1L", "1 months (30 days)");
		putMap("1W", "1 week");
		putMap("2.5H", "2A¨ö hours");
		putMap("24H", "24 hours");
		putMap("2D", "2 days");
		putMap("2H", "2 hours");
		putMap("2L", "2 months");
		putMap("2W", "2 weeks");
		putMap("30M", "30 minutes");
		putMap("3D", "3 days");
		putMap("3H", "3 hours");
		putMap("3L", "3 months");
		putMap("3W", "3 weeks");
		putMap("4D", "4 days");
		putMap("4H", "4 hours");
		putMap("4W", "4 weeks");
		putMap("5D", "5 days");
		putMap("5H", "5 hours");
		putMap("6D", "6 days");
		putMap("6H", "6 hours");
		putMap("7H", "7 hours");
		putMap("8H", "8 hours");
		putMap("PT", "To identify measures at a point in time.  This is a synonym for spot or random as applied to urine measurements.");

	}

}
