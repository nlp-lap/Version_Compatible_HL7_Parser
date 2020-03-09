package hl7.model.V2_51.table;

import hl7.bean.table.Table;

public class Table0256 extends Table{
	private static final String VERSION = "2.5.1";
	public static Table getInstance(){
		if(table==null) new Table0256();
		return table;
	}

	public static final String _10D = "10D";
	public static final String _10M = "10M";
	public static final String _12H = "12H";
	public static final String _15M = "15M";
	public static final String _1H = "1H";
	public static final String _1L = "1L";
	public static final String _1M = "1M";
	public static final String _1W = "1W";
	public static final String _2_5H = "2.5H";
	public static final String _20M = "20M";
	public static final String _24H = "24H";
	public static final String _25M = "25M";
	public static final String _2D = "2D";
	public static final String _2H = "2H";
	public static final String _2L = "2L";
	public static final String _2M = "2M";
	public static final String _2W = "2W";
	public static final String _30M = "30M";
	public static final String _3D = "3D";
	public static final String _3H = "3H";
	public static final String _3L = "3L";
	public static final String _3M = "3M";
	public static final String _3W = "3W";
	public static final String _4D = "4D";
	public static final String _4H = "4H";
	public static final String _4M = "4M";
	public static final String _4W = "4W";
	public static final String _5D = "5D";
	public static final String _5H = "5H";
	public static final String _5M = "5M";
	public static final String _6D = "6D";
	public static final String _6H = "6H";
	public static final String _6M = "6M";
	public static final String _7D = "7D";
	public static final String _7H = "7H";
	public static final String _7M = "7M";
	public static final String _8H = "8H";
	public static final String _8H_SHIFT = "8H SHIFT";
	public static final String _8M = "8M";
	public static final String _9M = "9M";
	public static final String BS = "BS";
	public static final String PEAK = "PEAK";
	public static final String RANDOM = "RANDOM";
	public static final String TROUGH = "TROUGH";

	private Table0256(){
		setTableName("Time delay post challenge");
		setOID("2.16.840.1.113883.12.256");

		putMap("10D", "10 days");
		putMap("10M", "10 minutes post challenge");
		putMap("12H", "12 hours post challenge");
		putMap("15M", "15 minutes post challenge");
		putMap("1H", "1 hour post challenge");
		putMap("1L", "1 month (30 days) post challenge");
		putMap("1M", "1 minute post challenge");
		putMap("1W", "1 week");
		putMap("2.5H", "2 1/2 hours post challenge");
		putMap("20M", "20 minutes post challenge");
		putMap("24H", "24 hours post challenge");
		putMap("25M", "25 minutes post challenge");
		putMap("2D", "2 days");
		putMap("2H", "2 hours post challenge");
		putMap("2L", "2 months (60 days) post challenge");
		putMap("2M", "2 minutes post challenge");
		putMap("2W", "2 weeks");
		putMap("30M", "30 minutes post challenge");
		putMap("3D", "3 days");
		putMap("3H", "3 hours post challenge");
		putMap("3L", "3 months (90 days) post challenge");
		putMap("3M", "3 minutes post challenge");
		putMap("3W", "3 weeks");
		putMap("4D", "4 days");
		putMap("4H", "4 hours post challenge");
		putMap("4M", "4 minutes post challenge");
		putMap("4W", "4 weeks");
		putMap("5D", "5 days");
		putMap("5H", "5  hours post challenge");
		putMap("5M", "5 minutes post challenge");
		putMap("6D", "6 days");
		putMap("6H", "6 hours post challenge");
		putMap("6M", "6 minutes post challenge");
		putMap("7D", "7 days");
		putMap("7H", "7 hours post challenge");
		putMap("7M", "7 minutes post challenge");
		putMap("8H", "8 hours post challenge");
		putMap("8H SHIFT", "8 hours aligned on nursing shifts");
		putMap("8M", "8 minutes post challenge");
		putMap("9M", "9 minutes post challenge");
		putMap("BS", "Baseline (time just before the challenge)");
		putMap("PEAK", "The time post drug dose at which the highest drug level is reached (differs by drug)");
		putMap("RANDOM", "Time from the challenge, or dose not specified. (random)");
		putMap("TROUGH", "The time post drug dose at which the lowest drug level is reached (varies with drug)");

	}

}
