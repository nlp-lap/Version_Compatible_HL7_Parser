package hl7.model.V2_6.table;

import hl7.bean.table.Table;

public class Table0742 extends Table{
	private static final String VERSION = "2.6";
	public static Table getInstance(){
		if(table==null) new Table0742();
		return table;
	}

	public static final String _00 = "00";
	public static final String _01 = "01";
	public static final String _03 = "03";
	public static final String _04 = "04";
	public static final String _05 = "05";
	public static final String _10 = "10";
	public static final String _11 = "11";

	private Table0742(){
		setTableName("DRG Status Financial Calculation");
		setOID("2.16.840.1.113883.12.742");

		putMap("00", "Effective weight calculated");
		putMap("01", "Hospital specific contract");
		putMap("03", "Eeffective weight for transfer/referral calculated");
		putMap("04", "Referral from other hospital based on a cooperation (no DRG reimbursement)");
		putMap("05", "Invalid length of stay");
		putMap("10", "No information/entry in cost data for this DRG");
		putMap("11", "No relative weight found for department (type)");

	}

}
