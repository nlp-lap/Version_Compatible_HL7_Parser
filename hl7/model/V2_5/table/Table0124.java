package hl7.model.V2_5.table;

import hl7.bean.table.Table;

public class Table0124 extends Table{
	private static final String VERSION = "2.5";
	public static Table getInstance(){
		if(table==null) new Table0124();
		return table;
	}

	public static final String CART = "CART";
	public static final String PORT = "PORT";
	public static final String WALK = "WALK";
	public static final String WHLC = "WHLC";

	private Table0124(){
		setTableName("Transportation Mode");
		setOID("2.16.840.1.113883.12.124");

		putMap("CART", "Cart - patient travels on cart or gurney");
		putMap("PORT", "The examining device goes to patient's location");
		putMap("WALK", "Patient walks to diagnostic service");
		putMap("WHLC", "Wheelchair");

	}

}
