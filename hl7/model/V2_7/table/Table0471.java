package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0471 extends Table{
	private static final String VERSION = "2.7";
	public static Table getInstance(){
		if(table==null) new Table0471();
		return table;
	}


	private Table0471(){
		setTableName("Query Name");
		setOID("");


	}

}
