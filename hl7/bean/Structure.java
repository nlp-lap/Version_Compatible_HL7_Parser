package hl7.bean;

import java.io.Serializable;

public interface Structure extends Serializable {
	public String encode() throws Exception;
	public void setVersion(String setVersion);
	public void originalVersion(String originalVersion);
	public String getType();
}
