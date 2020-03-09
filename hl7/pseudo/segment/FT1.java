package hl7.pseudo.segment;

import hl7.bean.datastructure.DataStructure;

public class FT1 extends hl7.model.V2_7.segment.FT1{
	public FT1(){
		super();
	}

	public static FT1 CLASS;
	static{
		CLASS = new FT1();
	}

	public DataStructure[][] getComponents(){
		return super.getComponents();
	}
}

