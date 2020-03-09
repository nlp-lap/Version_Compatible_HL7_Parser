package hl7.model.V2_3.table;

import hl7.bean.table.Table;

public class Table0008 extends Table{
	private static final String VERSION = "2.3";
	public static Table getInstance(){
		if(table==null) new Table0008();
		return table;
	}

	public static final String AA = "AA";
	public static final String AE = "AE";
	public static final String AR = "AR";
	public static final String CA = "CA";
	public static final String CE = "CE";
	public static final String CR = "CR";

	private Table0008(){
		setTableName("Acknowledgement Code");
		setOID("2.16.840.1.113883.12.8");

		putMap("AA", "Original mode:  Application Accept / Enhanced mode:  Application acknowledgement:  Accept");
		putMap("AE", "Original mode:  Application Error / Enhanced mode:  Application acknowledgement:  Error");
		putMap("AR", "Original mode:  Application Reject / Enhanced mode:  Application acknowledgement:  Reject");
		putMap("CA", "Enhanced mode:  Application acknowledgement:  Commit Accept");
		putMap("CE", "Enhanced mode:  Application acknowledgement:  Commit Error");
		putMap("CR", "Enhanced mode:  Application acknowledgement:  Commit Reject");

	}

}
