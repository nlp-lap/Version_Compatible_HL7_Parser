package hl7.pseudo.segment;

import hl7.bean.datastructure.DataStructure;

public class DSC extends hl7.model.V2_7.segment.DSC{
	public DSC(){
		super();
	}

	public static DSC CLASS;
	static{
		CLASS = new DSC();
	}

	public DataStructure[][] getComponents(){
		return super.getComponents();
	}
}

