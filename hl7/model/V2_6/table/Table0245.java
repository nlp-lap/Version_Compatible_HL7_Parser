package hl7.model.V2_6.table;

import hl7.bean.table.Table;

public class Table0245 extends Table{
	private static final String VERSION = "2.6";
	public static Table getInstance(){
		if(table==null) new Table0245();
		return table;
	}


	private Table0245(){
		setTableName("Product Problem");
		setOID("2.16.840.1.113883.12.245");


	}

}
