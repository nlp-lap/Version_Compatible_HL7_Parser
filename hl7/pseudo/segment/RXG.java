package hl7.pseudo.segment;

import hl7.bean.datastructure.DataStructure;

public class RXG extends hl7.model.V2_7.segment.RXG{
	public RXG(){
		super();
	}

	public static RXG CLASS;
	static{
		CLASS = new RXG();
	}

	public DataStructure[][] getComponents(){
		return super.getComponents();
	}
}

