package com.bd.medico.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bd.medico.modelo.TBL_MEDICO;
import com.bd.medico.servicio.IMedicoServicio;

@Controller
@RequestMapping("/Vistas")
public class MedicoController {

	//aplicamos inyeccion de dependencias
	@Autowired
	private IMedicoServicio imedicoservicio;
	
	
	
	//LISTADO DE MEDICOS
	@GetMapping("/ListadoMedicos")
	public String listarMedicos(Model modelo) {
		//recuperamos los datos de la BD
		List<TBL_MEDICO> listado = imedicoservicio.ListadoMedicos();
		
		//enviamos a la vista
		modelo.addAttribute("listado", listado);
		
		//retornamos
		return "/Vistas/ListadoMedicos";
	}
	
	
	//REGISTRAR DATOS
	@GetMapping("/RegistrarMedico")
	public String RegistrarMedico(Model modelo) {
		TBL_MEDICO tblmed = new TBL_MEDICO();
		modelo.addAttribute("regmedico", tblmed);
		return "/Vistas/FrmRegMedico";
	}
	
	
	//GUARDAR DATOS | MAPEO CON POSTMAPPING
	@PostMapping("/GuardarMedico")
	public String GuardarMedico(@ModelAttribute TBL_MEDICO tblmed, Model modelo) {
		imedicoservicio.RegistrarMedico(tblmed);
		System.out.println("dato registrado en la BD...");
		return "redirect:/Vistas/ListadoMedicos";
	}
	

	/* ******************* EDITAR ******************* */
	@GetMapping("/editarmedico/{id}")
	public String Editar(@PathVariable("id") Integer idmedico, Model modelo) {
		TBL_MEDICO edimedico = imedicoservicio.buscarporId(idmedico);
		modelo.addAttribute("regmedico",edimedico);
		return "/Vistas/FrmRegMedico";
	}
	
	
	/* ******************* ELIMINAR ******************* */
	@GetMapping("/eliminarmedico/{id}")
	public String Eliminar(@PathVariable("id") Integer idmedico, Model modelo) {
		TBL_MEDICO tblmed = new TBL_MEDICO();
		tblmed.setIDMEDICOT3(idmedico);
		//aplicamos inyeccion de dependencias
		imedicoservicio.EliminarMedico(tblmed);
		List<TBL_MEDICO> listado = imedicoservicio.ListadoMedicos();
		//enviamos a la vista
		modelo.addAttribute("listado", listado);
		return "redirect:/Vistas/ListadoMedicos";
	}	
	
	
}




