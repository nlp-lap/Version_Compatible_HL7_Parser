package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0544 extends Table{
	private static final String VERSION = "2.7";
	public static Table getInstance(){
		if(table==null) new Table0544();
		return table;
	}

	public static final String CC = "CC";
	public static final String CL = "CL";
	public static final String CT = "CT";
	public static final String SB = "SB";
	public static final String XAMB = "XAMB";
	public static final String XC37 = "XC37";
	public static final String XCAMB = "XCAMB";
	public static final String XCATM = "XCATM";
	public static final String XCFRZ = "XCFRZ";
	public static final String XCREF = "XCREF";
	public static final String XDFRZ = "XDFRZ";
	public static final String XDRY = "XDRY";
	public static final String XFRZ = "XFRZ";
	public static final String XMTLF = "XMTLF";
	public static final String XNTR = "XNTR";
	public static final String XPRTL = "XPRTL";
	public static final String XPSA = "XPSA";
	public static final String XPSO = "XPSO";
	public static final String XREF = "XREF";
	public static final String XUFRZ = "XUFRZ";
	public static final String XUPR = "XUPR";

	private Table0544(){
		setTableName("Container Condition");
		setOID("");

		putMap("CC", "Container Cracked");
		putMap("CL", "Container Leaking");
		putMap("CT", "Container Torn");
		putMap("SB", "Seal Broken");
		putMap("XAMB", "Not Ambient temperature");
		putMap("XC37", "Not Body temperature");
		putMap("XCAMB", "Not Critical ambient temperature");
		putMap("XCATM", "Exposed to Air");
		putMap("XCFRZ", "Not Critical frozen temperature");
		putMap("XCREF", "Not Critical refrigerated temperature");
		putMap("XDFRZ", "Not Deep frozen");
		putMap("XDRY", "Not Dry");
		putMap("XFRZ", "Not Frozen temperature");
		putMap("XMTLF", "Metal Exposed");
		putMap("XNTR", "Not Liquid nitrogen");
		putMap("XPRTL", "Not Protected from light");
		putMap("XPSA", "Shaken");
		putMap("XPSO", "Exposed to shock");
		putMap("XREF", "Not Refrigerated temperature");
		putMap("XUFRZ", "Not Ultra frozen");
		putMap("XUPR", "Not Upright");

	}

}
