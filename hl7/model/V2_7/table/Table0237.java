package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0237 extends Table{
	private static final String VERSION = "2.7";
	public static Table getInstance(){
		if(table==null) new Table0237();
		return table;
	}

	public static final String A = "A";
	public static final String B = "B";
	public static final String D = "D";
	public static final String I = "I";
	public static final String L = "L";
	public static final String M = "M";
	public static final String O = "O";
	public static final String W = "W";

	private Table0237(){
		setTableName("Event Qualification");
		setOID("");

		putMap("A", "Abuse");
		putMap("B", "Unexpected beneficial effect");
		putMap("D", "Dependency");
		putMap("I", "Interaction");
		putMap("L", "Lack of expect therapeutic effect");
		putMap("M", "Misuse");
		putMap("O", "Overdose");
		putMap("W", "Drug withdrawal");

	}

}
