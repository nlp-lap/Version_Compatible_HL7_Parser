package hl7.pseudo.segment;

import hl7.bean.datastructure.DataStructure;

public class TQ1 extends hl7.model.V2_7.segment.TQ1{
	public TQ1(){
		super();
	}

	public static TQ1 CLASS;
	static{
		CLASS = new TQ1();
	}

	public DataStructure[][] getComponents(){
		return super.getComponents();
	}
}

