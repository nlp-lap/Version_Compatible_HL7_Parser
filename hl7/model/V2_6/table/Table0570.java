package hl7.model.V2_6.table;

import hl7.bean.table.Table;

public class Table0570 extends Table{
	private static final String VERSION = "2.6";
	public static Table getInstance(){
		if(table==null) new Table0570();
		return table;
	}

	public static final String CASH = "CASH";
	public static final String CCCA = "CCCA";
	public static final String CCHK = "CCHK";
	public static final String CDAC = "CDAC";
	public static final String CHCK = "CHCK";
	public static final String DDPO = "DDPO";
	public static final String DEBC = "DEBC";
	public static final String SWFT = "SWFT";
	public static final String TRAC = "TRAC";
	public static final String VISN = "VISN";

	private Table0570(){
		setTableName("Payment Method Code");
		setOID("2.16.840.1.113883.12.570");

		putMap("CASH", "Cash");
		putMap("CCCA", "Credit Card");
		putMap("CCHK", "Cashier's Check");
		putMap("CDAC", "Credit/Debit Account");
		putMap("CHCK", "Check");
		putMap("DDPO", "Direct Deposit");
		putMap("DEBC", "Debit Card");
		putMap("SWFT", "Society for Worldwide Interbank Financial Telecommunications (S.W.I.F.T.)");
		putMap("TRAC", "Traveler's Check");
		putMap("VISN", "VISA Special Electronic Funds Transfer Network");

	}

}
