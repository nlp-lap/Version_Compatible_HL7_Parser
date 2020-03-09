package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0170 extends Table{
	private static final String VERSION = "2.7";
	public static Table getInstance(){
		if(table==null) new Table0170();
		return table;
	}

	public static final String C = "C";
	public static final String N = "N";
	public static final String P = "P";

	private Table0170(){
		setTableName("Derived Specimen");
		setOID("");

		putMap("C", "Child Observation");
		putMap("N", "Not Applicable");
		putMap("P", "Parent Observation");

	}

}
