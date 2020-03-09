package hl7.model.V2_31.table;

import hl7.bean.table.Table;

public class Table0316 extends Table{
	private static final String VERSION = "2.3.1";
	public static Table getInstance(){
		if(table==null) new Table0316();
		return table;
	}

	public static final String F = "F";
	public static final String I = "I";
	public static final String U = "U";
	public static final String Y = "Y";

	private Table0316(){
		setTableName("Organ donor");
		setOID("2.16.840.1.113883.12.316");

		putMap("F", "Yes, patient is a donor, but card is not on file");
		putMap("I", "No, patient does not have a living will but information was provided");
		putMap("U", "Unknown");
		putMap("Y", "Yes, patient is a donor and card is on file");

	}

}
