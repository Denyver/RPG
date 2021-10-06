package jogo.controller;

import jogo.classes.Jogador;
import jogo.classes.Personagem;

public interface Acoes {

	public void atacar(Personagem e);
	
	public boolean fugir();
	
	public void defender();
	
	public int verVida();
	
	public void status();
	
	
}
