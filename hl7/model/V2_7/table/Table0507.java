package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0507 extends Table{
	private static final String VERSION = "2.7";
	public static Table getInstance(){
		if(table==null) new Table0507();
		return table;
	}

	public static final String F = "F";
	public static final String N = "N";

	private Table0507(){
		setTableName("Observation Result Handling");
		setOID("");

		putMap("F", "Film-with-patient");
		putMap("N", "Notify provider when ready");

	}

}
