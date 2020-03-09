package hl7.pseudo.segment;

import hl7.bean.datastructure.DataStructure;

public class RXO extends hl7.model.V2_7.segment.RXO{
	public RXO(){
		super();
	}

	public static RXO CLASS;
	static{
		CLASS = new RXO();
	}

	public DataStructure[][] getComponents(){
		return super.getComponents();
	}
}

