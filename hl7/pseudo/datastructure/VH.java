package hl7.pseudo.datastructure;

import hl7.bean.datastructure.DataStructure;

public class VH extends hl7.model.V2_7.datastructure.VH{
	public VH(){
		super();
	}
	
	public static VH CLASS;
	static{
		CLASS = new VH();
	}

	public DataStructure[] getComponents(){
		return super.getComponents();
	}
}
