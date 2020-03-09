package hl7.model.V2_31.table;

import hl7.bean.table.Table;

public class Table0112 extends Table{
	private static final String VERSION = "2.3.1";
	public static Table getInstance(){
		if(table==null) new Table0112();
		return table;
	}

	public static final String _01 = "01";
	public static final String _02 = "02";
	public static final String _03 = "03";
	public static final String _04 = "04";
	public static final String _05 = "05";
	public static final String _06 = "06";
	public static final String _07 = "07";
	public static final String _08 = "08";
	public static final String _09 = "09";
	public static final String _10 = "10";
	public static final String _11 = "11";
	public static final String _12 = "12";
	public static final String _13 = "13";
	public static final String _14 = "14";
	public static final String _15 = "15";
	public static final String _16 = "16";
	public static final String _17 = "17";
	public static final String _18 = "18";
	public static final String _19 = "19";
	public static final String _20 = "20";
	public static final String _21 = "21";
	public static final String _22 = "22";
	public static final String _23 = "23";
	public static final String _24 = "24";
	public static final String _25 = "25";
	public static final String _26 = "26";
	public static final String _27 = "27";
	public static final String _28 = "28";
	public static final String _29 = "29";
	public static final String _30 = "30";
	public static final String _31 = "31";
	public static final String _32 = "32";
	public static final String _33 = "33";
	public static final String _34 = "34";
	public static final String _35 = "35";
	public static final String _36 = "36";
	public static final String _37 = "37";
	public static final String _38 = "38";
	public static final String _39 = "39";
	public static final String _40 = "40";
	public static final String _41 = "41";
	public static final String _42 = "42";

	private Table0112(){
		setTableName("Discharge disposition");
		setOID("2.16.840.1.113883.12.112");

		putMap("01", "Discharged to home or self care (routine discharge)");
		putMap("02", "Discharged/transferred to another short term general hospital for inpatient care");
		putMap("03", "Discharged/transferred to skilled nursing facility (SNF)");
		putMap("04", "Discharged/transferred to an intermediate care facility (ICF)");
		putMap("05", "Discharged/transferred to another type of institution for inpatient care or referred for outpatient services to another institution");
		putMap("06", "Discharged/transferred to home under care of organized home health service organization");
		putMap("07", "Left against medical advice or discontinued care");
		putMap("08", "Discharged/transferred to home under care of Home IV provider");
		putMap("09", "Admitted as an inpatient to this hospital");
		putMap("10", "Discharge to be defined at state level, if necessary");
		putMap("11", "Discharge to be defined at state level, if necessary");
		putMap("12", "Discharge to be defined at state level, if necessary");
		putMap("13", "Discharge to be defined at state level, if necessary");
		putMap("14", "Discharge to be defined at state level, if necessary");
		putMap("15", "Discharge to be defined at state level, if necessary");
		putMap("16", "Discharge to be defined at state level, if necessary");
		putMap("17", "Discharge to be defined at state level, if necessary");
		putMap("18", "Discharge to be defined at state level, if necessary");
		putMap("19", "Discharge to be defined at state level, if necessary");
		putMap("20", "Expired");
		putMap("21", "Expired to be defined at state level, if necessary");
		putMap("22", "Expired to be defined at state level, if necessary");
		putMap("23", "Expired to be defined at state level, if necessary");
		putMap("24", "Expired to be defined at state level, if necessary");
		putMap("25", "Expired to be defined at state level, if necessary");
		putMap("26", "Expired to be defined at state level, if necessary");
		putMap("27", "Expired to be defined at state level, if necessary");
		putMap("28", "Expired to be defined at state level, if necessary");
		putMap("29", "Expired to be defined at state level, if necessary");
		putMap("30", "Still patient or expected to return for outpatient services");
		putMap("31", "Still patient to be defined at state level, if necessary");
		putMap("32", "Still patient to be defined at state level, if necessary");
		putMap("33", "Still patient to be defined at state level, if necessary");
		putMap("34", "Still patient to be defined at state level, if necessary");
		putMap("35", "Still patient to be defined at state level, if necessary");
		putMap("36", "Still patient to be defined at state level, if necessary");
		putMap("37", "Still patient to be defined at state level, if necessary");
		putMap("38", "Still patient to be defined at state level, if necessary");
		putMap("39", "Still patient to be defined at state level, if necessary");
		putMap("40", "Expired at home");
		putMap("41", "Expired in a medical facility; e.g., hospital, SNF, ICF, or free standing hospice");
		putMap("42", "Expired - place unknown");

	}

}
