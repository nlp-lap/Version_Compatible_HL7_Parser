package hl7.pseudo.datastructure;

import hl7.bean.datastructure.DataStructure;

public class PT extends hl7.model.V2_7.datastructure.PT{
	public PT(){
		super();
	}
	
	public static PT CLASS;
	static{
		CLASS = new PT();
	}

	public DataStructure[] getComponents(){
		return super.getComponents();
	}
}
