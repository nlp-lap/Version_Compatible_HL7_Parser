package hl7.bean.datastructure.primitive;

import java.io.Serializable;

import hl7.bean.datastructure.Primitive;

public class var extends Primitive implements Serializable{
	private static final long serialVersionUID = 1L;
	public var(){
		description = "variable";
		type = var;
	}
	public var(String value){
		this();
		setValue(value);
	}
	
	public var cloneClass(String originalVersion, String setVersion){
		return new var();
	}
	
	public static var CLASS;
	static{
		CLASS = new var();
	}
	
	public String getType(){
		return type;
	}

}
