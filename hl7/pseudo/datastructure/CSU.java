package hl7.pseudo.datastructure;

import hl7.bean.datastructure.DataStructure;

public class CSU extends hl7.model.V2_7.datastructure.CSU{
	public CSU(){
		super();
	}
	
	public static CSU CLASS;
	static{
		CLASS = new CSU();
	}

	public DataStructure[] getComponents(){
		return super.getComponents();
	}
}
