package hl7.model.V2_4.table;

import hl7.bean.table.Table;

public class Table0249 extends Table{
	private static final String VERSION = "2.4";
	public static Table getInstance(){
		if(table==null) new Table0249();
		return table;
	}


	private Table0249(){
		setTableName("Generic product");
		setOID("2.16.840.1.113883.12.249");


	}

}
