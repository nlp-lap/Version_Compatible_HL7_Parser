package hl7.pseudo.datastructure;

import hl7.bean.datastructure.DataStructure;

public class DR extends hl7.model.V2_7.datastructure.DR{
	public DR(){
		super();
	}
	
	public static DR CLASS;
	static{
		CLASS = new DR();
	}

	public DataStructure[] getComponents(){
		return super.getComponents();
	}
}
