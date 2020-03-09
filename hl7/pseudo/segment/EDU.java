package hl7.pseudo.segment;

import hl7.bean.datastructure.DataStructure;

public class EDU extends hl7.model.V2_7.segment.EDU{
	public EDU(){
		super();
	}

	public static EDU CLASS;
	static{
		CLASS = new EDU();
	}

	public DataStructure[][] getComponents(){
		return super.getComponents();
	}
}

