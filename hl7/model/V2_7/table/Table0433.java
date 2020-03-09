package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0433 extends Table{
	private static final String VERSION = "2.7";
	public static Table getInstance(){
		if(table==null) new Table0433();
		return table;
	}

	public static final String A = "A";
	public static final String B = "B";
	public static final String C = "C";
	public static final String D = "D";
	public static final String I = "I";
	public static final String N = "N";
	public static final String O = "O";
	public static final String P = "P";
	public static final String U = "U";

	private Table0433(){
		setTableName("Precaution Code");
		setOID("");

		putMap("A", "Aggressive");
		putMap("B", "Blind");
		putMap("C", "Confused");
		putMap("D", "Deaf");
		putMap("I", "On IV");
		putMap("N", "No-code (i.e. Do not resuscitate)");
		putMap("O", "Other");
		putMap("P", "Paraplegic");
		putMap("U", "Unknown");

	}

}
