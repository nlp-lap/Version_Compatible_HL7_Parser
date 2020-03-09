package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0370 extends Table{
	private static final String VERSION = "2.7";
	public static Table getInstance(){
		if(table==null) new Table0370();
		return table;
	}

	public static final String I = "I";
	public static final String L = "L";
	public static final String M = "M";
	public static final String O = "O";
	public static final String P = "P";
	public static final String R = "R";
	public static final String U = "U";
	public static final String X = "X";

	private Table0370(){
		setTableName("Container Status");
		setOID("");

		putMap("I", "Identified");
		putMap("L", "Left Equipment");
		putMap("M", "Missing");
		putMap("O", "In Process");
		putMap("P", "In Position");
		putMap("R", "Process Completed");
		putMap("U", "Unknown");
		putMap("X", "Container Unavailable");

	}

}
