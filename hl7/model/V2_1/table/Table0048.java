package hl7.model.V2_1.table;

import hl7.bean.table.Table;

public class Table0048 extends Table{
	private static final String VERSION = "2.1";
	public static Table getInstance(){
		if(table==null) new Table0048();
		return table;
	}

	public static final String ADV = "ADV";
	public static final String ANU = "ANU";
	public static final String APN = "APN";
	public static final String CAN = "CAN";
	public static final String DEM = "DEM";
	public static final String MRI = "MRI";
	public static final String MRO = "MRO";
	public static final String OTH = "OTH";
	public static final String PRO = "PRO";
	public static final String RES = "RES";
	public static final String STA = "STA";

	private Table0048(){
		setTableName("WHAT SUBJECT FILTER");
		setOID("2.16.840.1.113883.12.48");

		putMap("ADV", "Advice/Diagnosis");
		putMap("ANU", "Nursing Unit Look up");
		putMap("APN", "Patient name look up");
		putMap("CAN", "Cancel. Used to cancel a query");
		putMap("DEM", "Demographics");
		putMap("MRI", "Most recent inpatient");
		putMap("MRO", "Most recent outpatient");
		putMap("OTH", "Other");
		putMap("PRO", "Procedure");
		putMap("RES", "Result");
		putMap("STA", "Status");

	}

}
