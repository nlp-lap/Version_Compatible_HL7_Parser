package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0175 extends Table{
	private static final String VERSION = "2.7";
	public static Table getInstance(){
		if(table==null) new Table0175();
		return table;
	}

	public static final String CDM = "CDM";
	public static final String CLN = "CLN";
	public static final String CMA = "CMA";
	public static final String CMB = "CMB";
	public static final String INV = "INV";
	public static final String LOC = "LOC";
	public static final String OMA = "OMA";
	public static final String OMB = "OMB";
	public static final String OMC = "OMC";
	public static final String OMD = "OMD";
	public static final String OME = "OME";
	public static final String PRA = "PRA";
	public static final String STF = "STF";

	private Table0175(){
		setTableName("Master File Identifier Code");
		setOID("");

		putMap("CDM", "Charge description master file");
		putMap("CLN", "Clinic master file");
		putMap("CMA", "Clinical study with phases and scheduled master file");
		putMap("CMB", "Clinical study without phases but with scheduled master file");
		putMap("INV", "Inventory master file");
		putMap("LOC", "Location master file");
		putMap("OMA", "Numerical observation master file");
		putMap("OMB", "Categorical observation master file");
		putMap("OMC", "Observation batteries master file");
		putMap("OMD", "Calculated observations master file");
		putMap("OME", "Other Observation/Service Item master file");
		putMap("PRA", "Practitioner master file");
		putMap("STF", "Staff master file");

	}

}
