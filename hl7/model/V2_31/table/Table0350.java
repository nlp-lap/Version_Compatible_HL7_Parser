package hl7.model.V2_31.table;

import hl7.bean.table.Table;

public class Table0350 extends Table{
	private static final String VERSION = "2.3.1";
	public static Table getInstance(){
		if(table==null) new Table0350();
		return table;
	}

	public static final String _01 = "01";
	public static final String _02 = "02";
	public static final String _03 = "03";
	public static final String _04 = "04";
	public static final String _05 = "05";
	public static final String _06 = "06";
	public static final String _09 = "09";
	public static final String _10 = "10";
	public static final String _11 = "11";
	public static final String _12 = "12";
	public static final String _17 = "17";
	public static final String _18 = "18";
	public static final String _19 = "19";
	public static final String _20 = "20";
	public static final String _21 = "21";
	public static final String _22 = "22";
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
	public static final String _40 = "40";
	public static final String _41 = "41";
	public static final String _42 = "42";
	public static final String _43 = "43";
	public static final String _44 = "44";
	public static final String _45 = "45";
	public static final String _46 = "46";
	public static final String _47_____49 = "47 ... 49";
	public static final String _50 = "50";
	public static final String _51 = "51";
	public static final String _70_____99 = "70 ... 99";
	public static final String A1 = "A1";
	public static final String A2 = "A2";
	public static final String A3 = "A3";

	private Table0350(){
		setTableName("Occurrence code");
		setOID("2.16.840.1.113883.12.350");

		putMap("01", "Auto accident");
		putMap("02", "No fault insurance involved-including auto accident/other");
		putMap("03", "Accident/tort liability");
		putMap("04", "Accident/employment related");
		putMap("05", "Other accident");
		putMap("06", "Crime victim");
		putMap("09", "Start of infertility treatment cycle");
		putMap("10", "Last menstrual period");
		putMap("11", "Onset of symptoms/illness");
		putMap("12", "Date of onset for a chronically dependent individual");
		putMap("17", "Date outpatient occupational therapy plan established or last reviewed");
		putMap("18", "Date of retirement patient/beneficiary");
		putMap("19", "Date of retirement spouse");
		putMap("20", "Guarantee of payment began");
		putMap("21", "UR notice received");
		putMap("22", "Date active care ended");
		putMap("24", "Date insurance denied");
		putMap("25", "Date benefits terminated by primary payor");
		putMap("26", "Date SNF bed available");
		putMap("27", "Date home health plan established");
		putMap("28", "Spouse¡¯s date of birth");
		putMap("29", "Date outpatient physical therapy plan established or last reviewed");
		putMap("30", "Date outpatient speech pathology plan established or last reviewed");
		putMap("31", "Date beneficiary notified of intent to bill (accommodations)");
		putMap("32", "Date beneficiary notified of intent to bill (procedures or treatments)");
		putMap("33", "First day of the Medicare coordination period for ESRD beneficiaries covered by EGHP");
		putMap("34", "Date of election of extended care facilities");
		putMap("35", "Date treatment started for P.T.");
		putMap("36", "Date of inpatient hospital discharge for covered transplant patients");
		putMap("37", "Date of inpatient hospital discharge for non-covered transplant patient");
		putMap("40", "Scheduled date of admission");
		putMap("41", "Date of first test for pre-admission testing");
		putMap("42", "Date of discharge");
		putMap("43", "Scheduled date of canceled surgery");
		putMap("44", "Date treatment started for O.T.");
		putMap("45", "Date treatment started for S.T.");
		putMap("46", "Date treatment started for cardiac rehab.");
		putMap("47 ... 49", "Payer codes");
		putMap("50", "Date lien released");
		putMap("51", "Date treatment started for psychiatric care");
		putMap("70 ... 99", "Occurrence span codes and dates");
		putMap("A1", "Birthdate - insured A");
		putMap("A2", "Effective date - insured A policy");
		putMap("A3", "Benefits exhausted payer A");

	}

}
