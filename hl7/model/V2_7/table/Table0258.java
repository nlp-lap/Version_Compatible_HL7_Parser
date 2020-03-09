package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0258 extends Table{
	private static final String VERSION = "2.7";
	public static Table getInstance(){
		if(table==null) new Table0258();
		return table;
	}

	public static final String BPU = "BPU";
	public static final String CONTROL = "CONTROL";
	public static final String DONOR = "DONOR";
	public static final String PATIENT = "PATIENT";

	private Table0258(){
		setTableName("Relationship Modifier");
		setOID("");

		putMap("BPU", "Blood product unit");
		putMap("CONTROL", "Control");
		putMap("DONOR", "Donor");
		putMap("PATIENT", "Patient");

	}

}
