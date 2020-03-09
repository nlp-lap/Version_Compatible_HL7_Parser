package hl7.model.V2_5.table;

import hl7.bean.table.Table;

public class Table0421 extends Table{
	private static final String VERSION = "2.5";
	public static Table getInstance(){
		if(table==null) new Table0421();
		return table;
	}

	public static final String MI = "MI";
	public static final String MO = "MO";
	public static final String SE = "SE";

	private Table0421(){
		setTableName("Severity of Illness Code");
		setOID("2.16.840.1.113883.12.421");

		putMap("MI", "Mild");
		putMap("MO", "Moderate");
		putMap("SE", "Severe");

	}

}
