package hl7.model.V2_3.table;

import hl7.bean.table.Table;

public class Table0170 extends Table{
	private static final String VERSION = "2.3";
	public static Table getInstance(){
		if(table==null) new Table0170();
		return table;
	}

	public static final String C = "C";
	public static final String N = "N";
	public static final String P = "P";

	private Table0170(){
		setTableName("Derived Specimen");
		setOID("2.16.840.1.113883.12.170");

		putMap("C", "Child Observation");
		putMap("N", "Not Applicable");
		putMap("P", "Parent Observation");

	}

}
