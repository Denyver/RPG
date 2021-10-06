package jogo.app;

import java.util.Random;
import java.util.Scanner;

import jogo.classes.Jogador;
import jogo.classes.Personagem;
import jogo.personagens.Denyver;

public class AppJogo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int op;
		Scanner in = new Scanner(System.in);

		Jogador p, e;
		p = new Jogador("Deny");
		e = new Jogador("Zem");

		System.out.println("A aventura comecou!");
		System.out.println("Escolha um caminho.\n" + "1.Rua Coca-Cola\n" + "2. Rua Beija-Flor\n");
		op = in.nextInt();
		while (op != 1 && op != 2) {
			System.out.println("Escolha um caminho válido.");
			System.out.println("Escolha um caminho.\n" + "1.Rua Coca-Cola\n" + "2. Rua Beija-Flor\n");
		}
		if (op == 1) {
			System.out.println("Um inimigo apareceu! BATALHAAAAAA!");
			batalha(p, e);
		} else {
			System.out.println("Você chegou a seu destino! End Game!");
		}

	}

	public static void batalha(Jogador a, Jogador b) {
		int op;
		Scanner in = new Scanner(System.in);
		do {
			System.out.println(a.getNome()+" - Vida:"+a.getVidaAtual()+"/"+a.getVida()+" | "+b.getNome()+" - Vida:"+b.getVidaAtual()+"/"+b.getVida());
			System.out.println(a.getNome() + " é o seu turno. Escolha sua ação:\n");
			textoAcao();
			op = in.nextInt();
			switch (op) {
			case 1:
				if (hit(a)) {
					a.atacar(b);
				} else {
					System.out.println("Errou o ataque!");
				}
				break;
			case 2:
				a.defender();
				System.out.println("Estou defendendo!");
				break;
			case 3:
				if (a.fugir()) {
					System.out.println("Você fugiu!");
				} else {
					System.out.println("Você não foi rapido o suficiente!");
				}
			default:
				System.out.println("Não entendi. Escolha uma opção valida.");
				textoAcao();
				op = in.nextInt();
				break;
			}
			if (dead(b)) {
				System.out.println("Você derrotou o" + b.getNome() + "!");
				return;
			}

			if (b.getVidaAtual() <= b.getVida() * 0.1) {
				if (b.fugir()) {
					System.out.println(b.getNome() + " fugiu!");
					return;
				}

			}
			if (hit(b)) {
				b.atacar(a);
				System.out.println(b.getNome() + " deferiu um golpe contre você!");
			} else {
				System.out.println(b.getNome() + " errou o ataque!");
			}

		} while (a.getVidaAtual() > 0 && b.getVidaAtual() > 0);
	}

	public static void textoAcao() {
		System.out.println("1. Atacar\n" + "2. Defender\n" + "3. Fugir\n");
	}

	public static boolean hit(Personagem p) {
		Random r = new Random();
		int valor = r.nextInt();
		if (valor <= p.getAcerto()) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean dead(Personagem p) {
		if (p.getVidaAtual() <= 0) {
			return true;
		}
		return false;
	}

}
