package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0539 extends Table{
	private static final String VERSION = "2.7";
	public static Table getInstance(){
		if(table==null) new Table0539();
		return table;
	}


	private Table0539(){
		setTableName("Cost Center Code");
		setOID("");


	}

}