package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0187 extends Table{
	private static final String VERSION = "2.7";
	public static Table getInstance(){
		if(table==null) new Table0187();
		return table;
	}

	public static final String I = "I";
	public static final String P = "P";

	private Table0187(){
		setTableName("Provider Billing");
		setOID("");

		putMap("I", "Institution bills for provider");
		putMap("P", "Provider does own billing");

	}

}
