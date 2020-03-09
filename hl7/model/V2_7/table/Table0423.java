package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0423 extends Table{
	private static final String VERSION = "2.7";
	public static Table getInstance(){
		if(table==null) new Table0423();
		return table;
	}

	public static final String D = "D";

	private Table0423(){
		setTableName("Case Category Code");
		setOID("");

		putMap("D", "Doctor's Office Closed");

	}

}