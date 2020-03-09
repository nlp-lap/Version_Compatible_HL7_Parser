package hl7.pseudo.segment;

import hl7.bean.datastructure.DataStructure;

public class PR1 extends hl7.model.V2_7.segment.PR1{
	public PR1(){
		super();
	}

	public static PR1 CLASS;
	static{
		CLASS = new PR1();
	}

	public DataStructure[][] getComponents(){
		return super.getComponents();
	}
}

