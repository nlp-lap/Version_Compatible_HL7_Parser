package hl7.model.V2_3.table;

import hl7.bean.table.Table;

public class Table0281 extends Table{
	private static final String VERSION = "2.3";
	public static Table getInstance(){
		if(table==null) new Table0281();
		return table;
	}

	public static final String HOM = "HOM";
	public static final String LAB = "LAB";
	public static final String MED = "MED";
	public static final String PSY = "PSY";
	public static final String RAD = "RAD";
	public static final String SKN = "SKN";

	private Table0281(){
		setTableName("Referral Type");
		setOID("2.16.840.1.113883.12.281");

		putMap("HOM", "Home Care");
		putMap("LAB", "Laboratory");
		putMap("MED", "Medical");
		putMap("PSY", "Psychiatric");
		putMap("RAD", "Radiology");
		putMap("SKN", "Skilled Nursing");

	}

}
