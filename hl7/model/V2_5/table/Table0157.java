package hl7.model.V2_5.table;

import hl7.bean.table.Table;

public class Table0157 extends Table{
	private static final String VERSION = "2.5";
	public static Table getInstance(){
		if(table==null) new Table0157();
		return table;
	}

	public static final String ANY = "ANY";
	public static final String CFN = "CFN";
	public static final String COR = "COR";
	public static final String FIN = "FIN";
	public static final String PRE = "PRE";
	public static final String REP = "REP";

	private Table0157(){
		setTableName("Which date/time status qualifier");
		setOID("2.16.840.1.113883.12.157");

		putMap("ANY", "Any status");
		putMap("CFN", "Current final value, whether final or corrected");
		putMap("COR", "Corrected only (no final with corrections)");
		putMap("FIN", "Final only (no corrections)");
		putMap("PRE", "Preliminary");
		putMap("REP", "Report completion date/time");

	}

}
