package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0210 extends Table{
	private static final String VERSION = "2.7";
	public static Table getInstance(){
		if(table==null) new Table0210();
		return table;
	}

	public static final String AND = "AND";
	public static final String OR = "OR";

	private Table0210(){
		setTableName("Relational Conjunction");
		setOID("");

		putMap("AND", "Default");
		putMap("OR", "");

	}

}
