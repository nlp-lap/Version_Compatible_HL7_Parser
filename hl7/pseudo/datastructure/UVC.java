package hl7.pseudo.datastructure;

import hl7.bean.datastructure.DataStructure;

public class UVC extends hl7.model.V2_7.datastructure.UVC{
	public UVC(){
		super();
	}
	
	public static UVC CLASS;
	static{
		CLASS = new UVC();
	}

	public DataStructure[] getComponents(){
		return super.getComponents();
	}
}
