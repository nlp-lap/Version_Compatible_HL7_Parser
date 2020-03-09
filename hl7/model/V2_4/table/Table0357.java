package hl7.model.V2_4.table;

import hl7.bean.table.Table;

public class Table0357 extends Table{
	private static final String VERSION = "2.4";
	public static Table getInstance(){
		if(table==null) new Table0357();
		return table;
	}

	public static final String _0 = "0";
	public static final String _100 = "100";
	public static final String _101 = "101";
	public static final String _102 = "102";
	public static final String _103 = "103";
	public static final String _200 = "200";
	public static final String _201 = "201";
	public static final String _202 = "202";
	public static final String _203 = "203";
	public static final String _204 = "204";
	public static final String _205 = "205";
	public static final String _206 = "206";
	public static final String _207 = "207";
	public static final String Errors = "Errors";
	public static final String Rejection = "Rejection";
	public static final String Success = "Success";

	private Table0357(){
		setTableName("Message error condition codes");
		setOID("2.16.840.1.113883.12.357");

		putMap("0", "Message accepted");
		putMap("100", "Segment sequence error");
		putMap("101", "Required field missing");
		putMap("102", "Data type error");
		putMap("103", "Table value not found");
		putMap("200", "Unsupported message type");
		putMap("201", "Unsupported event code");
		putMap("202", "Unsupported processing id");
		putMap("203", "Unsupported version id");
		putMap("204", "Unknown key identifier");
		putMap("205", "Duplicate key identifier");
		putMap("206", "Application record locked");
		putMap("207", "Application internal error");
		putMap("Errors", "");
		putMap("Rejection", "");
		putMap("Success", "");

	}

}
