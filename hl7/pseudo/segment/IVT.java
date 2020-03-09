package hl7.pseudo.segment;

import hl7.bean.datastructure.DataStructure;

public class IVT extends hl7.model.V2_7.segment.IVT{
	public IVT(){
		super();
	}

	public static IVT CLASS;
	static{
		CLASS = new IVT();
	}

	public DataStructure[][] getComponents(){
		return super.getComponents();
	}
}

