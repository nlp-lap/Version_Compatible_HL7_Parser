package hl7.model.V2_5.table;

import hl7.bean.table.Table;

public class Table0377 extends Table{
	private static final String VERSION = "2.5";
	public static Table getInstance(){
		if(table==null) new Table0377();
		return table;
	}

	public static final String A60 = "A60";
	public static final String ATM = "ATM";

	private Table0377(){
		setTableName("Other environmental factors");
		setOID("2.16.840.1.113883.12.377");

		putMap("A60", "Opened container, indoor atmosphere, 60 minutes duration");
		putMap("ATM", "Opened container, atmosphere and duration unspecified");

	}

}
