package hl7.pseudo.segment;

import hl7.bean.datastructure.DataStructure;

public class DB1 extends hl7.model.V2_7.segment.DB1{
	public DB1(){
		super();
	}

	public static DB1 CLASS;
	static{
		CLASS = new DB1();
	}

	public DataStructure[][] getComponents(){
		return super.getComponents();
	}
}

