package hl7.model.V2_51.table;

import hl7.bean.table.Table;

public class Table0452 extends Table{
	private static final String VERSION = "2.5.1";
	public static Table getInstance(){
		if(table==null) new Table0452();
		return table;
	}

	public static final String SUGGESTION = "SUGGESTION";

	private Table0452(){
		setTableName("Health care provider type code");
		setOID("2.16.840.1.113883.12.452");

		putMap("SUGGESTION", "ANSI ASC X12 Health Care Provider Taxonomy, Level 1 - Type");

	}

}
