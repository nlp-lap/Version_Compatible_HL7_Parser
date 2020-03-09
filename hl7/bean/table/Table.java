package hl7.bean.table;

import java.util.HashMap;

public abstract class Table {
	protected String tableID;
	public String getTableID(){
		return tableID;
	}
	protected void setTableID(String tableID){
		this.tableID = tableID;
	}
		
	protected String tableName;
	public String getTableName(){
		return tableName;
	}
	protected void setTableName(String tableName){
		this.tableName = tableName;
	}
	
	protected String OID;
	public String getOID(){
		return OID;
	}
	protected void setOID(String OID){
		this.OID = OID;
	}
	
	protected HashMap<String, String> descriptionMap = new HashMap<String, String>();
	protected void putMap(String value, String description){
		this.descriptionMap.put(value, description);
	}
	public boolean exist(String value){
		return descriptionMap.containsKey(value);
	}
	public String getDescription(String value){
		return descriptionMap.get(value);
	}
	
	protected static Table table;
}
