package hl7.pseudo.datastructure;

import hl7.bean.datastructure.DataStructure;

public class MOP extends hl7.model.V2_7.datastructure.MOP{
	public MOP(){
		super();
	}
	
	public static MOP CLASS;
	static{
		CLASS = new MOP();
	}

	public DataStructure[] getComponents(){
		return super.getComponents();
	}
}
