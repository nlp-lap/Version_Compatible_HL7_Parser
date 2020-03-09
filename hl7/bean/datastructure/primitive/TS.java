package hl7.bean.datastructure.primitive;

import java.io.Serializable;

import hl7.bean.datastructure.Primitive;

public class TS extends Primitive implements Serializable{
	private static final long serialVersionUID = 1L;
	public TS(){
		description = "Time Stamp";
		type = DT;
	}
	public TS(String value){
		this();
		setValue(value);
	}
	
	public TS cloneClass(String originalVersion, String setVersion){
		return new TS();
	}
	
	public static TS CLASS;
	static{
		CLASS = new TS();
	}
	
	public String getType(){
		return type;
	}

}
