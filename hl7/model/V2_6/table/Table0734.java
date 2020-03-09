package hl7.model.V2_6.table;

import hl7.bean.table.Table;

public class Table0734 extends Table{
	private static final String VERSION = "2.6";
	public static Table getInstance(){
		if(table==null) new Table0734();
		return table;
	}

	public static final String _0 = "0";
	public static final String _1 = "1";
	public static final String _2 = "2";
	public static final String _3 = "3";
	public static final String _4 = "4";
	public static final String _5 = "5";
	public static final String _6 = "6";
	public static final String _7 = "7";
	public static final String _8 = "8";
	public static final String _9 = "9";

	private Table0734(){
		setTableName("Grouper Status");
		setOID("2.16.840.1.113883.12.734");

		putMap("0", "Normal grouping");
		putMap("1", "Invalid or missing primary diagnosis");
		putMap("2", "Diagnosis is not allowed to be primary");
		putMap("3", "Data does not fulfill DRG criteria");
		putMap("4", "Invalid age, admission date, date of birth or discharge date");
		putMap("5", "Invalid gender");
		putMap("6", "Invalid discharge status");
		putMap("7", "Invalid weight ad admission");
		putMap("8", "Invalid length of stay");
		putMap("9", "Invalid field same day");

	}

}
