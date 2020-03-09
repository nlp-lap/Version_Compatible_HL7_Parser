package hl7.pseudo.segment;

import hl7.bean.datastructure.DataStructure;

public class IN2 extends hl7.model.V2_7.segment.IN2{
	public IN2(){
		super();
	}

	public static IN2 CLASS;
	static{
		CLASS = new IN2();
	}

	public DataStructure[][] getComponents(){
		return super.getComponents();
	}
}

