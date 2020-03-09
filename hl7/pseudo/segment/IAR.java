package hl7.pseudo.segment;

import hl7.bean.datastructure.DataStructure;

public class IAR extends hl7.model.V2_7.segment.IAR{
	public IAR(){
		super();
	}

	public static IAR CLASS;
	static{
		CLASS = new IAR();
	}

	public DataStructure[][] getComponents(){
		return super.getComponents();
	}
}

