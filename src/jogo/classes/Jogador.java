package jogo.classes;

import java.util.Random;

import jogo.controller.Acoes;

public class Jogador extends Personagem implements Acoes {

	private int nivel;
	private int exp;

	public Jogador(String nome) {
		super(nome);
		this.nivel = 1;
		this.exp = 0;
		this.setVidaAtual(this.getVida());
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	public void levelUp(int vida, int atk, int def, int acerto, int speed) {

		this.nivel = this.getNivel() + 1;
		this.setVida(this.getVida() + vida);
		this.setAtk(this.getAtk() + atk);
		this.setDef(this.getDef() + def);
		this.setAcerto(this.getAcerto() + acerto);
		this.setSpeed(this.getSpeed() + speed);

	}

	@Override
	public void atacar(Personagem e) {
		if (e.isDefensivo()) {
			e.setVidaAtual(e.getVidaAtual() - (this.getAtk() - e.getDef() * 2));
		} else {
			e.setVidaAtual(e.getVidaAtual() - (this.getAtk() - e.getDef()));
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
		// TODO Auto-generated method stub
		if(this.isDefensivo()) {
			this.setDefensivo(false);
		}else {
			this.setDefensivo(true);
		}

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
	
	@Override
	public String toString() {
		return this.getNome();
	}

}
