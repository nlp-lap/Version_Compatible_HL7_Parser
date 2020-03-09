package hl7.pseudo.segment;

import hl7.bean.datastructure.DataStructure;

public class PCR extends hl7.model.V2_7.segment.PCR{
	public PCR(){
		super();
	}

	public static PCR CLASS;
	static{
		CLASS = new PCR();
	}

	public DataStructure[][] getComponents(){
		return super.getComponents();
	}
}

