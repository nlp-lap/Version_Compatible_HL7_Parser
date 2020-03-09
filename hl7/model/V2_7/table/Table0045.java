package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0045 extends Table{
	private static final String VERSION = "2.7";
	public static Table getInstance(){
		if(table==null) new Table0045();
		return table;
	}


	private Table0045(){
		setTableName("Courtesy Code");
		setOID("");


	}

}
