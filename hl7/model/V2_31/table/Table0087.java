package hl7.model.V2_31.table;

import hl7.bean.table.Table;

public class Table0087 extends Table{
	private static final String VERSION = "2.3.1";
	public static Table getInstance(){
		if(table==null) new Table0087();
		return table;
	}


	private Table0087(){
		setTableName("Preadmit Test Indicator");
		setOID("2.16.840.1.113883.12.87");


	}

}