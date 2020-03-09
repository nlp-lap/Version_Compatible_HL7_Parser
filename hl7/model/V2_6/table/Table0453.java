package hl7.model.V2_6.table;

import hl7.bean.table.Table;

public class Table0453 extends Table{
	private static final String VERSION = "2.6";
	public static Table getInstance(){
		if(table==null) new Table0453();
		return table;
	}

	public static final String SUGGESTION = "SUGGESTION";

	private Table0453(){
		setTableName("Health care provider classification");
		setOID("2.16.840.1.113883.12.453");

		putMap("SUGGESTION", "ANSI ASC X12 Health Care Provider Taxonomy, Level 2 -  Classification");

	}

}
