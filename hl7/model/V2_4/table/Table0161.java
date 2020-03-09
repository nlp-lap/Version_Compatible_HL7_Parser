package hl7.model.V2_4.table;

import hl7.bean.table.Table;

public class Table0161 extends Table{
	private static final String VERSION = "2.4";
	public static Table getInstance(){
		if(table==null) new Table0161();
		return table;
	}

	public static final String G = "G";
	public static final String N = "N";
	public static final String T = "T";

	private Table0161(){
		setTableName("Allow substitution");
		setOID("2.16.840.1.113883.12.161");

		putMap("G", "Allow generic substitutions.");
		putMap("N", "Substitutions are NOT authorized.  (This is the default - null.)");
		putMap("T", "Allow therapeutic substitutions");

	}

}
