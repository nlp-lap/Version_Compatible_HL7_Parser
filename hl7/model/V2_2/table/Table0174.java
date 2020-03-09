package hl7.model.V2_2.table;

import hl7.bean.table.Table;

public class Table0174 extends Table{
	private static final String VERSION = "2.2";
	public static Table getInstance(){
		if(table==null) new Table0174();
		return table;
	}

	public static final String A = "A";
	public static final String C = "C";
	public static final String F = "F";
	public static final String P = "P";
	public static final String S = "S";

	private Table0174(){
		setTableName("NATURE OF TEST/OBSERVATION");
		setOID("2.16.840.1.113883.12.174");

		putMap("A", "Atomic test/observation");
		putMap("C", "Calculated single observation");
		putMap("F", "Functional procedure");
		putMap("P", "Profile or battery");
		putMap("S", "Superset--a set of batteries ordered");

	}

}
