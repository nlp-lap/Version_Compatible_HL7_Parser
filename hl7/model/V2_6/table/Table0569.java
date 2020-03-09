package hl7.model.V2_6.table;

import hl7.bean.table.Table;

public class Table0569 extends Table{
	private static final String VERSION = "2.6";
	public static Table getInstance(){
		if(table==null) new Table0569();
		return table;
	}

	public static final String EOB = "EOB";
	public static final String PAT = "PAT";
	public static final String PRO = "PRO";

	private Table0569(){
		setTableName("Adjustment Action");
		setOID("2.16.840.1.113883.12.569");

		putMap("EOB", "Print on EOB");
		putMap("PAT", "Inform Patient");
		putMap("PRO", "Inform Provider");

	}

}
