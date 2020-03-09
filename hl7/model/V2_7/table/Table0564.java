package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0564 extends Table{
	private static final String VERSION = "2.7";
	public static Table getInstance(){
		if(table==null) new Table0564();
		return table;
	}

	public static final String EA = "EA";
	public static final String IN = "IN";
	public static final String PA = "PA";
	public static final String PR = "PR";

	private Table0564(){
		setTableName("Adjustment Category Code");
		setOID("");

		putMap("EA", "Edit/Adjudication Response");
		putMap("IN", "Information");
		putMap("PA", "Provider Adjustment");
		putMap("PR", "Processing Result");

	}

}
