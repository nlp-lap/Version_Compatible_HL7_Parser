package hl7.pseudo.segment;

import hl7.bean.datastructure.DataStructure;

public class PD1 extends hl7.model.V2_7.segment.PD1{
	public PD1(){
		super();
	}

	public static PD1 CLASS;
	static{
		CLASS = new PD1();
	}

	public DataStructure[][] getComponents(){
		return super.getComponents();
	}
}

