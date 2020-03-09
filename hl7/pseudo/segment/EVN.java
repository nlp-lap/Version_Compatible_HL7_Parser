package hl7.pseudo.segment;

import hl7.bean.datastructure.DataStructure;

public class EVN extends hl7.model.V2_7.segment.EVN{
	public EVN(){
		super();
	}

	public static EVN CLASS;
	static{
		CLASS = new EVN();
	}

	public DataStructure[][] getComponents(){
		return super.getComponents();
	}
}

