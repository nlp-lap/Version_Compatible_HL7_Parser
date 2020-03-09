package hl7.model.V2_51.table;

import hl7.bean.table.Table;

public class Table0089 extends Table{
	private static final String VERSION = "2.5.1";
	public static Table getInstance(){
		if(table==null) new Table0089();
		return table;
	}

	public static final String ______ = "......";

	private Table0089(){
		setTableName("Procedure Coding Method");
		setOID("2.16.840.1.113883.12.89");

		putMap("......", "No suggested values defined");

	}

}
