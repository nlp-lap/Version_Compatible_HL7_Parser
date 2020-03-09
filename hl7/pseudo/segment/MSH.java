package hl7.pseudo.segment;

import hl7.bean.datastructure.DataStructure;

public class MSH extends hl7.model.V2_7.segment.MSH{
	public MSH(){
		super();
	}

	public static MSH CLASS;
	static{
		CLASS = new MSH();
	}

	public DataStructure[][] getComponents(){
		return super.getComponents();
	}
}

