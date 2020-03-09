package hl7.model.V2_51.table;

import hl7.bean.table.Table;

public class Table0160 extends Table{
	private static final String VERSION = "2.5.1";
	public static Table getInstance(){
		if(table==null) new Table0160();
		return table;
	}

	public static final String EARLY = "EARLY";
	public static final String GUEST = "GUEST";
	public static final String LATE = "LATE";
	public static final String MSG = "MSG";
	public static final String NO = "NO";

	private Table0160(){
		setTableName("Tray Type");
		setOID("2.16.840.1.113883.12.160");

		putMap("EARLY", "Early tray");
		putMap("GUEST", "Guest tray");
		putMap("LATE", "Late tray");
		putMap("MSG", "Tray message only");
		putMap("NO", "No tray");

	}

}
