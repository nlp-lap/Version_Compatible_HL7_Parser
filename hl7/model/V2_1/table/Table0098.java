package hl7.model.V2_1.table;

import hl7.bean.table.Table;

public class Table0098 extends Table{
	private static final String VERSION = "2.1";
	public static Table getInstance(){
		if(table==null) new Table0098();
		return table;
	}


	private Table0098(){
		setTableName("TYPE OF AGREEMENT CODE");
		setOID("2.16.840.1.113883.12.98");


	}

}
