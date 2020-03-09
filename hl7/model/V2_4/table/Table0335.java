package hl7.model.V2_4.table;

import hl7.bean.table.Table;

public class Table0335 extends Table{
	private static final String VERSION = "2.4";
	public static Table getInstance(){
		if(table==null) new Table0335();
		return table;
	}

	public static final String A = "A";
	public static final String BID = "BID";
	public static final String C = "C";
	public static final String D = "D";
	public static final String I = "I";
	public static final String M = "M";
	public static final String Meal_Related_Timings = "Meal Related Timings";
	public static final String Once = "Once";
	public static final String P = "P";
	public static final String PRN = "PRN";
	public static final String PRNxxx = "PRNxxx";
	public static final String Q_integer_D = "Q<integer>D";
	public static final String Q_integer_H = "Q<integer>H";
	public static final String Q_integer_J_day__ = "Q<integer>J<day#>";
	public static final String Q_integer_L = "Q<integer>L";
	public static final String Q_integer_M = "Q<integer>M";
	public static final String Q_integer_S = "Q<integer>S";
	public static final String Q_integer_W = "Q<integer>W";
	public static final String QAM = "QAM";
	public static final String QHS = "QHS";
	public static final String QID = "QID";
	public static final String QOD = "QOD";
	public static final String QPM = "QPM";
	public static final String QSHIFT = "QSHIFT";
	public static final String TID = "TID";
	public static final String U__spec_ = "U <spec>";
	public static final String V = "V";
	public static final String xID = "xID";

	private Table0335(){
		setTableName("Repeat pattern");
		setOID("2.16.840.1.113883.12.335");

		putMap("A", "Ante (before)");
		putMap("BID", "twice a day at institution-specified times (e.g., 9AM-4PM)");
		putMap("C", "service is provided continuously between start time and stop time");
		putMap("D", "Cibus Diurnus (lunch)");
		putMap("I", "Inter (e.g., between this meal and the next, between dinner and sleep");
		putMap("M", "Cibus Matutinus (breakfast)");
		putMap("Meal Related Timings", "<timing>C (cum)<meal>");
		putMap("Once", "one time only.  This is also the default when this component is null.");
		putMap("P", "Post (after)");
		putMap("PRN", "given as needed");
		putMap("PRNxxx", "where xxx is some frequency code (e.g., PRNQ6H); given as needed over the frequency period.");
		putMap("Q<integer>D", "every <integer> days");
		putMap("Q<integer>H", "every <integer> hours");
		putMap("Q<integer>J<day#>", "repeats on a particular day of the week, from the French jour (day).  If <integer> is missing, the repeat rate is assumed to be 1.  Day numbers are counted from 1=Monday to 7=Sunday.  So Q2J2 means every second Tuesday; Q1J6 means every Saturday.");
		putMap("Q<integer>L", "every <integer> months (Lunar cycle)");
		putMap("Q<integer>M", "every <integer> minutes");
		putMap("Q<integer>S", "every <integer> seconds");
		putMap("Q<integer>W", "every <integer> weeks");
		putMap("QAM", "in the morning at institution-specified time");
		putMap("QHS", "every day before the hour of sleep");
		putMap("QID", "four times a day at institution-specified times (e.g., 9AM-11AM-4PM-9PM)");
		putMap("QOD", "every other day (same as Q2D)");
		putMap("QPM", "in the evening at institution-specified time");
		putMap("QSHIFT", "during each of three eight-hour shifts at institution-specified times");
		putMap("TID", "three times a day at institution-specified times (e.g., 9AM-4PM-9PM)");
		putMap("U <spec>", "for future use, where <spec> is an interval specification as defined by the UNIX cron specification.");
		putMap("V", "Cibus Vespertinus (dinner)");
		putMap("xID", "X times per day at institution-specified times, where X is a numeral 5 or greater.  E.g., 5ID=five times per day; 8ID=8 times per day");

	}

}
