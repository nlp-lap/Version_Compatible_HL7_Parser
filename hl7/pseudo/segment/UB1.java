package hl7.pseudo.segment;

import hl7.bean.datastructure.DataStructure;

public class UB1 extends hl7.model.V2_7.segment.UB1{
	public UB1(){
		super();
	}

	public static UB1 CLASS;
	static{
		CLASS = new UB1();
	}

	public DataStructure[][] getComponents(){
		return super.getComponents();
	}
}

