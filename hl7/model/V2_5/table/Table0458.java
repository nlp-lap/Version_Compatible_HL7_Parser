package hl7.model.V2_5.table;

import hl7.bean.table.Table;

public class Table0458 extends Table{
	private static final String VERSION = "2.5";
	public static Table getInstance(){
		if(table==null) new Table0458();
		return table;
	}

	public static final String _1 = "1";
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
	public static final String _2 = "2";
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
	public static final String _3 = "3";
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
	public static final String _4 = "4";
	public static final String _40_ = "40.";
	public static final String _41_ = "41.";
	public static final String _42_ = "42.";
	public static final String _5 = "5";
	public static final String _6 = "6";
	public static final String _7 = "7";
	public static final String _8 = "8";
	public static final String _9 = "9";

	private Table0458(){
		setTableName("OCE Edit Code");
		setOID("2.16.840.1.113883.12.458");

		putMap("1", "Invalid diagnosis code");
		putMap("10", "Non-covered  service submitted for verification of denial (condition code 21 from header information on claim)");
		putMap("11", "Non-covered service submitted for FI review (condition code 20 from header information on claim)");
		putMap("12", "Questionable covered service");
		putMap("13", "Additional payment for service not provided by Medicare");
		putMap("14", "Code indicates a site of service not included in OPPS");
		putMap("15", "Service unit out of range for procedure");
		putMap("16", "Multiple bilateral procedures without modifier 50 (see Appendix A)");
		putMap("17", "Multiple bilateral procedures with modifier 50 (see Appendix A)");
		putMap("18", "Inpatient procedure");
		putMap("19", "Mutually exclusive procedure that is not allowed even if appropriate modifier present");
		putMap("2", "Diagnosis and age conflict");
		putMap("20", "Component of a comprehensive procedure that is not allowed even if appropriate modifier present");
		putMap("21", "Medical visit on same day as a type T or S procedure without modifier 25 (see Appendix B)");
		putMap("22", "Invalid modifier");
		putMap("23", "Invalid date");
		putMap("24", "Date out of OCE range");
		putMap("25", "Invalid age");
		putMap("26", "Invalid sex");
		putMap("27", "Only incidental services reported");
		putMap("28", "Code not recognized by Medicare; alternate code for same service available");
		putMap("29", "Partial hospitalization service for non-mental health diagnosis");
		putMap("3", "Diagnosis and sex conflict");
		putMap("30", "Insufficient services on day of partial hospitalization");
		putMap("31", "Partial hospitalization on same day as ECT or type T procedure");
		putMap("32", "Partial hospitalization claim spans 3 or less days with in-sufficient services, or ECT or significant procedure on at least one of the days");
		putMap("33", "Partial hospitalization claim spans more than 3 days with insufficient number of days having mental health services");
		putMap("34", "Partial hospitalization claim spans more than 3 days with insufficient number of days meeting partial hospitalization criteria");
		putMap("35", "Only activity therapy and/or occupational therapy services provided");
		putMap("36", "Extensive mental health services provided on day of ECT or significant procedure");
		putMap("37", "Terminated bilateral procedure or terminated procedure with units greater than one");
		putMap("38", "Inconsistency between implanted device and implantation procedure");
		putMap("39", "Mutually exclusive procedure that would be allowed if appropriate modifier were present");
		putMap("4", "Medicare secondary payer alert");
		putMap("40.", "Component of a comprehensive procedure that would be allowed if appropriate modifier were present");
		putMap("41.", "Invalid revenue code");
		putMap("42.", "Multiple medical visits on same day with same revenue code without condition code G0 (see Appendix B)");
		putMap("5", "E-code as reason for visit");
		putMap("6", "Invalid procedure code");
		putMap("7", "Procedure and age conflict");
		putMap("8", "Procedure and sex conflict");
		putMap("9", "Nov-covered service");

	}

}
