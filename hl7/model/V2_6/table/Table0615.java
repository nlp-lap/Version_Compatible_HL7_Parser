package hl7.model.V2_6.table;

import hl7.bean.table.Table;

public class Table0615 extends Table{
	private static final String VERSION = "2.6";
	public static Table getInstance(){
		if(table==null) new Table0615();
		return table;
	}

	public static final String KERB = "KERB";
	public static final String SAML = "SAML";

	private Table0615(){
		setTableName("User Authentication Credential Type Code");
		setOID("2.16.840.1.113883.12.615");

		putMap("KERB", "Kerberos Service Ticket");
		putMap("SAML", "Authenticated User Identity Assertion");

	}

}
