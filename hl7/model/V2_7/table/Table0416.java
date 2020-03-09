package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0416 extends Table{
	private static final String VERSION = "2.7";
	public static Table getInstance(){
		if(table==null) new Table0416();
		return table;
	}

	public static final String _1 = "1";
	public static final String _2 = "2";
	public static final String _3 = "3";
	public static final String _4 = "4";
	public static final String _5 = "5";

	private Table0416(){
		setTableName("Procedure DRG Type");
		setOID("");

		putMap("1", "1st non-Operative");
		putMap("2", "2nd non-Operative");
		putMap("3", "Major Operative");
		putMap("4", "2nd Operative");
		putMap("5", "3rd Operative");

	}

}
