package hl7.pseudo.segment;

import hl7.bean.datastructure.DataStructure;

public class ILT extends hl7.model.V2_7.segment.ILT{
	public ILT(){
		super();
	}

	public static ILT CLASS;
	static{
		CLASS = new ILT();
	}

	public DataStructure[][] getComponents(){
		return super.getComponents();
	}
}

