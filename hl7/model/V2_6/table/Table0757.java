package hl7.model.V2_6.table;

import hl7.bean.table.Table;

public class Table0757 extends Table{
	private static final String VERSION = "2.6";
	public static Table getInstance(){
		if(table==null) new Table0757();
		return table;
	}

	public static final String _0 = "0";
	public static final String _1 = "1";
	public static final String _2 = "2";

	private Table0757(){
		setTableName("Status Respiration Minutes");
		setOID("2.16.840.1.113883.12.757");

		putMap("0", "Respiration minutes not used for grouping");
		putMap("1", "Listed respiration minutes used for grouping");
		putMap("2", "OPS code value used for grouping");

	}

}
