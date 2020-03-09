package hl7.pseudo.segment;

import hl7.bean.datastructure.DataStructure;

public class IN3 extends hl7.model.V2_7.segment.IN3{
	public IN3(){
		super();
	}

	public static IN3 CLASS;
	static{
		CLASS = new IN3();
	}

	public DataStructure[][] getComponents(){
		return super.getComponents();
	}
}

