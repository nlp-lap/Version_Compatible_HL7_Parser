package hl7.model.V2_1.table;

import hl7.bean.table.Table;

public class Table0061 extends Table{
	private static final String VERSION = "2.1";
	public static Table getInstance(){
		if(table==null) new Table0061();
		return table;
	}

	public static final String M11 = "M11";

	private Table0061(){
		setTableName("CHECK DIGIT SCHEME");
		setOID("2.16.840.1.113883.12.61");

		putMap("M11", "Mod 11 check digit scheme");

	}

}
