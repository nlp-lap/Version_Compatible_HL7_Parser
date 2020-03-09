package hl7.bean.datastructure.primitive;

import java.io.Serializable;

import hl7.bean.datastructure.Primitive;

public class TX extends Primitive implements Serializable{
	private static final long serialVersionUID = 1L;
	public TX(){
		description = "Text Data";
		type = TX;
	}
	public TX(String value){
		this();
		setValue(value);
	}
	
	public TX cloneClass(String originalVersion, String setVersion){
		return new TX();
	}
	
	public static TX CLASS;
	static{
		CLASS = new TX();
	}

	public String getType(){
		return type;
	}
}
