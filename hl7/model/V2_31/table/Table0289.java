package hl7.model.V2_31.table;

import hl7.bean.table.Table;

public class Table0289 extends Table{
	private static final String VERSION = "2.3.1";
	public static Table getInstance(){
		if(table==null) new Table0289();
		return table;
	}


	private Table0289(){
		setTableName("County Code");
		setOID("2.16.840.1.113883.12.289");


	}

}
