package jogo.classes;

public class Personagem {

	private int vida;
	private int atk;
	private int def;
	private int crit;
	private boolean alive;
	private int acerto;
	private int speed;
	private String nome;
	private boolean defensivo;
	private int vidaAtual;
	
	public Personagem(String nome) {
		this.nome = nome;
		this.vida = 100;
		this.atk = 10;
		this.def = 5;
		this.crit = 1;
		this.acerto = 50;
		this.speed = 30;
		this.alive = true;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public int getAtk() {
		return atk;
	}

	public void setAtk(int atk) {
		this.atk = atk;
	}

	public int getDef() {
		return def;
	}

	public void setDef(int def) {
		this.def = def;
	}

	public int getCrit() {
		return crit;
	}

	public void setCrit(int crit) {
		this.crit = crit;
	}

	public boolean isAlive() {
		return alive;
	}

	public void setAlive(boolean alive) {
		this.alive = alive;
	}

	public int getAcerto() {
		return acerto;
	}

	public void setAcerto(int acerto) {
		this.acerto = acerto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public boolean isDefensivo() {
		return defensivo;
	}

	public void setDefensivo(boolean defensivo) {
		this.defensivo = defensivo;
	}

	public int getVidaAtual() {
		return vidaAtual;
	}

	public void setVidaAtual(int vidaAtaul) {
		this.vidaAtual = vidaAtaul;
	}
	
	
	
	
	
	
	
}
