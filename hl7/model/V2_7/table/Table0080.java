package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0080 extends Table{
	private static final String VERSION = "2.7";
	public static Table getInstance(){
		if(table==null) new Table0080();
		return table;
	}

	public static final String A = "A";
	public static final String B = "B";
	public static final String N = "N";
	public static final String R = "R";
	public static final String S = "S";
	public static final String SP = "SP";
	public static final String ST = "ST";

	private Table0080(){
		setTableName("Nature of Abnormal Testing");
		setOID("");

		putMap("A", "An age-based population");
		putMap("B", "Breed");
		putMap("N", "None - generic normal range");
		putMap("R", "A race-based population");
		putMap("S", "A sex-based population");
		putMap("SP", "Species");
		putMap("ST", "Strain");

	}

}
