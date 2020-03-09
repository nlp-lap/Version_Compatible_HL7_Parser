package hl7.model.V2_4.table;

import hl7.bean.table.Table;

public class Table0412 extends Table{
	private static final String VERSION = "2.4";
	public static Table getInstance(){
		if(table==null) new Table0412();
		return table;
	}


	private Table0412(){
		setTableName("Category identifier");
		setOID("2.16.840.1.113883.12.412");


	}

}
