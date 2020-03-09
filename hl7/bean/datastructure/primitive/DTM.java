package hl7.bean.datastructure.primitive;

import java.io.Serializable;

import hl7.bean.datastructure.Primitive;

public class DTM extends Primitive implements Serializable{
	private static final long serialVersionUID = 1L;
	public DTM(){
		description = "Time Stamp";
		type = DTM;
	}
	public DTM(String value){
		this();
		setValue(value);
	}
	
	public DTM cloneClass(String originalVersion, String setVersion){
		return new DTM();
	}
	
	public static DTM CLASS;
	static{
		CLASS = new DTM();
	}
	public String getType(){
		return type;
	}
}
