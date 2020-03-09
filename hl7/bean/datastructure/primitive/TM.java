package hl7.bean.datastructure.primitive;

import java.io.Serializable;

import hl7.bean.datastructure.Primitive;

public class TM extends Primitive implements Serializable{
	private static final long serialVersionUID = 1L;
	public TM(){
		description = "Time";
		type = TM;
	}
	public TM(String value){
		this();
		setValue(value);
	}
	
	public TM cloneClass(String originalVersion, String setVersion){
		return new TM();
	}
	
	public static TM CLASS;
	static{
		CLASS = new TM();
	}
	
	public String getType(){
		return type;
	}

}
