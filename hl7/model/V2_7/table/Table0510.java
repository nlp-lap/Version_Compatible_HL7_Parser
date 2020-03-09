package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0510 extends Table{
	private static final String VERSION = "2.7";
	public static Table getInstance(){
		if(table==null) new Table0510();
		return table;
	}

	public static final String CR = "CR";
	public static final String DS = "DS";
	public static final String PT = "PT";
	public static final String RA = "RA";
	public static final String RD = "RD";
	public static final String RE = "RE";
	public static final String RI = "RI";
	public static final String RL = "RL";
	public static final String RQ = "RQ";
	public static final String RS = "RS";
	public static final String WA = "WA";

	private Table0510(){
		setTableName("Blood Product Dispense Status");
		setOID("");

		putMap("CR", "Released into inventory for general availability");
		putMap("DS", "Dispensed to patient location");
		putMap("PT", "Presumed transfused (dispensed and not returned)");
		putMap("RA", "Returned unused/no longer needed");
		putMap("RD", "Reserved and ready to dispense");
		putMap("RE", "Released (no longer allocated for the patient)");
		putMap("RI", "Received into inventory (for specified patient)");
		putMap("RL", "Returned unused/keep linked to patient for possible use later");
		putMap("RQ", "Request to dispense blood product");
		putMap("RS", "Reserved (ordered and product allocated for the patient)");
		putMap("WA", "Wasted (product no longer viable)");

	}

}
