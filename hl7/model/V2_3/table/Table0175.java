package hl7.model.V2_3.table;

import hl7.bean.table.Table;

public class Table0175 extends Table{
	private static final String VERSION = "2.3";
	public static Table getInstance(){
		if(table==null) new Table0175();
		return table;
	}

	public static final String CDM = "CDM";
	public static final String CM0 = "CM0";
	public static final String CM1 = "CM1";
	public static final String CM2 = "CM2";
	public static final String LOC = "LOC";
	public static final String OM1_OM6 = "OM1-OM6";
	public static final String PRA = "PRA";
	public static final String STF = "STF";

	private Table0175(){
		setTableName("Master File Identifier Code");
		setOID("2.16.840.1.113883.12.175");

		putMap("CDM", "Charge description master file (see Chapter 6, Appendix)");
		putMap("CM0", "Clinical study master");
		putMap("CM1", "Clinical study phase master");
		putMap("CM2", "Clinical study Data Schedule Master");
		putMap("LOC", "Location master file (see Chapter 3, Appendix)");
		putMap("OM1-OM6", "Observation text master file segments (e.g., Lab) (see Chapter 87, Appendix B):");
		putMap("PRA", "Practitioner master file (see Chapter 8, Appendix)");
		putMap("STF", "Staff Master File (see Chapter 8, Appendix)");

	}

}
