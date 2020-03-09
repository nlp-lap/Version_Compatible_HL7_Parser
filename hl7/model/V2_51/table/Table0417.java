package hl7.model.V2_51.table;

import hl7.bean.table.Table;

public class Table0417 extends Table{
	private static final String VERSION = "2.5.1";
	public static Table getInstance(){
		if(table==null) new Table0417();
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
	public static final String B = "B";
	public static final String C = "C";
	public static final String G = "G";

	private Table0417(){
		setTableName("Tissue Type Code");
		setOID("2.16.840.1.113883.12.417");

		putMap("0", "No tissue expected");
		putMap("1", "Insufficient Tissue");
		putMap("2", "Not abnormal");
		putMap("3", "Abnormal-not categorized");
		putMap("4", "Mechanical abnormal");
		putMap("5", "Growth alteration");
		putMap("6", "Degeneration & necrosis");
		putMap("7", "Non-acute inflammation");
		putMap("8", "Non-malignant neoplasm");
		putMap("9", "Malignant neoplasm");
		putMap("B", "Basal cell carcinoma");
		putMap("C", "Carcinoma-unspecified type");
		putMap("G", "Additional tissue required");

	}

}
