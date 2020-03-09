package hl7.model.V2_4.table;

import hl7.bean.table.Table;

public class Table0177 extends Table{
	private static final String VERSION = "2.4";
	public static Table getInstance(){
		if(table==null) new Table0177();
		return table;
	}

	public static final String AID = "AID";
	public static final String EMP = "EMP";
	public static final String ETH = "ETH";
	public static final String HIV = "HIV";
	public static final String PSY = "PSY";
	public static final String R = "R";
	public static final String U = "U";
	public static final String UWM = "UWM";
	public static final String V = "V";
	public static final String VIP = "VIP";

	private Table0177(){
		setTableName("Confidentiality code");
		setOID("2.16.840.1.113883.12.177");

		putMap("AID", "AIDS patient");
		putMap("EMP", "Employee");
		putMap("ETH", "Alcohol/drug treatment patient");
		putMap("HIV", "HIV(+) patient");
		putMap("PSY", "Psychiatric patient");
		putMap("R", "Restricted");
		putMap("U", "Usual control");
		putMap("UWM", "Unwed mother");
		putMap("V", "Very restricted");
		putMap("VIP", "Very important person or celebrity");

	}

}
