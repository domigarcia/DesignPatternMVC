package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.Modelo;
import view.Visao;

public class Controller {
	
	private Visao visao;
	private Modelo modelo;
	
	
	public Controller(Visao visao, Modelo modelo ) {
		this.modelo = modelo;
		this.visao = visao;
		this.visao.adicionarListener(new Listener());
		
	}
	
	
class Listener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		int numero1,numero2 = 0;
		try {
			numero1= visao.getPrimeiroNumero();
			numero2= visao.getSegundoNumero();
			modelo.somaNumeros(numero1, numero2);
			visao.setResultado(modelo.getValor());
		} catch (Exception e) {
			// TODO: handle exception
			visao.mesagemErro("Digite apenas Número");
		}
		
	}
	
	
}	

}
