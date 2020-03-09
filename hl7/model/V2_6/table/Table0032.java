package hl7.model.V2_6.table;

import hl7.bean.table.Table;

public class Table0032 extends Table{
	private static final String VERSION = "2.6";
	public static Table getInstance(){
		if(table==null) new Table0032();
		return table;
	}


	private Table0032(){
		setTableName("Charge/Price Indicator");
		setOID("2.16.840.1.113883.12.32");


	}

}
