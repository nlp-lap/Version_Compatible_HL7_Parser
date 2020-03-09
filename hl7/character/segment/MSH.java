package hl7.character.segment;

import hl7.bean.datastructure.DataStructure;

public abstract class MSH extends hl7.bean.segment.Segment{
	protected void setCharacter(DataStructure[][] components, String version){
		setCurrentVersion(components, version);
	}
	
	private void setCurrentVersion(DataStructure[][] components, String version){
//System.out.println(version);		
		DataStructure[] component = components[11];
		try{
			component[0].decode(version);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
