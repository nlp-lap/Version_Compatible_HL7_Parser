package hl7.model.V2_4.table;

import hl7.bean.table.Table;

public class Table0363 extends Table{
	private static final String VERSION = "2.4";
	public static Table getInstance(){
		if(table==null) new Table0363();
		return table;
	}

	public static final String AUSDVA = "AUSDVA";
	public static final String AUSHIC = "AUSHIC";
	public static final String CANAB = "CANAB";
	public static final String CANBC = "CANBC";
	public static final String CANMB = "CANMB";
	public static final String CANNB = "CANNB";
	public static final String CANNF = "CANNF";
	public static final String CANNS = "CANNS";
	public static final String CANNT = "CANNT";
	public static final String CANNU = "CANNU";
	public static final String CANON = "CANON";
	public static final String CANPE = "CANPE";
	public static final String CANQC = "CANQC";
	public static final String CANSK = "CANSK";
	public static final String CANYT = "CANYT";
	public static final String NLVWS = "NLVWS";
	public static final String USCDC = "USCDC";
	public static final String USHCFA = "USHCFA";
	public static final String USSSA = "USSSA";

	private Table0363(){
		setTableName("Assigning authority");
		setOID("2.16.840.1.113883.12.363");

		putMap("AUSDVA", "Australia - Dept. of Veterans Affairs");
		putMap("AUSHIC", "Australia - Health Insurance Commission");
		putMap("CANAB", "Canada - Alberta");
		putMap("CANBC", "Canada - British Columbia");
		putMap("CANMB", "Canada - Manitoba");
		putMap("CANNB", "Canada - New Brunswick");
		putMap("CANNF", "Canada - Newfoundland");
		putMap("CANNS", "Canada - Nova Scotia");
		putMap("CANNT", "Canada - Northwest Territories");
		putMap("CANNU", "Canada - Nanavut");
		putMap("CANON", "Canada - Ontario");
		putMap("CANPE", "Canada - Prince Edward Island");
		putMap("CANQC", "Canada - Quebec");
		putMap("CANSK", "Canada - Saskatchewan");
		putMap("CANYT", "Canada - Yukon Territories");
		putMap("NLVWS", "NL - Ministerie van Volksgezondheid, Welzijn en Sport");
		putMap("USCDC", "US Center for Disease Control");
		putMap("USHCFA", "US Healthcare Finance Authority");
		putMap("USSSA", "US Social Security Administration");

	}

}
