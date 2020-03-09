package hl7.pseudo.datastructure;

import hl7.bean.datastructure.DataStructure;

public class NR extends hl7.model.V2_7.datastructure.NR{
	public NR(){
		super();
	}
	
	public static NR CLASS;
	static{
		CLASS = new NR();
	}

	public DataStructure[] getComponents(){
		return super.getComponents();
	}
}
