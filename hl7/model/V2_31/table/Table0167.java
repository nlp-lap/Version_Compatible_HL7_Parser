package hl7.model.V2_31.table;

import hl7.bean.table.Table;

public class Table0167 extends Table{
	private static final String VERSION = "2.3.1";
	public static Table getInstance(){
		if(table==null) new Table0167();
		return table;
	}

	public static final String _0 = "0";
	public static final String _1 = "1";
	public static final String _2 = "2";
	public static final String _3 = "3";
	public static final String _4 = "4";
	public static final String _5 = "5";
	public static final String _7 = "7";
	public static final String _8 = "8";
	public static final String G = "G";
	public static final String N = "N";
	public static final String T = "T";

	private Table0167(){
		setTableName("Substitution status");
		setOID("2.16.840.1.113883.12.167");

		putMap("0", "No product selection indicated");
		putMap("1", "Substitution not allowed by prescriber");
		putMap("2", "Substitution allowed - patient requested product dispensed");
		putMap("3", "Substitution allowed - pharmacist selected product dispensed");
		putMap("4", "Substitution allowed - generic drug not in stock");
		putMap("5", "Substitution allowed - brand drug dispensed as a generic");
		putMap("7", "Substitution not allowed - brand drug mandated by law");
		putMap("8", "Substitution allowed - generic drug not available in marketplace");
		putMap("G", "A generic substitution was dispensed.");
		putMap("N", "No substitute was dispensed.  This is equivalent to the default (null) value.");
		putMap("T", "A therapeutic substitution was dispensed.");

	}

}
