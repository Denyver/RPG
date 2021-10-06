package jogo.personagens;

import java.util.Random;

import jogo.classes.Jogador;
import jogo.classes.Personagem;
import jogo.controller.Acoes;

public class Denyver extends Jogador implements Acoes {

		
	public Denyver() {
		super("Denyver");
		this.setVida(this.getVida()+25);
		this.setAtk(this.getAtk()+5);
	}
	
	
	public Denyver(String nome) {
		super(nome);
		// TODO Auto-generated constructor stub
	}


	//Metodos da Interface
	@Override
	public void atacar(Personagem e) {
		// TODO Auto-generated method stub
		if(e.isDefensivo()) {
			e.setVida(e.getVida()-(this.getAtk()-e.getDef()*2));
		}else {
			e.setVida(e.getVida()-(this.getAtk()-e.getDef()));
		}
	}

	@Override
	public boolean fugir() {
		// TODO Auto-generated method stub
		Random r = new Random();
		int result = r.nextInt(100)+1;
		if(result<=this.getSpeed()) {
			return true;
		}else {
			return false;
		}
		
	}

	@Override
	public void defender() {
		if(this.isDefensivo()) {
			this.setDefensivo(false);
		}else {
			this.setDefensivo(true);
		}
	}

	@Override
	public int verVida() {
		// TODO Auto-generated method stub
		return this.getVida();
	}

	@Override
	public void status() {
		// TODO Auto-generated method stub
		
	}

	

}
