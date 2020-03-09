package hl7.pseudo.segment;

import hl7.bean.datastructure.DataStructure;

public class TQ2 extends hl7.model.V2_7.segment.TQ2{
	public TQ2(){
		super();
	}

	public static TQ2 CLASS;
	static{
		CLASS = new TQ2();
	}

	public DataStructure[][] getComponents(){
		return super.getComponents();
	}
}

