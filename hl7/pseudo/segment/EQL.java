package hl7.pseudo.segment;

import hl7.bean.datastructure.DataStructure;

public class EQL extends hl7.model.V2_51.segment.EQL{
	public EQL(){
		super();
	}

	public static EQL CLASS;
	static{
		CLASS = new EQL();
	}

	public DataStructure[][] getComponents(){
		return super.getComponents();
	}
}

