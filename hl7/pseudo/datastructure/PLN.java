package hl7.pseudo.datastructure;

import hl7.bean.datastructure.DataStructure;

public class PLN extends hl7.model.V2_7.datastructure.PLN{
	public PLN(){
		super();
	}
	
	public static PLN CLASS;
	static{
		CLASS = new PLN();
	}

	public DataStructure[] getComponents(){
		return super.getComponents();
	}
}
