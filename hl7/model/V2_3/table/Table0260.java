package hl7.model.V2_3.table;

import hl7.bean.table.Table;

public class Table0260 extends Table{
	private static final String VERSION = "2.3";
	public static Table getInstance(){
		if(table==null) new Table0260();
		return table;
	}

	public static final String B = "B";
	public static final String C = "C";
	public static final String D = "D";
	public static final String E = "E";
	public static final String L = "L";
	public static final String N = "N";
	public static final String O = "O";
	public static final String R = "R";

	private Table0260(){
		setTableName("Patient Location Type");
		setOID("2.16.840.1.113883.12.260");

		putMap("B", "Bed");
		putMap("C", "Clinic");
		putMap("D", "Department");
		putMap("E", "Exam Room");
		putMap("L", "Other Location");
		putMap("N", "Nursing Unit");
		putMap("O", "Operating Room");
		putMap("R", "Room");

	}

}
