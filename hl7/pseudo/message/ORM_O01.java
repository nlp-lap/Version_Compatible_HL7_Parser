package hl7.pseudo.message;

import hl7.bean.Structure;

public class ORM_O01 extends hl7.model.V2_6.message.ORM_O01{
	public ORM_O01(){
		super();
	}

	public static ORM_O01 CLASS;
	static{
		CLASS = new ORM_O01();
	}

	public Structure[][] getComponents(){
		return super.getComponents();
	}

}

