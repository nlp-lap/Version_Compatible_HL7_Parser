package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0667 extends Table{
	private static final String VERSION = "2.7";
	public static Table getInstance(){
		if(table==null) new Table0667();
		return table;
	}

	public static final String _0 = "0";
	public static final String _1 = "1";

	private Table0667(){
		setTableName("Device Data State -");
		setOID("");

		putMap("0", "Real Time Values");
		putMap("1", "Historic Values");

	}

}
