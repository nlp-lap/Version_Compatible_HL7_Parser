package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0793 extends Table{
	private static final String VERSION = "2.7";
	public static Table getInstance(){
		if(table==null) new Table0793();
		return table;
	}

	public static final String SMDA = "SMDA";

	private Table0793(){
		setTableName("Ruling Act");
		setOID("");

		putMap("SMDA", "Safe Medical Devices Act");

	}

}
