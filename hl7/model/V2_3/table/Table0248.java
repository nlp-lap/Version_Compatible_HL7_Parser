package hl7.model.V2_3.table;

import hl7.bean.table.Table;

public class Table0248 extends Table{
	private static final String VERSION = "2.3";
	public static Table getInstance(){
		if(table==null) new Table0248();
		return table;
	}

	public static final String A = "A";
	public static final String L = "L";
	public static final String N = "N";
	public static final String R = "R";

	private Table0248(){
		setTableName("Product Source");
		setOID("2.16.840.1.113883.12.248");

		putMap("A", "Actual product involved in incident was evaluated");
		putMap("L", "A product from the same lot as the the actual product involved was evaluated");
		putMap("N", "A product from a controlled/non-related inventory was evaluated");
		putMap("R", "A product from a reserve sample was evaluated");

	}

}
