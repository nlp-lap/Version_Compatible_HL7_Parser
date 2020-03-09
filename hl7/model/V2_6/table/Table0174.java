package hl7.model.V2_6.table;

import hl7.bean.table.Table;

public class Table0174 extends Table{
	private static final String VERSION = "2.6";
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
		setTableName("Nature of Service/Test/Observation");
		setOID("2.16.840.1.113883.12.174");

		putMap("A", "Atomic service/test/observation (test code or treatment code)");
		putMap("C", "Single observation calculated via a rule or formula from other independent observations (e.g., Alveolar-arterial ratio, cardiac output)");
		putMap("F", "Functional procedure that may consist of one or more interrelated measures (e.g., glucose tolerance test, creatinine clearance), usually done at different times and/or on different specimens");
		putMap("P", "Profile or battery consisting of many independent atomic observations (e.g., SMA12, electrolytes), usually done at one instrument on one specimen");
		putMap("S", "Superset-a set of batteries or procedures ordered under a single code unit but processed as separate batteries (e.g., routines = CBC, UA, electrolytes)<p>This set indicates that the code being described is used to order multiple service/test/observation b");

	}

}
