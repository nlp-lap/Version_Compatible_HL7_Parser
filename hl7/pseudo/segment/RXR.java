package hl7.pseudo.segment;

import hl7.bean.datastructure.DataStructure;

public class RXR extends hl7.model.V2_7.segment.RXR{
	public RXR(){
		super();
	}

	public static RXR CLASS;
	static{
		CLASS = new RXR();
	}

	public DataStructure[][] getComponents(){
		return super.getComponents();
	}
}

