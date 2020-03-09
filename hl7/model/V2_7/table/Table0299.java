package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0299 extends Table{
	private static final String VERSION = "2.7";
	public static Table getInstance(){
		if(table==null) new Table0299();
		return table;
	}

	public static final String A = "A";
	public static final String Base64 = "Base64";
	public static final String Hex = "Hex";

	private Table0299(){
		setTableName("Encoding");
		setOID("");

		putMap("A", "No encoding - data are displayable ASCII characters.");
		putMap("Base64", "Encoding as defined by MIME (Multipurpose Internet Mail Extensions) standard RFC 1521. Four consecutive ASCII characters represent three consecutive octets of binary data. Base64 utilizes a 65-character subset of US-ASCII, consisting of both the upper and");
		putMap("Hex", "Hexadecimal encoding - consecutive pairs of hexadecimal digits represent consecutive single octets.");

	}

}
