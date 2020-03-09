package hl7.model.V2_51.table;

import hl7.bean.table.Table;

public class Table0267 extends Table{
	private static final String VERSION = "2.5.1";
	public static Table getInstance(){
		if(table==null) new Table0267();
		return table;
	}

	public static final String FRI = "FRI";
	public static final String MON = "MON";
	public static final String SAT = "SAT";
	public static final String SUN = "SUN";
	public static final String THU = "THU";
	public static final String TUE = "TUE";
	public static final String WED = "WED";

	private Table0267(){
		setTableName("Days of the week");
		setOID("2.16.840.1.113883.12.267");

		putMap("FRI", "Friday");
		putMap("MON", "Monday");
		putMap("SAT", "Saturday");
		putMap("SUN", "Sunday");
		putMap("THU", "Thursday");
		putMap("TUE", "Tuesday");
		putMap("WED", "Wednesday");

	}

}
