package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0454 extends Table{
	private static final String VERSION = "2.7";
	public static Table getInstance(){
		if(table==null) new Table0454();
		return table;
	}

	public static final String SUGGESTION = "SUGGESTION";

	private Table0454(){
		setTableName("Health Care Provider Area of Specialization");
		setOID("");

		putMap("SUGGESTION", "ANSI ASC X12 Health Care Provider Taxonomy, Level 3 - specialization");

	}

}
