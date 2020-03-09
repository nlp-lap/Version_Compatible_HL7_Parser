package hl7.bean.datastructure.primitive;

import java.io.Serializable;

import hl7.bean.datastructure.Primitive;


public class ST extends Primitive implements Serializable{
	private static final long serialVersionUID = 1L;

	public ST(){
		description = "string data";
		type = ST;
	}
	public ST(String value){
		this();
		setValue(value);
	}
	
	public ST cloneClass(String originalVersion, String setVersion){
		return new ST();
	}
	
	public static ST CLASS;
	static{
		CLASS = new ST();
	}
	
	public String getType(){
		return type;
	}
}
