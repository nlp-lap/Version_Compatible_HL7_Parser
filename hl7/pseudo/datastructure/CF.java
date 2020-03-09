package hl7.pseudo.datastructure;

import hl7.bean.datastructure.DataStructure;

public class CF extends hl7.model.V2_7.datastructure.CF{
	public CF(){
		super();
	}
	
	public static CF CLASS;
	static{
		CLASS = new CF();
	}

	public DataStructure[] getComponents(){
		return super.getComponents();
	}
}
