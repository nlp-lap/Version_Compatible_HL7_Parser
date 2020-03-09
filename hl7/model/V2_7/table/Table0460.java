package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0460 extends Table{
	private static final String VERSION = "2.7";
	public static Table getInstance(){
		if(table==null) new Table0460();
		return table;
	}

	public static final String _0 = "0";
	public static final String _1 = "1";
	public static final String _2 = "2";

	private Table0460(){
		setTableName("Denial or Rejection Code");
		setOID("");

		putMap("0", "Line item not denied or rejected");
		putMap("1", "Line item denied or rejected");
		putMap("2", "Line item is on a multiple-day claim. The line item is not denied or rejected, but occurs on a day that has been denied or rejected.");

	}

}
