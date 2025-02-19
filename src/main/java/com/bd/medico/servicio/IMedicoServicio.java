package com.bd.medico.servicio;

import java.util.List;
import com.bd.medico.modelo.TBL_MEDICO;

public interface IMedicoServicio {
	//declaramos los metodos
	void RegistrarMedico(TBL_MEDICO tbl_medico);
	void EliminarMedico(TBL_MEDICO tbl_medico);
	List<TBL_MEDICO>ListadoMedicos();
	TBL_MEDICO buscarporId(Integer id);
}

