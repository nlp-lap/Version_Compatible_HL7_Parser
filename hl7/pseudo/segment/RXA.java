package hl7.pseudo.segment;

import hl7.bean.datastructure.DataStructure;

public class RXA extends hl7.model.V2_7.segment.RXA{
	public RXA(){
		super();
	}

	public static RXA CLASS;
	static{
		CLASS = new RXA();
	}

	public DataStructure[][] getComponents(){
		return super.getComponents();
	}
}

