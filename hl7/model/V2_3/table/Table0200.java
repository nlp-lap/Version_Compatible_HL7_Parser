package hl7.model.V2_3.table;

import hl7.bean.table.Table;

public class Table0200 extends Table{
	private static final String VERSION = "2.3";
	public static Table getInstance(){
		if(table==null) new Table0200();
		return table;
	}

	public static final String A = "A";
	public static final String C = "C";
	public static final String D = "D";
	public static final String L = "L";
	public static final String M = "M";
	public static final String O = "O";

	private Table0200(){
		setTableName("Name Type");
		setOID("2.16.840.1.113883.12.200");

		putMap("A", "Alias Name");
		putMap("C", "Adopted Name");
		putMap("D", "Display Name");
		putMap("L", "Legal Name");
		putMap("M", "Maiden Name");
		putMap("O", "Other");

	}

}
