package hl7.model.V2_6.table;

import hl7.bean.table.Table;

public class Table0112 extends Table{
	private static final String VERSION = "2.6";
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
	public static final String _10_____19 = "10 ... 19";
	public static final String _20 = "20";
	public static final String _21_____29 = "21 ... 29";
	public static final String _30 = "30";
	public static final String _31_____39 = "31 ... 39";
	public static final String _40 = "40";
	public static final String _41 = "41";
	public static final String _42 = "42";

	private Table0112(){
		setTableName("Discharge Disposition");
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
		putMap("10 ... 19", "Discharge to be defined at state level, if necessary");
		putMap("20", "Expired (i.e. dead)");
		putMap("21 ... 29", "Expired to be defined at state level, if necessary");
		putMap("30", "Still patient or expected to return for outpatient services (i.e. still a patient)");
		putMap("31 ... 39", "Still patient to be defined at state level, if necessary  (i.e. still a patient)");
		putMap("40", "Expired (i.e. died) at home");
		putMap("41", "Expired (i.e. died) in a medical facility; e.g., hospital, SNF, ICF, or free standing hospice");
		putMap("42", "Expired (i.e. died)  - place unknown");

	}

}
