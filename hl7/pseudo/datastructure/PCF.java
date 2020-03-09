package hl7.pseudo.datastructure;

import hl7.bean.datastructure.DataStructure;

public class PCF extends hl7.model.V2_4.datastructure.PCF{
	public PCF(){
		super();
	}
	
	public static PCF CLASS;
	static{
		CLASS = new PCF();
	}

	public DataStructure[] getComponents(){
		return super.getComponents();
	}
}
