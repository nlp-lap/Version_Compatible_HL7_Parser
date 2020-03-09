package hl7.model.V2_31.table;

import hl7.bean.table.Table;

public class Table0244 extends Table{
	private static final String VERSION = "2.3.1";
	public static Table getInstance(){
		if(table==null) new Table0244();
		return table;
	}


	private Table0244(){
		setTableName("Single Use Device");
		setOID("2.16.840.1.113883.12.244");


	}

}
