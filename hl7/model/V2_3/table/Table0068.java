package hl7.model.V2_3.table;

import hl7.bean.table.Table;

public class Table0068 extends Table{
	private static final String VERSION = "2.3";
	public static Table getInstance(){
		if(table==null) new Table0068();
		return table;
	}


	private Table0068(){
		setTableName("Guarantor Relationship");
		setOID("2.16.840.1.113883.12.68");


	}

}
