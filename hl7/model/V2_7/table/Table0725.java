package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0725 extends Table{
	private static final String VERSION = "2.7";
	public static Table getInstance(){
		if(table==null) new Table0725();
		return table;
	}

	public static final String APT = "APT";
	public static final String ARQ = "ARQ";
	public static final String EVN = "EVN";
	public static final String EVN_CRT = "EVN.CRT";
	public static final String EXP = "EXP";
	public static final String INT = "INT";
	public static final String PRMS = "PRMS";
	public static final String PRP = "PRP";
	public static final String RQO = "RQO";

	private Table0725(){
		setTableName("Mood Codes");
		setOID("");

		putMap("APT", "Appointment");
		putMap("ARQ", "Appointment Request");
		putMap("EVN", "Event");
		putMap("EVN.CRT", "Event Criterion");
		putMap("EXP", "Expectation");
		putMap("INT", "Intent");
		putMap("PRMS", "Promise");
		putMap("PRP", "Proposal");
		putMap("RQO", "Request-Order");

	}

}
