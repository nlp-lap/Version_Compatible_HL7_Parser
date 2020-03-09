package hl7.pseudo.datastructure;

import hl7.bean.datastructure.DataStructure;

public class AUI extends hl7.model.V2_7.datastructure.AUI{
	public AUI(){
		super();
	}
	
	public static AUI CLASS;
	static{
		CLASS = new AUI();
	}

	public DataStructure[] getComponents(){
		return super.getComponents();
	}
}
