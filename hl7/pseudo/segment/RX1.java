package hl7.pseudo.segment;

import hl7.bean.datastructure.DataStructure;

public class RX1 extends hl7.model.V2_1.segment.RX1{
	public RX1(){
		super();
	}

	public static RX1 CLASS;
	static{
		CLASS = new RX1();
	}

	public DataStructure[][] getComponents(){
		return super.getComponents();
	}
}

