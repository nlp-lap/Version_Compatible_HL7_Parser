package hl7.model.V2_6.table;

import hl7.bean.table.Table;

public class Table0717 extends Table{
	private static final String VERSION = "2.6";
	public static Table getInstance(){
		if(table==null) new Table0717();
		return table;
	}

	public static final String ALL = "ALL";
	public static final String DEM = "DEM";
	public static final String DRG = "DRG";
	public static final String HIV = "HIV";
	public static final String LOC = "LOC";
	public static final String NO = "NO";
	public static final String OI = "OI";
	public static final String OO = "OO";
	public static final String PID_17 = "PID-17";
	public static final String PID_7 = "PID-7";
	public static final String PSY = "PSY";
	public static final String SMD = "SMD";
	public static final String STD = "STD";

	private Table0717(){
		setTableName("Access Restriction Value");
		setOID("2.16.840.1.113883.12.717");

		putMap("ALL", "All");
		putMap("DEM", "All demographic data");
		putMap("DRG", "Drug");
		putMap("HIV", "HIV status and results");
		putMap("LOC", "Patient Location");
		putMap("NO", "None");
		putMap("OI", "Opt in all registries (HIPAA)");
		putMap("OO", "Opt out all registries (HIPAA)");
		putMap("PID-17", "Religion");
		putMap("PID-7", "Date of Birth");
		putMap("PSY", "Psychiatric Mental health");
		putMap("SMD", "Sensitive medical data");
		putMap("STD", "Sexually transmitted diseases");

	}

}
