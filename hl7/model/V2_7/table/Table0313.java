package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0313 extends Table{
	private static final String VERSION = "2.7";
	public static Table getInstance(){
		if(table==null) new Table0313();
		return table;
	}


	private Table0313(){
		setTableName("Policy Source");
		setOID("");


	}

}
