package hl7.model.V2_2.table;

import hl7.bean.table.Table;

public class Table0089 extends Table{
	private static final String VERSION = "2.2";
	public static Table getInstance(){
		if(table==null) new Table0089();
		return table;
	}


	private Table0089(){
		setTableName("PROCEDURE CODING METHOD");
		setOID("2.16.840.1.113883.12.89");


	}

}
