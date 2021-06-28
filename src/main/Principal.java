package main;

import controller.Controller;
import model.Modelo;
import view.Visao;

public class Principal {
	
	
	public static void main(String[] args) {
		
		Visao visao = new Visao();
		Modelo modelo = new Modelo();
		Controller controller = new Controller(visao, modelo);
		visao.setVisible(true);
		
		
	}

}
