package hl7.model.V2_2.table;

import hl7.bean.table.Table;

public class Table0048 extends Table{
	private static final String VERSION = "2.2";
	public static Table getInstance(){
		if(table==null) new Table0048();
		return table;
	}

	public static final String ADV = "ADV";
	public static final String ANU = "ANU";
	public static final String APA = "APA";
	public static final String APM = "APM";
	public static final String APN = "APN";
	public static final String APP = "APP";
	public static final String ARN = "ARN";
	public static final String CAN = "CAN";
	public static final String DEM = "DEM";
	public static final String FIN = "FIN";
	public static final String MFQ = "MFQ";
	public static final String MRI = "MRI";
	public static final String MRO = "MRO";
	public static final String NCK = "NCK";
	public static final String NSC = "NSC";
	public static final String NST = "NST";
	public static final String ORD = "ORD";
	public static final String OTH = "OTH";
	public static final String PRO = "PRO";
	public static final String RAR = "RAR";
	public static final String RDR = "RDR";
	public static final String RER = "RER";
	public static final String RES = "RES";
	public static final String RGR = "RGR";
	public static final String ROR = "ROR";
	public static final String STA = "STA";

	private Table0048(){
		setTableName("WHAT SUBJECT FILTER");
		setOID("2.16.840.1.113883.12.48");

		putMap("ADV", "Advice / diagnosis");
		putMap("ANU", "Nursing unit lookup (returns patients in beds, excluding empty beds)");
		putMap("APA", "Account number query, return matching visit");
		putMap("APM", "Medical record number query, returns visits for a medical record number");
		putMap("APN", "Patient name lookup");
		putMap("APP", "Physician lookup");
		putMap("ARN", "Nursing unit lookup (returns patients in beds, including empty beds)");
		putMap("CAN", "Cancel (used to cancel a query)");
		putMap("DEM", "Demographics");
		putMap("FIN", "Financial");
		putMap("MFQ", "Master file query");
		putMap("MRI", "Most recent inpatient");
		putMap("MRO", "Most recent outpatient");
		putMap("NCK", "Network clock");
		putMap("NSC", "Network status change");
		putMap("NST", "Network statistic");
		putMap("ORD", "Order");
		putMap("OTH", "Other");
		putMap("PRO", "Procedure");
		putMap("RAR", "Pharmacy administration information");
		putMap("RDR", "Pharmacy dispense information");
		putMap("RER", "Pharmacy encoded order information");
		putMap("RES", "Result");
		putMap("RGR", "Pharmacy give information");
		putMap("ROR", "Pharmacy prescription information");
		putMap("STA", "Status");

	}

}
