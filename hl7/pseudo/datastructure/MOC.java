package hl7.pseudo.datastructure;

import hl7.bean.datastructure.DataStructure;

public class MOC extends hl7.model.V2_7.datastructure.MOC{
	public MOC(){
		super();
	}
	
	public static MOC CLASS;
	static{
		CLASS = new MOC();
	}

	public DataStructure[] getComponents(){
		return super.getComponents();
	}
}
