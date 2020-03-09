package hl7.model.V2_1.table;

import hl7.bean.table.Table;

public class Table0025 extends Table{
	private static final String VERSION = "2.1";
	public static Table getInstance(){
		if(table==null) new Table0025();
		return table;
	}


	private Table0025(){
		setTableName("CONFIRMATION CODE");
		setOID("2.16.840.1.113883.12.25");


	}

}
