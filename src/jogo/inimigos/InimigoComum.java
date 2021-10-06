package jogo.inimigos;

import jogo.classes.Jogador;
import jogo.classes.Personagem;
import jogo.controller.Acoes;

public class InimigoComum extends Personagem implements Acoes {

	public InimigoComum(String nome) {
		super(nome);
		this.setAtk(getAtk() + 3);
		this.setVida(getVida() + 10);
	}

	@Override
	public void atacar(Personagem e) {
		if (e.isDefensivo()) {
			e.setVida(e.getVida() - (this.getAtk() - e.getDef() * 2));
		} else {
			e.setVida(e.getVida() - (this.getAtk() - e.getDef()));
		}

	}

	@Override
	public boolean fugir() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void defender() {
		// TODO Auto-generated method stub

	}

	@Override
	public int verVida() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void status() {
		// TODO Auto-generated method stub

	}

}
