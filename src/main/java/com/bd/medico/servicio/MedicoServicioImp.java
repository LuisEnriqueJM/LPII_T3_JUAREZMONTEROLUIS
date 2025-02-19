package com.bd.medico.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bd.medico.modelo.TBL_MEDICO;
import com.bd.medico.repositorio.IMedicoRepositorio;


@Service
public class MedicoServicioImp implements IMedicoServicio {

	//aplicamos inyeccion de dependencias  
	@Autowired
	private IMedicoRepositorio imedicorepositorio;
	
	
	@Override
	public void RegistrarMedico(TBL_MEDICO tbl_medico) {
		imedicorepositorio.save(tbl_medico);
	}// fin de RegistrarMedico

	
	@Override
	public void EliminarMedico(TBL_MEDICO tbl_medico) {
		imedicorepositorio.deleteById(tbl_medico.getIDMEDICOT3());
		
	}//fin de EliminarMedico

	
	@Override
	public List<TBL_MEDICO> ListadoMedicos() {
		return (List<TBL_MEDICO>)imedicorepositorio.findAll();
	}//fin de ListadoMedicos

	
	@Override
	public TBL_MEDICO buscarporId(Integer id) {
		return imedicorepositorio.findById(id).orElse(null) ;
	}//fin de buscarporId

}

