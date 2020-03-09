package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0111 extends Table{
	private static final String VERSION = "2.7";
	public static Table getInstance(){
		if(table==null) new Table0111();
		return table;
	}


	private Table0111(){
		setTableName("Delete Account Code");
		setOID("");


	}

}
