package hl7.pseudo.segment;

import hl7.bean.datastructure.DataStructure;

public class RXD extends hl7.model.V2_7.segment.RXD{
	public RXD(){
		super();
	}

	public static RXD CLASS;
	static{
		CLASS = new RXD();
	}

	public DataStructure[][] getComponents(){
		return super.getComponents();
	}
}

