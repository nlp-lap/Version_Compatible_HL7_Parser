package hl7.pseudo.message;

import hl7.bean.Structure;

public class ACK extends hl7.model.V2_7.message.ACK{
	public ACK(){
		super();
	}

	public static ACK CLASS;
	static{
		CLASS = new ACK();
	}

	public Structure[][] getComponents(){
		return super.getComponents();
	}

}

