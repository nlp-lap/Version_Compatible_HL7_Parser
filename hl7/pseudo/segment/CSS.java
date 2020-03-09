package hl7.pseudo.segment;

import hl7.bean.datastructure.DataStructure;

public class CSS extends hl7.model.V2_7.segment.CSS{
	public CSS(){
		super();
	}

	public static CSS CLASS;
	static{
		CLASS = new CSS();
	}

	public DataStructure[][] getComponents(){
		return super.getComponents();
	}
}

