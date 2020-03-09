package hl7.model.V2_4.table;

import hl7.bean.table.Table;

public class Table0369 extends Table{
	private static final String VERSION = "2.4";
	public static Table getInstance(){
		if(table==null) new Table0369();
		return table;
	}

	public static final String B = "B";
	public static final String C = "C";
	public static final String P = "P";
	public static final String Q = "Q";
	public static final String R = "R";

	private Table0369(){
		setTableName("Specimen role");
		setOID("2.16.840.1.113883.12.369");

		putMap("B", "Blind Sample");
		putMap("C", "Calibrator");
		putMap("P", "Patient (default if blank component value)");
		putMap("Q", "Control specimen");
		putMap("R", "Replicate (of patient sample as a control)");

	}

}
