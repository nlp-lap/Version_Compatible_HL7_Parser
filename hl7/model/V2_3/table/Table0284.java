package hl7.model.V2_3.table;

import hl7.bean.table.Table;

public class Table0284 extends Table{
	private static final String VERSION = "2.3";
	public static Table getInstance(){
		if(table==null) new Table0284();
		return table;
	}

	public static final String A = "A";
	public static final String E = "E";
	public static final String I = "I";
	public static final String O = "O";

	private Table0284(){
		setTableName("Referral Category");
		setOID("2.16.840.1.113883.12.284");

		putMap("A", "Ambulatory");
		putMap("E", "Emergency");
		putMap("I", "Inpatient");
		putMap("O", "Outpatient");

	}

}
