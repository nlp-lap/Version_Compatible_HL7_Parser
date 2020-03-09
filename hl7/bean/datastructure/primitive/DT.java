package hl7.bean.datastructure.primitive;

import java.io.Serializable;

import hl7.bean.datastructure.Primitive;

public class DT extends Primitive implements Serializable{
	private static final long serialVersionUID = 1L;

	public DT(){
		description = "Date";
		type = DT;
	}
	public DT(String value){
		this();
		setValue(value);
	}
	
	public DT cloneClass(String originalVersion, String setVersion){
		return new DT();
	}
	
	public static DT CLASS;
	static{
		CLASS = new DT();
	}
	
	public String getType(){
		return type;
	}

}
