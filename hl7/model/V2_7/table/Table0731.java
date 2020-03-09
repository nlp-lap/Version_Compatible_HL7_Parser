package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0731 extends Table{
	private static final String VERSION = "2.7";
	public static Table getInstance(){
		if(table==null) new Table0731();
		return table;
	}

	public static final String _0 = "0";
	public static final String _1 = "1";
	public static final String _2 = "2";
	public static final String _3 = "3";
	public static final String _4 = "4";

	private Table0731(){
		setTableName("DRG Diagnosis Determination Status");
		setOID("");

		putMap("0", "Valid code");
		putMap("1", "Invalid code");
		putMap("2", "Two primary diagnosis codes");
		putMap("3", "Invalid for this gender");
		putMap("4", "Invalid for this age");

	}

}
