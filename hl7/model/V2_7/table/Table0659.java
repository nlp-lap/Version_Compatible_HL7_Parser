package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0659 extends Table{
	private static final String VERSION = "2.7";
	public static Table getInstance(){
		if(table==null) new Table0659();
		return table;
	}

	public static final String _1 = "1";
	public static final String _2 = "2";
	public static final String _3 = "3";
	public static final String _4 = "4";
	public static final String _5 = "5";

	private Table0659(){
		setTableName("Lot Control");
		setOID("");

		putMap("1", "OR Mode Without Operator");
		putMap("2", "OR Mode with Operator");
		putMap("3", "CPD Mode Without Operator");
		putMap("4", "CPD Mode With Operator");
		putMap("5", "Offline Mode");

	}

}
