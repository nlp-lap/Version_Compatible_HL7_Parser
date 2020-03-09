package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0377 extends Table{
	private static final String VERSION = "2.7";
	public static Table getInstance(){
		if(table==null) new Table0377();
		return table;
	}

	public static final String A60 = "A60";
	public static final String ATM = "ATM";

	private Table0377(){
		setTableName("Other Environmental Factors");
		setOID("");

		putMap("A60", "Opened container, indoor atmosphere, 60 minutes duration");
		putMap("ATM", "Opened container, atmosphere and duration unspecified");

	}

}
