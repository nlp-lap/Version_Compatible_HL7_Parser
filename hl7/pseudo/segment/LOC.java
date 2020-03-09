package hl7.pseudo.segment;

import hl7.bean.datastructure.DataStructure;

public class LOC extends hl7.model.V2_7.segment.LOC{
	public LOC(){
		super();
	}

	public static LOC CLASS;
	static{
		CLASS = new LOC();
	}

	public DataStructure[][] getComponents(){
		return super.getComponents();
	}
}

