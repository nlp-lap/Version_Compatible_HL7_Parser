package hl7.model.V2_31.table;

import hl7.bean.table.Table;

public class Table0363 extends Table{
	private static final String VERSION = "2.3.1";
	public static Table getInstance(){
		if(table==null) new Table0363();
		return table;
	}


	private Table0363(){
		setTableName("Assigning Authority");
		setOID("2.16.840.1.113883.12.363");


	}

}
