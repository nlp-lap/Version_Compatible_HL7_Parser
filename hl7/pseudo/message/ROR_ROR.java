package hl7.pseudo.message;

import hl7.bean.Structure;

public class ROR_ROR extends hl7.model.V2_6.message.ROR_ROR{
	public ROR_ROR(){
		super();
	}

	public static ROR_ROR CLASS;
	static{
		CLASS = new ROR_ROR();
	}

	public Structure[][] getComponents(){
		return super.getComponents();
	}

}

