package hl7.model.V2_5.table;

import hl7.bean.table.Table;

public class Table0447 extends Table{
	private static final String VERSION = "2.5";
	public static Table getInstance(){
		if(table==null) new Table0447();
		return table;
	}


	private Table0447(){
		setTableName("Breed Code");
		setOID("2.16.840.1.113883.12.447");


	}

}
