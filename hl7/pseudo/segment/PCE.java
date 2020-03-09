package hl7.pseudo.segment;

import hl7.bean.datastructure.DataStructure;

public class PCE extends hl7.model.V2_7.segment.PCE{
	public PCE(){
		super();
	}

	public static PCE CLASS;
	static{
		CLASS = new PCE();
	}

	public DataStructure[][] getComponents(){
		return super.getComponents();
	}
}

