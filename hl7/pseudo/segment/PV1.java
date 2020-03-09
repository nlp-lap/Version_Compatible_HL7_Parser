package hl7.pseudo.segment;

import hl7.bean.datastructure.DataStructure;

public class PV1 extends hl7.model.V2_7.segment.PV1{
	public PV1(){
		super();
	}

	public static PV1 CLASS;
	static{
		CLASS = new PV1();
	}

	public DataStructure[][] getComponents(){
		return super.getComponents();
	}
}

