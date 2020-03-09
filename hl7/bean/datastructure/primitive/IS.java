package hl7.bean.datastructure.primitive;

import java.io.Serializable;

import hl7.bean.datastructure.Primitive;

public class IS extends Primitive implements Serializable{
	private static final long serialVersionUID = 1L;
	public IS(){
		description = "coded value for user-defined tables";
		type = IS;
	}
	public IS(String value){
		this();
		setValue(value);
	}
	
	public IS cloneClass(String originalVersion, String setVersion){
		return new IS();
	}
	
	public static IS CLASS;
	static{
		CLASS = new IS();
	}
	public String getType(){
		return type;
	}
}
