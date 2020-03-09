package hl7.pseudo.segment;

import hl7.bean.datastructure.DataStructure;

public class RXC extends hl7.model.V2_7.segment.RXC{
	public RXC(){
		super();
	}

	public static RXC CLASS;
	static{
		CLASS = new RXC();
	}

	public DataStructure[][] getComponents(){
		return super.getComponents();
	}
}

