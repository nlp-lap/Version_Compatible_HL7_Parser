package hl7.model.V2_5.table;

import hl7.bean.table.Table;

public class Table0337 extends Table{
	private static final String VERSION = "2.5";
	public static Table getInstance(){
		if(table==null) new Table0337();
		return table;
	}

	public static final String C = "C";
	public static final String E = "E";

	private Table0337(){
		setTableName("Certification status");
		setOID("2.16.840.1.113883.12.337");

		putMap("C", "Certified");
		putMap("E", "Eligible");

	}

}
