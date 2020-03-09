package hl7.pseudo.datastructure;

import hl7.bean.datastructure.DataStructure;

public class RMC extends hl7.model.V2_7.datastructure.RMC{
	public RMC(){
		super();
	}
	
	public static RMC CLASS;
	static{
		CLASS = new RMC();
	}

	public DataStructure[] getComponents(){
		return super.getComponents();
	}
}
