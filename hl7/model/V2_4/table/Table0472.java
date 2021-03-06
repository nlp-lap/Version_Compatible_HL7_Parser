package hl7.model.V2_4.table;

import hl7.bean.table.Table;

public class Table0472 extends Table{
	private static final String VERSION = "2.4";
	public static Table getInstance(){
		if(table==null) new Table0472();
		return table;
	}

	public static final String A = "A";
	public static final String C = "C";
	public static final String S = "S";

	private Table0472(){
		setTableName("TQ Conjunction ID");
		setOID("2.16.840.1.113883.12.472");

		putMap("A", "Asynchronous: Do the next specification in parallel with this one (unless otherwise constrained by the following components: ORC-7^4-start date/time and ORC-7^5-end date/time).  The conjunction of A specifies two parallel instructions, as are sometimes");
		putMap("C", "This is an actuation time.  It will be followed by a completion time for the service.  This code allows one to distinguish between the time and priority at which a service should be actuated (e.g., blood should be drawn) and the time and priority at which");
		putMap("S", "Synchronous. Do the next specification after this one (unless otherwise constrained by the following components: ORC-7^4-start date/time and ORC-7^5-end date/time). An S specification implies that the second timing sequence follows the first, e.g., when");

	}

}
