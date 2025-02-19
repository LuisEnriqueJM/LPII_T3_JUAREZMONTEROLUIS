package com.bd.medico.modelo;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;



@Entity
@Table(name="tbl_medico")
public class TBL_MEDICO {
	
	
	//atributos
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int IDMEDICOT3;
	private String NOMBRET3;
	private String APELLIDOT3;
	private String EMAILT3;
	private String DNIT3;
	private String ESTADOCIVILT3;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(iso=ISO.DATE)	
	private Date FECHANACIMT3;
	
	
	//constructor
	public TBL_MEDICO(int iDMEDICOT3, String nOMBRET3, String aPELLIDOT3, String eMAILT3, String dNIT3,
			String eSTADOCIVILT3, Date fECHANACIMT3) {
		//super();
		IDMEDICOT3 = iDMEDICOT3;
		NOMBRET3 = nOMBRET3;
		APELLIDOT3 = aPELLIDOT3;
		EMAILT3 = eMAILT3;
		DNIT3 = dNIT3;
		ESTADOCIVILT3 = eSTADOCIVILT3;
		FECHANACIMT3 = fECHANACIMT3;
	}

	public TBL_MEDICO() {
		//super();
	}

	
	
	//getter and setter
	public int getIDMEDICOT3() {
		return IDMEDICOT3;
	}

	public void setIDMEDICOT3(int iDMEDICOT3) {
		IDMEDICOT3 = iDMEDICOT3;
	}

	public String getNOMBRET3() {
		return NOMBRET3;
	}

	public void setNOMBRET3(String nOMBRET3) {
		NOMBRET3 = nOMBRET3;
	}

	public String getAPELLIDOT3() {
		return APELLIDOT3;
	}

	public void setAPELLIDOT3(String aPELLIDOT3) {
		APELLIDOT3 = aPELLIDOT3;
	}

	public String getEMAILT3() {
		return EMAILT3;
	}

	public void setEMAILT3(String eMAILT3) {
		EMAILT3 = eMAILT3;
	}

	public String getDNIT3() {
		return DNIT3;
	}

	public void setDNIT3(String dNIT3) {
		DNIT3 = dNIT3;
	}

	public String getESTADOCIVILT3() {
		return ESTADOCIVILT3;
	}

	public void setESTADOCIVILT3(String eSTADOCIVILT3) {
		ESTADOCIVILT3 = eSTADOCIVILT3;
	}

	public Date getFECHANACIMT3() {
		return FECHANACIMT3;
	}

	public void setFECHANACIMT3(Date fECHANACIMT3) {
		FECHANACIMT3 = fECHANACIMT3;
	}
	
}

