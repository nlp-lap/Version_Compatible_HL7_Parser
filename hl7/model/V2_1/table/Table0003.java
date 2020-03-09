package hl7.model.V2_1.table;

import hl7.bean.table.Table;

public class Table0003 extends Table{
	private static final String VERSION = "2.1";
	public static Table getInstance(){
		if(table==null) new Table0003();
		return table;
	}

	public static final String A01 = "A01";
	public static final String A02 = "A02";
	public static final String A03 = "A03";
	public static final String A04 = "A04";
	public static final String A05 = "A05";
	public static final String A06 = "A06";
	public static final String A07 = "A07";
	public static final String A08 = "A08";
	public static final String A09 = "A09";
	public static final String A10 = "A10";
	public static final String A11 = "A11";
	public static final String A12 = "A12";
	public static final String A13 = "A13";
	public static final String A14 = "A14";
	public static final String A15 = "A15";
	public static final String A16 = "A16";
	public static final String A17 = "A17";
	public static final String A18 = "A18";
	public static final String A19 = "A19";
	public static final String A20 = "A20";
	public static final String A21 = "A21";
	public static final String A22 = "A22";
	public static final String A23 = "A23";
	public static final String A24 = "A24";
	public static final String O01 = "O01";
	public static final String O02 = "O02";
	public static final String P01 = "P01";
	public static final String P02 = "P02";
	public static final String P03 = "P03";
	public static final String P04 = "P04";
	public static final String Q01 = "Q01";
	public static final String Q02 = "Q02";
	public static final String R01 = "R01";
	public static final String R03 = "R03";

	private Table0003(){
		setTableName("EVENT TYPE CODE");
		setOID("2.16.840.1.113883.12.3");

		putMap("A01", "Admit a patient");
		putMap("A02", "Transfer a Patient");
		putMap("A03", "Discharge a Patient");
		putMap("A04", "Register a Patient");
		putMap("A05", "Pre-admit a Patient");
		putMap("A06", "Transfer an outpatient to inpatient");
		putMap("A07", "Transfer an Inpatient to Outpatient");
		putMap("A08", "Update patient information");
		putMap("A09", "Patient departing");
		putMap("A10", "Patient arriving");
		putMap("A11", "Cancel admit");
		putMap("A12", "Cancel transfer");
		putMap("A13", "Cancel discharge");
		putMap("A14", "Pending admit");
		putMap("A15", "Pending transfer");
		putMap("A16", "Pending discharge");
		putMap("A17", "Swap Patients");
		putMap("A18", "Merge patient information");
		putMap("A19", "Patient query");
		putMap("A20", "Bed status updates");
		putMap("A21", "Leave of Absence - Out (leaving)");
		putMap("A22", "Leave of Absence - In (returning)");
		putMap("A23", "Delete a Patient Record");
		putMap("A24", "Link Patient Records");
		putMap("O01", "Order message");
		putMap("O02", "Order response");
		putMap("P01", "Add and update patient account");
		putMap("P02", "Purge Patient Accounts");
		putMap("P03", "Post detail financial transaction");
		putMap("P04", "Generate bills and A/R statements");
		putMap("Q01", "Immediate access");
		putMap("Q02", "Deferred Access");
		putMap("R01", "Unsolicited transmission of requested Observ.");
		putMap("R03", "Display oriented results, query/unsol. update");

	}

}
