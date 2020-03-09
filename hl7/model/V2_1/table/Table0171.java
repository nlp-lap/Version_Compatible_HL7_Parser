package hl7.model.V2_1.table;

import hl7.bean.table.Table;

public class Table0171 extends Table{
	private static final String VERSION = "2.1";
	public static Table getInstance(){
		if(table==null) new Table0171();
		return table;
	}

	public static final String D = "D";

	private Table0171(){
		setTableName("Country Code");
		setOID("2.16.840.1.113883.12.171");

		putMap("D", "Germany");

	}

}
