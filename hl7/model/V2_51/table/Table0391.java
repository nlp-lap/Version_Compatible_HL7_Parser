package hl7.model.V2_51.table;

import hl7.bean.table.Table;

public class Table0391 extends Table{
	private static final String VERSION = "2.5.1";
	public static Table getInstance(){
		if(table==null) new Table0391();
		return table;
	}

	public static final String OBRG = "OBRG";
	public static final String ORCG = "ORCG";
	public static final String PIDG = "PIDG";
	public static final String RXAG = "RXAG";
	public static final String RXDG = "RXDG";
	public static final String RXEG = "RXEG";
	public static final String RXOG = "RXOG";

	private Table0391(){
		setTableName("Segment group");
		setOID("2.16.840.1.113883.12.391");

		putMap("OBRG", "OBR group");
		putMap("ORCG", "ORC group");
		putMap("PIDG", "PID group");
		putMap("RXAG", "RXA group");
		putMap("RXDG", "RXD group");
		putMap("RXEG", "RXE group");
		putMap("RXOG", "RXO group");

	}

}
