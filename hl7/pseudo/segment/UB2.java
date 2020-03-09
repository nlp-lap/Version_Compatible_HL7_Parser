package hl7.pseudo.segment;

import hl7.bean.datastructure.DataStructure;

public class UB2 extends hl7.model.V2_7.segment.UB2{
	public UB2(){
		super();
	}

	public static UB2 CLASS;
	static{
		CLASS = new UB2();
	}

	public DataStructure[][] getComponents(){
		return super.getComponents();
	}
}

