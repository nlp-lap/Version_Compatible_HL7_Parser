package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0072 extends Table{
	private static final String VERSION = "2.7";
	public static Table getInstance(){
		if(table==null) new Table0072();
		return table;
	}


	private Table0072(){
		setTableName("Insurance plan ID");
		setOID("");


	}

}
