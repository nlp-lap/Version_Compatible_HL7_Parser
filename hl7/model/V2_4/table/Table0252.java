package hl7.model.V2_4.table;

import hl7.bean.table.Table;

public class Table0252 extends Table{
	private static final String VERSION = "2.4";
	public static Table getInstance(){
		if(table==null) new Table0252();
		return table;
	}

	public static final String AW = "AW";
	public static final String BE = "BE";
	public static final String DR = "DR";
	public static final String EX = "EX";
	public static final String IN = "IN";
	public static final String LI = "LI";
	public static final String OE = "OE";
	public static final String OT = "OT";
	public static final String PL = "PL";
	public static final String SE = "SE";
	public static final String TC = "TC";

	private Table0252(){
		setTableName("Causality observations");
		setOID("2.16.840.1.113883.12.252");

		putMap("AW", "Abatement of event after product withdrawn");
		putMap("BE", "Event recurred after product reintroduced");
		putMap("DR", "Dose response observed");
		putMap("EX", "Alternative explanations for the event available");
		putMap("IN", "Event occurred after product introduced");
		putMap("LI", "Literature reports association of product with event");
		putMap("OE", "Occurrence of event was confirmed by objective evidence");
		putMap("OT", "Other");
		putMap("PL", "Effect observed when patient receives placebo");
		putMap("SE", "Similar events in past for this patient");
		putMap("TC", "Toxic levels of product documented in blood or body fluids");

	}

}
