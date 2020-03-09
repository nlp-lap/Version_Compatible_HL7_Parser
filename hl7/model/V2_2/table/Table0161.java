package hl7.model.V2_2.table;

import hl7.bean.table.Table;

public class Table0161 extends Table{
	private static final String VERSION = "2.2";
	public static Table getInstance(){
		if(table==null) new Table0161();
		return table;
	}

	public static final String G = "G";
	public static final String N = "N";
	public static final String T = "T";

	private Table0161(){
		setTableName("ALLOW SUBSTITUTION");
		setOID("2.16.840.1.113883.12.161");

		putMap("G", "Allow generic substitutions");
		putMap("N", "Substitutions are not authorized");
		putMap("T", "Allow therapeutic substitutions");

	}

}
