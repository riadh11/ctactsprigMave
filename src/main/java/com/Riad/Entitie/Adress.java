package com.Riad.Entitie;

public class Adress {
	private String nomResidence;
	private String nomRue;
	private String quartier;
	private int codePostal;
	private String province;
	
	public String getNomResidence() {
		return nomResidence;
	}
	public void setNomResidence(String nomResidence) {
		this.nomResidence = nomResidence;
	}
	public String getNomRue() {
		return nomRue;
	}
	public void setNomRue(String nomRue) {
		this.nomRue = nomRue;
	}
	public String getQuartier() {
		return quartier;
	}
	public void setQuartier(String quartier) {
		this.quartier = quartier;
	}
	public int getCodePostal() {
		return codePostal;
	}
	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public Adress(String nomResidence, String nomRue, String quartier, int codePostal, String province) {
		super();
		this.nomResidence = nomResidence;
		this.nomRue = nomRue;
		this.quartier = quartier;
		this.codePostal = codePostal;
		this.province = province;
	}
	@Override
	public String toString() {
		return "Adress [nomResidence=" + nomResidence + ", nomRue=" + nomRue + ", quartier=" + quartier
				+ ", codePostal=" + codePostal + ", province=" + province + "]";
	}
	
	
}


