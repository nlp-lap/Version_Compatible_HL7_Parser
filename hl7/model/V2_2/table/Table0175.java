package hl7.model.V2_2.table;

import hl7.bean.table.Table;

public class Table0175 extends Table{
	private static final String VERSION = "2.2";
	public static Table getInstance(){
		if(table==null) new Table0175();
		return table;
	}

	public static final String CDM = "CDM";
	public static final String OM1 = "OM1";
	public static final String OM2 = "OM2";
	public static final String OM3 = "OM3";
	public static final String OM4 = "OM4";
	public static final String OM5 = "OM5";
	public static final String OM6 = "OM6";
	public static final String PRA = "PRA";
	public static final String STF = "STF";

	private Table0175(){
		setTableName("MASTER FILE IDENTIFIER CODE");
		setOID("2.16.840.1.113883.12.175");

		putMap("CDM", "Charge description master file (see chapter 6, appendix)");
		putMap("OM1", "Observation text master file (i.e., Lab) (see Chapter 7, Appendix)");
		putMap("OM2", "Observation text master file (i.e., Lab) (see Chapter 7, Appendix)");
		putMap("OM3", "Observation text master file (i.e., Lab) (see Chapter 7, Appendix)");
		putMap("OM4", "Observation text master file (i.e., Lab) (see Chapter 7, Appendix)");
		putMap("OM5", "Observation text master file (i.e., Lab) (see Chapter 7, Appendix)");
		putMap("OM6", "Observation text master file (i.e., Lab) (see Chapter 7, Appendix)");
		putMap("PRA", "Practitioner master file (see chapter 8, appendix)");
		putMap("STF", "Staff master file (see chapter 8, Appendix)");

	}

}
