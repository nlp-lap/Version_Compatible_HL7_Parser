package hl7.model.V2_1.table;

import hl7.bean.table.Table;

public class Table0035 extends Table{
	private static final String VERSION = "2.1";
	public static Table getInstance(){
		if(table==null) new Table0035();
		return table;
	}


	private Table0035(){
		setTableName("UNIT OF MEASURE FOR THE SOLUTION RATE");
		setOID("2.16.840.1.113883.12.35");


	}

}
