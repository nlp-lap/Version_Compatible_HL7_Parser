package hl7.model.V2_6.table;

import hl7.bean.table.Table;

public class Table0210 extends Table{
	private static final String VERSION = "2.6";
	public static Table getInstance(){
		if(table==null) new Table0210();
		return table;
	}

	public static final String AND = "AND";
	public static final String OR = "OR";

	private Table0210(){
		setTableName("Relational conjunction");
		setOID("2.16.840.1.113883.12.210");

		putMap("AND", "Default");
		putMap("OR", "");

	}

}
