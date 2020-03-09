package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0421 extends Table{
	private static final String VERSION = "2.7";
	public static Table getInstance(){
		if(table==null) new Table0421();
		return table;
	}

	public static final String MI = "MI";
	public static final String MO = "MO";
	public static final String SE = "SE";

	private Table0421(){
		setTableName("Severity of Illness Code");
		setOID("");

		putMap("MI", "Mild");
		putMap("MO", "Moderate");
		putMap("SE", "Severe");

	}

}
