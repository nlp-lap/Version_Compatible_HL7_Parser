package hl7.model.V2_4.table;

import hl7.bean.table.Table;

public class Table0351 extends Table{
	private static final String VERSION = "2.4";
	public static Table getInstance(){
		if(table==null) new Table0351();
		return table;
	}

	public static final String _70 = "70";
	public static final String _71 = "71";
	public static final String _72 = "72";
	public static final String _73 = "73";
	public static final String _74 = "74";
	public static final String _75 = "75";
	public static final String _76 = "76";
	public static final String _77 = "77";
	public static final String _78 = "78";
	public static final String _79 = "79";
	public static final String M0 = "M0";

	private Table0351(){
		setTableName("Occurrence span");
		setOID("2.16.840.1.113883.12.351");

		putMap("70", "Qualifying stay dates for SNF");
		putMap("71", "Prior stay dates");
		putMap("72", "First/last visit");
		putMap("73", "Benefit eligibility period");
		putMap("74", "Non-covered level of care");
		putMap("75", "SNF level of care");
		putMap("76", "Patient liability");
		putMap("77", "Provider liability period");
		putMap("78", "SNF prior stay dates");
		putMap("79", "Payer code");
		putMap("M0", "PSRO/UR approved stay dates");

	}

}
