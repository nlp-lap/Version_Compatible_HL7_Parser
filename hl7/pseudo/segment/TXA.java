package hl7.pseudo.segment;

import hl7.bean.datastructure.DataStructure;

public class TXA extends hl7.model.V2_7.segment.TXA{
	public TXA(){
		super();
	}

	public static TXA CLASS;
	static{
		CLASS = new TXA();
	}

	public DataStructure[][] getComponents(){
		return super.getComponents();
	}
}

