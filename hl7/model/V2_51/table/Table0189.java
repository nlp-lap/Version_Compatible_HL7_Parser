package hl7.model.V2_51.table;

import hl7.bean.table.Table;

public class Table0189 extends Table{
	private static final String VERSION = "2.5.1";
	public static Table getInstance(){
		if(table==null) new Table0189();
		return table;
	}

	public static final String H = "H";
	public static final String N = "N";
	public static final String U = "U";

	private Table0189(){
		setTableName("Ethnic Group");
		setOID("2.16.840.1.113883.12.189");

		putMap("H", "Hispanic or Latino");
		putMap("N", "Not Hispanic or Latino");
		putMap("U", "Unknown");

	}

}
