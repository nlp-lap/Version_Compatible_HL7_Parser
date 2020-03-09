package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0463 extends Table{
	private static final String VERSION = "2.7";
	public static Table getInstance(){
		if(table==null) new Table0463();
		return table;
	}


	private Table0463(){
		setTableName("Inventory Number");
		setOID("");


	}

}
