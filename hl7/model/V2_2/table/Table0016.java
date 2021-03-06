package hl7.model.V2_2.table;

import hl7.bean.table.Table;

public class Table0016 extends Table{
	private static final String VERSION = "2.2";
	public static Table getInstance(){
		if(table==null) new Table0016();
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

	private Table0016(){
		setTableName("ISOLATION");
		setOID("2.16.840.1.113883.12.16");

		putMap("0", "");
		putMap("1", "Blood and Needle Precautions");
		putMap("2", "Enteric Precautions");
		putMap("3", "Neutropenic Precautions");
		putMap("4", "Pregnant Women Precautions");
		putMap("5", "Respiratory Isolation");
		putMap("6", "Secretion / Excretion Precautions");
		putMap("7", "Strict Isolation");
		putMap("8", "Wound and skin Precautions");
		putMap("9", "Precautions");

	}

}
