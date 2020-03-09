package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0569 extends Table{
	private static final String VERSION = "2.7";
	public static Table getInstance(){
		if(table==null) new Table0569();
		return table;
	}

	public static final String EOB = "EOB";
	public static final String PAT = "PAT";
	public static final String PRO = "PRO";

	private Table0569(){
		setTableName("Adjustment Action");
		setOID("");

		putMap("EOB", "Print on EOB");
		putMap("PAT", "Inform Patient");
		putMap("PRO", "Inform Provider");

	}

}
