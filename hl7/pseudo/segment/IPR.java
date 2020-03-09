package hl7.pseudo.segment;

import hl7.bean.datastructure.DataStructure;

public class IPR extends hl7.model.V2_7.segment.IPR{
	public IPR(){
		super();
	}

	public static IPR CLASS;
	static{
		CLASS = new IPR();
	}

	public DataStructure[][] getComponents(){
		return super.getComponents();
	}
}

