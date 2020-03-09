package hl7.bean.datastructure.primitive;

import java.io.Serializable;

import hl7.bean.datastructure.Primitive;

public class SI extends Primitive implements Serializable{
	private static final long serialVersionUID = 1L;
	public SI(){
		description = "Sequence ID";
		type = SI;
	}
	public SI(String value){
		this();
		setValue(value);
	}
	
	public SI cloneClass(String originalVersion, String setVersion){
		return new SI();
	}
	
	public static SI CLASS;
	static{
		CLASS = new SI();
	}
	public String getType(){
		return type;
	}
}
