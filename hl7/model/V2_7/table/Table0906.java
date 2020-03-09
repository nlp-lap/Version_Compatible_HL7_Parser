package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0906 extends Table{
	private static final String VERSION = "2.7";
	public static Table getInstance(){
		if(table==null) new Table0906();
		return table;
	}

	public static final String A = "A";
	public static final String CR = "CR";
	public static final String CS = "CS";
	public static final String CSP = "CSP";
	public static final String CSR = "CSR";
	public static final String EL = "EL";
	public static final String EM = "EM";
	public static final String P = "P";
	public static final String PRN = "PRN";
	public static final String R = "R";
	public static final String RR = "RR";
	public static final String S = "S";
	public static final String T = "T";
	public static final String UD = "UD";
	public static final String UR = "UR";

	private Table0906(){
		setTableName("ActPriority");
		setOID("");

		putMap("A", "ASAP - As soon as possible, next highest priority after stat");
		putMap("CR", "Callback results - filler should contact the placer as soon as results are available, even for preliminary results");
		putMap("CS", "Callback for scheduling - Filler should contact the placer (or target) to schedule the service.");
		putMap("CSP", "Callback placer for scheduling - filler should contact the placer to schedule the service");
		putMap("CSR", "Contact recipient for scheduling - Filler should contact the service recipient (target) to schedule the service");
		putMap("EL", "Elective - Beneficial to the patient but not essential for survival.");
		putMap("EM", "Emergency - An unforeseen combination of circumstances or the resulting state that calls for immediate action");
		putMap("P", "Preop - Used to indicate that a service is to be performed prior to a scheduled surgery.  When ordering a service and using the pre-op priority, a check is done to see the amount of time that must be allowed for performance of the service.  When the order");
		putMap("PRN", "As needed - An as needed order should be accompanied by a description of what constitutes a need.  This description is represented by an observation service predicate as a precondition.");
		putMap("R", "Routine - Routine service, do at usual work hours");
		putMap("RR", "Rush reporting - A report should be prepared and sent as quickly as possible");
		putMap("S", "Stat - With highest priority (e.g. emergency).");
		putMap("T", "Timing critical - It is critical to come as close as possible to the requested time (e.g. for a through antimicrobial level).");
		putMap("UD", "Use as directed - Drug is to be used as directed by the prescriber.");
		putMap("UR", "Urgent - Calls for prompt action");

	}

}
