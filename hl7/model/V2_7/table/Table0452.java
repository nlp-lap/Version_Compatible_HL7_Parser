package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0452 extends Table{
	private static final String VERSION = "2.7";
	public static Table getInstance(){
		if(table==null) new Table0452();
		return table;
	}

	public static final String SUGGESTION = "SUGGESTION";

	private Table0452(){
		setTableName("Health Care Provider Type Code");
		setOID("");

		putMap("SUGGESTION", "ANSI ASC X12 Health Care Provider Taxonomy, Level 1 - Type");

	}

}
