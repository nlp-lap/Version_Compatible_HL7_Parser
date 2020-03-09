package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0771 extends Table{
	private static final String VERSION = "2.7";
	public static Table getInstance(){
		if(table==null) new Table0771();
		return table;
	}


	private Table0771(){
		setTableName("Resource Type or Category");
		setOID("");


	}

}
