package hl7.model.V2_2.table;

import hl7.bean.table.Table;

public class Table0003 extends Table{
	private static final String VERSION = "2.2";
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
	public static final String A25 = "A25";
	public static final String A26 = "A26";
	public static final String A27 = "A27";
	public static final String A28 = "A28";
	public static final String A29 = "A29";
	public static final String A30 = "A30";
	public static final String A31 = "A31";
	public static final String A32 = "A32";
	public static final String A33 = "A33";
	public static final String A34 = "A34";
	public static final String A35 = "A35";
	public static final String A36 = "A36";
	public static final String A37 = "A37";
	public static final String M01 = "M01";
	public static final String M02 = "M02";
	public static final String M03 = "M03";
	public static final String O01 = "O01";
	public static final String O02 = "O02";
	public static final String P01 = "P01";
	public static final String P02 = "P02";
	public static final String P03 = "P03";
	public static final String P04 = "P04";
	public static final String Q01 = "Q01";
	public static final String Q02 = "Q02";
	public static final String Q03 = "Q03";
	public static final String Q05 = "Q05";
	public static final String R01 = "R01";
	public static final String R02 = "R02";
	public static final String R03 = "R03";
	public static final String R04 = "R04";

	private Table0003(){
		setTableName("EVENT TYPE CODE");
		setOID("2.16.840.1.113883.12.3");

		putMap("A01", "Admit a patient");
		putMap("A02", "Transfer a patient");
		putMap("A03", "Discharge a patient");
		putMap("A04", "Register a patient");
		putMap("A05", "Pre-admit a Patient");
		putMap("A06", "Transfer an outpatient to inpatient");
		putMap("A07", "Transfer an inpatient to outpatient");
		putMap("A08", "Update patient information");
		putMap("A09", "Patient departing");
		putMap("A10", "Patient arriving");
		putMap("A11", "Cancel admit");
		putMap("A12", "Cancel transfer");
		putMap("A13", "Cancel discharge");
		putMap("A14", "Pending admit");
		putMap("A15", "Pending transfer");
		putMap("A16", "Pending discharge");
		putMap("A17", "Swap patients");
		putMap("A18", "Merge patient information");
		putMap("A19", "Patient query");
		putMap("A20", "Bed Status Update");
		putMap("A21", "Leave of absence - out (leaving)");
		putMap("A22", "Leave of absence - in (returning)");
		putMap("A23", "Delete a patient record");
		putMap("A24", "Link patient information");
		putMap("A25", "Cancel pending discharge");
		putMap("A26", "Cancel pending transfer");
		putMap("A27", "Cancel pending admit");
		putMap("A28", "Add person information");
		putMap("A29", "Delete person information");
		putMap("A30", "Merge Patient information");
		putMap("A31", "Update person information");
		putMap("A32", "Cancel patient arriving");
		putMap("A33", "Cancel patient departing");
		putMap("A34", "Merge patient information - patient ID only");
		putMap("A35", "Merge patient information - account number only");
		putMap("A36", "Merge patient information - patient ID and account number");
		putMap("A37", "Unlink patient information");
		putMap("M01", "Master file not otherwise specified (for backwards compatibility only)");
		putMap("M02", "Master file - Staff Practioner");
		putMap("M03", "Master file - test / observation");
		putMap("O01", "Order message");
		putMap("O02", "Order response");
		putMap("P01", "Add and Update Patient Accounts");
		putMap("P02", "Purge Patient Accounts");
		putMap("P03", "Post detail financial transaction");
		putMap("P04", "Generate bill and accounts receivable statements");
		putMap("Q01", "Immediate access");
		putMap("Q02", "Deferred access");
		putMap("Q03", "Deferred response to query");
		putMap("Q05", "Unsolicited display update");
		putMap("R01", "Unsolicited transmission of requested observation");
		putMap("R02", "Query for results of observation");
		putMap("R03", "Display-oriented results (query / unsolicited update)");
		putMap("R04", "Response to query / transmission of requested observation");

	}

}
