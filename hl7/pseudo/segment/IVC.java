package hl7.pseudo.segment;

import hl7.bean.datastructure.DataStructure;

public class IVC extends hl7.model.V2_7.segment.IVC{
	public IVC(){
		super();
	}

	public static IVC CLASS;
	static{
		CLASS = new IVC();
	}

	public DataStructure[][] getComponents(){
		return super.getComponents();
	}
}

