package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0533 extends Table{
	private static final String VERSION = "2.7";
	public static Table getInstance(){
		if(table==null) new Table0533();
		return table;
	}


	private Table0533(){
		setTableName("Application Error Code");
		setOID("");


	}

}
