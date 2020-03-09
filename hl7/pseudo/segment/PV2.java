package hl7.pseudo.segment;

import hl7.bean.datastructure.DataStructure;

public class PV2 extends hl7.model.V2_7.segment.PV2{
	public PV2(){
		super();
	}

	public static PV2 CLASS;
	static{
		CLASS = new PV2();
	}

	public DataStructure[][] getComponents(){
		return super.getComponents();
	}
}

