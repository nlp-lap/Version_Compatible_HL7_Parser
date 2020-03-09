package hl7.model.V2_51.table;

import hl7.bean.table.Table;

public class Table9999 extends Table{
	private static final String VERSION = "2.5.1";
	public static Table getInstance(){
		if(table==null) new Table9999();
		return table;
	}


	private Table9999(){
		setTableName("no table for CE");
		setOID("");


	}

}
