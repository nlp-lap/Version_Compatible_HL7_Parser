package hl7.model.V2_6.table;

import hl7.bean.table.Table;

public class Table0246 extends Table{
	private static final String VERSION = "2.6";
	public static Table getInstance(){
		if(table==null) new Table0246();
		return table;
	}


	private Table0246(){
		setTableName("Product Available for Inspection");
		setOID("2.16.840.1.113883.12.246");


	}

}
