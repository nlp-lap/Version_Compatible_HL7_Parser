package hl7.pseudo.segment;

import hl7.bean.datastructure.DataStructure;

public class IN1 extends hl7.model.V2_7.segment.IN1{
	public IN1(){
		super();
	}

	public static IN1 CLASS;
	static{
		CLASS = new IN1();
	}

	public DataStructure[][] getComponents(){
		return super.getComponents();
	}
}

