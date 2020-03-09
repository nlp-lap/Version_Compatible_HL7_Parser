package hl7.model.V2_5.table;

import hl7.bean.table.Table;

public class Table0470 extends Table{
	private static final String VERSION = "2.5";
	public static Table getInstance(){
		if(table==null) new Table0470();
		return table;
	}

	public static final String Crnl = "Crnl";
	public static final String DME = "DME";
	public static final String EPO = "EPO";
	public static final String Lab = "Lab";
	public static final String Mamm = "Mamm";
	public static final String NoPay = "NoPay";
	public static final String OPPS = "OPPS";
	public static final String PartH = "PartH";
	public static final String Pckg = "Pckg";
	public static final String Thrpy = "Thrpy";

	private Table0470(){
		setTableName("Reimbursement Type Code");
		setOID("2.16.840.1.113883.12.470");

		putMap("Crnl", "Corneal Tissue APC");
		putMap("DME", "Durable Medical Equipment");
		putMap("EPO", "Epotein");
		putMap("Lab", "Clinical Laboratory APC");
		putMap("Mamm", "Screening Mammography APC");
		putMap("NoPay", "This APC is not paid");
		putMap("OPPS", "Outpatient Prospective Payment System");
		putMap("PartH", "Partial Hospitalization APC");
		putMap("Pckg", "Packaged APC");
		putMap("Thrpy", "Therapy APC");

	}

}
