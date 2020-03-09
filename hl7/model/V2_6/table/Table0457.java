package hl7.model.V2_6.table;

import hl7.bean.table.Table;

public class Table0457 extends Table{
	private static final String VERSION = "2.6";
	public static Table getInstance(){
		if(table==null) new Table0457();
		return table;
	}

	public static final String _0 = "0";
	public static final String _1 = "1";
	public static final String _2 = "2";
	public static final String _3 = "3";
	public static final String _4 = "4";

	private Table0457(){
		setTableName("Overall Claim Disposition Code");
		setOID("2.16.840.1.113883.12.457");

		putMap("0", "No edits present on claim");
		putMap("1", "Only edits present are for line item denial or rejection");
		putMap("2", "Multiple-day claim with one or more days denied or rejected");
		putMap("3", "Claim denied, rejected, suspended or returned to provider with only post payment edits");
		putMap("4", "Claim denied, rejected, suspended or returned to provider with only pre payment edits");

	}

}
