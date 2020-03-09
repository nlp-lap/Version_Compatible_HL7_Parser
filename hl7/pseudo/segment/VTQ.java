package hl7.pseudo.segment;

import hl7.bean.datastructure.DataStructure;

public class VTQ extends hl7.model.V2_51.segment.VTQ{
	public VTQ(){
		super();
	}

	public static VTQ CLASS;
	static{
		CLASS = new VTQ();
	}

	public DataStructure[][] getComponents(){
		return super.getComponents();
	}
}

