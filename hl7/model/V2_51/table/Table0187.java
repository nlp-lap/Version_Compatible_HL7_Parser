package hl7.model.V2_51.table;

import hl7.bean.table.Table;

public class Table0187 extends Table{
	private static final String VERSION = "2.5.1";
	public static Table getInstance(){
		if(table==null) new Table0187();
		return table;
	}

	public static final String I = "I";
	public static final String P = "P";

	private Table0187(){
		setTableName("Provider billing");
		setOID("2.16.840.1.113883.12.187");

		putMap("I", "Institution bills for provider");
		putMap("P", "Provider does own billing");

	}

}
