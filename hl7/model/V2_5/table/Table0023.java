package hl7.model.V2_5.table;

import hl7.bean.table.Table;

public class Table0023 extends Table{
	private static final String VERSION = "2.5";
	public static Table getInstance(){
		if(table==null) new Table0023();
		return table;
	}

	public static final String _1 = "1";
	public static final String _2 = "2";
	public static final String _3 = "3";
	public static final String _4 = "4";
	public static final String _5 = "5";
	public static final String _6 = "6";
	public static final String _7 = "7";
	public static final String _8 = "8";
	public static final String _9 = "9";

	private Table0023(){
		setTableName("Admit Source");
		setOID("2.16.840.1.113883.12.23");

		putMap("1", "Physician referral");
		putMap("2", "Clinic referral");
		putMap("3", "HMO referral");
		putMap("4", "Transfer from a hospital");
		putMap("5", "Transfer from a skilled nursing facility");
		putMap("6", "Transfer from another health care facility");
		putMap("7", "Emergency room");
		putMap("8", "Court/law enforcement");
		putMap("9", "Information not available");

	}

}
