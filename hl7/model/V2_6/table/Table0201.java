package hl7.model.V2_6.table;

import hl7.bean.table.Table;

public class Table0201 extends Table{
	private static final String VERSION = "2.6";
	public static Table getInstance(){
		if(table==null) new Table0201();
		return table;
	}

	public static final String ASN = "ASN";
	public static final String BPN = "BPN";
	public static final String EMR = "EMR";
	public static final String NET = "NET";
	public static final String ORN = "ORN";
	public static final String PRN = "PRN";
	public static final String PRS = "PRS";
	public static final String VHN = "VHN";
	public static final String WPN = "WPN";

	private Table0201(){
		setTableName("Telecommunication use code");
		setOID("2.16.840.1.113883.12.201");

		putMap("ASN", "Answering Service Number");
		putMap("BPN", "Beeper Number");
		putMap("EMR", "Emergency Number");
		putMap("NET", "Network (email) Address");
		putMap("ORN", "Other Residence Number");
		putMap("PRN", "Primary Residence Number");
		putMap("PRS", "Personal");
		putMap("VHN", "Vacation Home Number");
		putMap("WPN", "Work Number");

	}

}
