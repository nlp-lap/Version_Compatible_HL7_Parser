package hl7.model.V2_51.table;

import hl7.bean.table.Table;

public class Table0048 extends Table{
	private static final String VERSION = "2.5.1";
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
	public static final String GID = "GID";
	public static final String GOL = "GOL";
	public static final String MRI = "MRI";
	public static final String MRO = "MRO";
	public static final String NCK = "NCK";
	public static final String NSC = "NSC";
	public static final String NST = "NST";
	public static final String ORD = "ORD";
	public static final String OTH = "OTH";
	public static final String PRB = "PRB";
	public static final String PRO = "PRO";
	public static final String RAR = "RAR";
	public static final String RDR = "RDR";
	public static final String RER = "RER";
	public static final String RES = "RES";
	public static final String RGR = "RGR";
	public static final String ROR = "ROR";
	public static final String SAL = "SAL";
	public static final String SBK = "SBK";
	public static final String SBL = "SBL";
	public static final String SOF = "SOF";
	public static final String SOP = "SOP";
	public static final String SSA = "SSA";
	public static final String SSR = "SSR";
	public static final String STA = "STA";
	public static final String VXI = "VXI";
	public static final String XID = "XID";

	private Table0048(){
		setTableName("What subject filter");
		setOID("2.16.840.1.113883.12.48");

		putMap("ADV", "Advice/diagnosis");
		putMap("ANU", "Nursing unit lookup (returns patients in beds, excluding empty beds)");
		putMap("APA", "Account number query, return matching visit");
		putMap("APM", "Medical record number query, returns visits for a medical record number");
		putMap("APN", "Patient name lookup");
		putMap("APP", "Physician lookup");
		putMap("ARN", "Nursing unit lookup (returns patients in beds, including empty beds)");
		putMap("CAN", "Cancel.  Used to cancel a query");
		putMap("DEM", "Demographics");
		putMap("FIN", "Financial");
		putMap("GID", "Generate new identifier");
		putMap("GOL", "Goals");
		putMap("MRI", "Most recent inpatient");
		putMap("MRO", "Most recent outpatient");
		putMap("NCK", "Network clock");
		putMap("NSC", "Network status change");
		putMap("NST", "Network statistic");
		putMap("ORD", "Order");
		putMap("OTH", "Other");
		putMap("PRB", "Problems");
		putMap("PRO", "Procedure");
		putMap("RAR", "Pharmacy administration information");
		putMap("RDR", "Pharmacy dispense information");
		putMap("RER", "Pharmacy encoded order information");
		putMap("RES", "Result");
		putMap("RGR", "Pharmacy give information");
		putMap("ROR", "Pharmacy prescription information");
		putMap("SAL", "All schedule related information, including open slots, booked slots, blocked slots");
		putMap("SBK", "Booked slots on the identified schedule");
		putMap("SBL", "Blocked slots on the identified schedule");
		putMap("SOF", "First open slot on the identified schedule after the start date/tiem");
		putMap("SOP", "Open slots on the identified schedule between the begin and end of the start date/time range");
		putMap("SSA", "Time slots available for a single appointment");
		putMap("SSR", "Time slots available for a recurring appointment");
		putMap("STA", "Status");
		putMap("VXI", "Vaccine Information");
		putMap("XID", "Get cross-referenced identifiers");

	}

}
