package hl7.model.V2_4.table;

import hl7.bean.table.Table;

public class Table0153 extends Table{
	private static final String VERSION = "2.4";
	public static Table getInstance(){
		if(table==null) new Table0153();
		return table;
	}

	public static final String _01 = "01";
	public static final String _02 = "02";
	public static final String _04 = "04";
	public static final String _05 = "05";
	public static final String _06 = "06";
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
	public static final String _21 = "21";
	public static final String _22 = "22";
	public static final String _23 = "23";
	public static final String _24 = "24";
	public static final String _30 = "30";
	public static final String _31 = "31";
	public static final String _37 = "37";
	public static final String _38 = "38";
	public static final String _39 = "39";
	public static final String _40 = "40";
	public static final String _41 = "41";
	public static final String _42 = "42";
	public static final String _43 = "43";
	public static final String _44 = "44";
	public static final String _45 = "45";
	public static final String _46 = "46";
	public static final String _47 = "47";
	public static final String _48 = "48";
	public static final String _49 = "49";
	public static final String _50 = "50";
	public static final String _51 = "51";
	public static final String _52 = "52";
	public static final String _53 = "53";
	public static final String _56 = "56";
	public static final String _57 = "57";
	public static final String _58 = "58";
	public static final String _59 = "59";
	public static final String _60 = "60";
	public static final String _67 = "67";
	public static final String _68 = "68";
	public static final String _70_____72 = "70 ... 72";
	public static final String _75_____79 = "75 ... 79";
	public static final String _80 = "80";
	public static final String _81 = "81";
	public static final String A1 = "A1";
	public static final String A2 = "A2";
	public static final String A3 = "A3";
	public static final String X0 = "X0";
	public static final String X4 = "X4";

	private Table0153(){
		setTableName("Value code");
		setOID("2.16.840.1.113883.12.153");

		putMap("01", "Most common semi-private rate");
		putMap("02", "Hospital has no semi-private rooms");
		putMap("04", "Inpatient professional component charges which are combined billed");
		putMap("05", "Professional component included in charges and also billed separate to carrier");
		putMap("06", "Medicare blood deductible");
		putMap("08", "Medicare life time reserve amount in the first calendar year");
		putMap("09", "Medicare co-insurance amount in the first calendar year");
		putMap("10", "Lifetime reserve amount in the second calendar year");
		putMap("11", "Co-insurance amount in the second calendar year");
		putMap("12", "Working aged beneficiary/spouse with employer group health plan");
		putMap("13", "ESRD beneficiary in a Medicare coordination period with an employer group health plan");
		putMap("14", "No Fault including auto/other");
		putMap("15", "Worker's Compensation");
		putMap("16", "PHS, or other federal agency");
		putMap("17", "Payer code");
		putMap("21", "Catastrophic");
		putMap("22", "Surplus");
		putMap("23", "Recurring monthly incode");
		putMap("24", "Medicaid rate code");
		putMap("30", "Pre-admission testing");
		putMap("31", "Patient liability amount");
		putMap("37", "Pints of blood furnished");
		putMap("38", "Blood deductible pints");
		putMap("39", "Pints of blood replaced");
		putMap("40", "New coverage not implemented by HMO (for inpatient service only)");
		putMap("41", "Black lung");
		putMap("42", "VA");
		putMap("43", "Disabled beneficiary under age 64 with LGHP");
		putMap("44", "Amount provider agreed to accept from primary payer when this amount is less than charges but higher than payment received,, then a Medicare secondary payment is due");
		putMap("45", "Accident hour");
		putMap("46", "Number of grace days");
		putMap("47", "Any liability insurance");
		putMap("48", "Hemoglobin reading");
		putMap("49", "Hematocrit reading");
		putMap("50", "Physical therapy visits");
		putMap("51", "Occupational therapy visits");
		putMap("52", "Speech therapy visits");
		putMap("53", "Cardiac rehab visits");
		putMap("56", "Skilled nurse - home visit hours");
		putMap("57", "Home health aide - home visit hours");
		putMap("58", "Arterial blood gas");
		putMap("59", "Oxygen saturation");
		putMap("60", "HHA branch MSA");
		putMap("67", "Peritoneal dialysis");
		putMap("68", "EPO-drug");
		putMap("70 ... 72", "Payer codes");
		putMap("75 ... 79", "Payer codes");
		putMap("80", "Psychiatric visits");
		putMap("81", "Visits subject to co-payment");
		putMap("A1", "Deductible payer A");
		putMap("A2", "Coinsurance payer A");
		putMap("A3", "Estimated responsibility payer A");
		putMap("X0", "Service excluded on primary policy");
		putMap("X4", "Supplemental coverage");

	}

}
