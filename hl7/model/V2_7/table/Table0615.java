package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0615 extends Table{
	private static final String VERSION = "2.7";
	public static Table getInstance(){
		if(table==null) new Table0615();
		return table;
	}

	public static final String KERB = "KERB";
	public static final String SAML = "SAML";

	private Table0615(){
		setTableName("User Authentication Credential Type Code");
		setOID("");

		putMap("KERB", "Kerberos Service Ticket");
		putMap("SAML", "Authenticated User Identity Assertion");

	}

}
