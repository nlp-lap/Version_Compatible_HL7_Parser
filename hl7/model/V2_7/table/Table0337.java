package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0337 extends Table{
	private static final String VERSION = "2.7";
	public static Table getInstance(){
		if(table==null) new Table0337();
		return table;
	}

	public static final String C = "C";
	public static final String E = "E";

	private Table0337(){
		setTableName("Certification Status");
		setOID("");

		putMap("C", "Certified");
		putMap("E", "Eligible");

	}

}
