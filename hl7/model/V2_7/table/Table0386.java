package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0386 extends Table{
	private static final String VERSION = "2.7";
	public static Table getInstance(){
		if(table==null) new Table0386();
		return table;
	}


	private Table0386(){
		setTableName("Supplier Identifier");
		setOID("");


	}

}
