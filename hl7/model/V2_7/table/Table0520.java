package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0520 extends Table{
	private static final String VERSION = "2.7";
	public static Table getInstance(){
		if(table==null) new Table0520();
		return table;
	}

	public static final String H = "H";
	public static final String L = "L";
	public static final String M = "M";

	private Table0520(){
		setTableName("Message Waiting Priority");
		setOID("");

		putMap("H", "High");
		putMap("L", "Low");
		putMap("M", "Medium");

	}

}
