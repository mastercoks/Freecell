package br.edu.uesb.aed.freecell.model;

import java.util.Random;

/**
 *
 * @author matheus
 */
public class Baralho {

    private Pilha primeiraPilha;
    private Pilha segundaPilha;
    private Pilha terceiraPilha;
    private Pilha quartaPilha;
    private Pilha quintaPilha;
    private Pilha sextaPilha;
    private Pilha setimaPilha;
    private Pilha oitavaPilha;

    private Pilha pilhaBase1;
    private Pilha pilhaBase2;
    private Pilha pilhaBase3;
    private Pilha pilhaBase4;

    private Pilha espaco1;
    private Pilha espaco2;
    private Pilha espaco3;
    private Pilha espaco4;

    public Baralho() {
        this.primeiraPilha = new Pilha();
        this.segundaPilha = new Pilha();
        this.terceiraPilha = new Pilha();
        this.quartaPilha = new Pilha();
        this.quintaPilha = new Pilha();
        this.sextaPilha = new Pilha();
        this.setimaPilha = new Pilha();
        this.oitavaPilha = new Pilha();
        this.pilhaBase1 = new Pilha();
        this.pilhaBase2 = new Pilha();
        this.pilhaBase3 = new Pilha();
        this.pilhaBase4 = new Pilha();
        this.espaco1 = new Pilha(1);
        this.espaco2 = new Pilha(1);
        this.espaco3 = new Pilha(1);
        this.espaco4 = new Pilha(1);
    }

    private static Lista gerarBaralho() {
        Lista baralho = new Lista();
        Object[] carta;

//        Colocando todas as cartas de Paus no baralho
        carta = new Object[]{"Paus", 1};
        baralho.inserir(carta);
        carta = new Object[]{"Paus", 2};
        baralho.inserir(carta);
        carta = new Object[]{"Paus", 3};
        baralho.inserir(carta);
        carta = new Object[]{"Paus", 4};
        baralho.inserir(carta);
        carta = new Object[]{"Paus", 5};
        baralho.inserir(carta);
        carta = new Object[]{"Paus", 6};
        baralho.inserir(carta);
        carta = new Object[]{"Paus", 7};
        baralho.inserir(carta);
        carta = new Object[]{"Paus", 8};
        baralho.inserir(carta);
        carta = new Object[]{"Paus", 9};
        baralho.inserir(carta);
        carta = new Object[]{"Paus", 10};
        baralho.inserir(carta);
        carta = new Object[]{"Paus", 11};
        baralho.inserir(carta);
        carta = new Object[]{"Paus", 12};
        baralho.inserir(carta);
        carta = new Object[]{"Paus", 13};
        baralho.inserir(carta);

//        Colocando todas as cartas de Copas no baralho
        carta = new Object[]{"Copas", 1};
        baralho.inserir(carta);
        carta = new Object[]{"Copas", 2};
        baralho.inserir(carta);
        carta = new Object[]{"Copas", 3};
        baralho.inserir(carta);
        carta = new Object[]{"Copas", 4};
        baralho.inserir(carta);
        carta = new Object[]{"Copas", 5};
        baralho.inserir(carta);
        carta = new Object[]{"Copas", 6};
        baralho.inserir(carta);
        carta = new Object[]{"Copas", 7};
        baralho.inserir(carta);
        carta = new Object[]{"Copas", 8};
        baralho.inserir(carta);
        carta = new Object[]{"Copas", 9};
        baralho.inserir(carta);
        carta = new Object[]{"Copas", 10};
        baralho.inserir(carta);
        carta = new Object[]{"Copas", 11};
        baralho.inserir(carta);
        carta = new Object[]{"Copas", 12};
        baralho.inserir(carta);
        carta = new Object[]{"Copas", 13};
        baralho.inserir(carta);

//        Colocando todas as cartas de Espadas no baralho
        carta = new Object[]{"Espadas", 1};
        baralho.inserir(carta);
        carta = new Object[]{"Espadas", 2};
        baralho.inserir(carta);
        carta = new Object[]{"Espadas", 3};
        baralho.inserir(carta);
        carta = new Object[]{"Espadas", 4};
        baralho.inserir(carta);
        carta = new Object[]{"Espadas", 5};
        baralho.inserir(carta);
        carta = new Object[]{"Espadas", 6};
        baralho.inserir(carta);
        carta = new Object[]{"Espadas", 7};
        baralho.inserir(carta);
        carta = new Object[]{"Espadas", 8};
        baralho.inserir(carta);
        carta = new Object[]{"Espadas", 9};
        baralho.inserir(carta);
        carta = new Object[]{"Espadas", 10};
        baralho.inserir(carta);
        carta = new Object[]{"Espadas", 11};
        baralho.inserir(carta);
        carta = new Object[]{"Espadas", 12};
        baralho.inserir(carta);
        carta = new Object[]{"Espadas", 13};
        baralho.inserir(carta);

//        Colocando todas as cartas de Ouros no baralho
        carta = new Object[]{"Ouros", 1};
        baralho.inserir(carta);
        carta = new Object[]{"Ouros", 2};
        baralho.inserir(carta);
        carta = new Object[]{"Ouros", 3};
        baralho.inserir(carta);
        carta = new Object[]{"Ouros", 4};
        baralho.inserir(carta);
        carta = new Object[]{"Ouros", 5};
        baralho.inserir(carta);
        carta = new Object[]{"Ouros", 6};
        baralho.inserir(carta);
        carta = new Object[]{"Ouros", 7};
        baralho.inserir(carta);
        carta = new Object[]{"Ouros", 8};
        baralho.inserir(carta);
        carta = new Object[]{"Ouros", 9};
        baralho.inserir(carta);
        carta = new Object[]{"Ouros", 10};
        baralho.inserir(carta);
        carta = new Object[]{"Ouros", 11};
        baralho.inserir(carta);
        carta = new Object[]{"Ouros", 12};
        baralho.inserir(carta);
        carta = new Object[]{"Ouros", 13};
        baralho.inserir(carta);
//        'A', '1', '2', '3', '4', '5', '6', '7', '8', '9','J', 'Q', 'K'
        return baralho;
    }

    public void embaralhar() {
        Lista baralho = gerarBaralho();

        Random rand = new Random();

        int tamanho = baralho.size();
        int numeroRand;

        for (int i = 0; i < 7; i++) {
            numeroRand = rand.nextInt(tamanho);
            tamanho--;
            getPrimeiraPilha().push((Object[]) baralho.procurarRemove(numeroRand));
            numeroRand = rand.nextInt(tamanho);
            tamanho--;
            segundaPilha.push((Object[]) baralho.procurarRemove(numeroRand));
            numeroRand = rand.nextInt(tamanho);
            tamanho--;
            terceiraPilha.push((Object[]) baralho.procurarRemove(numeroRand));
            numeroRand = rand.nextInt(tamanho);
            tamanho--;
            quartaPilha.push((Object[]) baralho.procurarRemove(numeroRand));
            if (i < 6 || tamanho != 0) {
                numeroRand = rand.nextInt(tamanho);
                tamanho--;
                quintaPilha.push((Object[]) baralho.procurarRemove(numeroRand));
                numeroRand = rand.nextInt(tamanho);
                tamanho--;
                sextaPilha.push((Object[]) baralho.procurarRemove(numeroRand));
                numeroRand = rand.nextInt(tamanho);
                tamanho--;
                setimaPilha.push((Object[]) baralho.procurarRemove(numeroRand));
                numeroRand = rand.nextInt(tamanho);
                tamanho--;
                oitavaPilha.push((Object[]) baralho.procurarRemove(numeroRand));
            }
        }

    }

    public Pilha getPrimeiraPilha() {
        return primeiraPilha;
    }

    public Pilha getSegundaPilha() {
        return segundaPilha;
    }

    public Pilha getTerceiraPilha() {
        return terceiraPilha;
    }

    public Pilha getQuartaPilha() {
        return quartaPilha;
    }

    public Pilha getQuintaPilha() {
        return quintaPilha;
    }

    public Pilha getSextaPilha() {
        return sextaPilha;
    }

    public Pilha getSetimaPilha() {
        return setimaPilha;
    }

    public Pilha getOitavaPilha() {
        return oitavaPilha;
    }

    public static void main(String[] args) {
        Baralho b = new Baralho();
        b.embaralhar();

        System.out.print("Primeira Pilha \t-> ");
        b.getPrimeiraPilha().imprime();

        System.out.print("Segunda Pilha \t-> ");
        b.getSegundaPilha().imprime();

        System.out.print("Terceira Pilha \t-> ");
        b.getTerceiraPilha().imprime();

        System.out.print("Quarta Pilha \t-> ");
        b.getQuartaPilha().imprime();

        System.out.print("Quinta Pilha \t-> ");
        b.getQuintaPilha().imprime();

        System.out.print("Sexta Pilha \t-> ");
        b.getSextaPilha().imprime();

        System.out.print("Setima Pilha \t-> ");
        b.getSetimaPilha().imprime();

        System.out.print("Oitava Pilha \t-> ");
        b.getOitavaPilha().imprime();
        b.getPilhaBase1().inserirPilhaBase(b.getPrimeiraPilha());
        b.getPilhaBase1().inserirPilhaBase(b.getSegundaPilha());
        b.getPilhaBase1().inserirPilhaBase(b.getTerceiraPilha());
        b.getPilhaBase1().inserirPilhaBase(b.getQuartaPilha());
        b.getPilhaBase1().inserirPilhaBase(b.getQuintaPilha());
        b.getPilhaBase1().inserirPilhaBase(b.getSextaPilha());
        b.getPilhaBase1().inserirPilhaBase(b.getSetimaPilha());
        b.getPilhaBase1().inserirPilhaBase(b.getOitavaPilha());
//        b.pilhaBase2.inserirPilhaBase(b.getSetimaPilha().top());
//        b.pilhaBase3.inserirPilhaBase(b.getPrimeiraPilha().top());
//        b.pilhaBase4.inserirPilhaBase(b.getPrimeiraPilha().top());
        b.getPrimeiraPilha().mudarDePilha(b.getSegundaPilha());
        b.getPrimeiraPilha().mudarDePilha(b.getTerceiraPilha());
        b.getPrimeiraPilha().mudarDePilha(b.getQuartaPilha());
        b.getPrimeiraPilha().mudarDePilha(b.getQuintaPilha());
        b.getPrimeiraPilha().mudarDePilha(b.getSextaPilha());
        b.getPrimeiraPilha().mudarDePilha(b.getSetimaPilha());
        b.getPrimeiraPilha().mudarDePilha(b.getOitavaPilha());
        b.getSegundaPilha().mudarDePilha(b.getTerceiraPilha());
        b.getQuartaPilha().mudarDePilha(b.getTerceiraPilha());
        System.out.print("Primeira Pilha \t-> ");
        b.getPrimeiraPilha().imprime();

        System.out.print("Segunda Pilha \t-> ");
        b.getSegundaPilha().imprime();

        System.out.print("Terceira Pilha \t-> ");
        b.getTerceiraPilha().imprime();

        System.out.print("Quarta Pilha \t-> ");
        b.getQuartaPilha().imprime();

        System.out.print("Quinta Pilha \t-> ");
        b.getQuintaPilha().imprime();

        System.out.print("Sexta Pilha \t-> ");
        b.getSextaPilha().imprime();

        System.out.print("Setima Pilha \t-> ");
        b.getSetimaPilha().imprime();

        System.out.print("Oitava Pilha \t-> ");
        b.getOitavaPilha().imprime();
    }

    public Pilha getPilhaBase1() {
        return pilhaBase1;
    }

    public Pilha getPilhaBase2() {
        return pilhaBase2;
    }

    public Pilha getPilhaBase3() {
        return pilhaBase3;
    }

    public Pilha getPilhaBase4() {
        return pilhaBase4;
    }
    
    public Pilha getEspaco1() {
        return espaco1;
    }

    public Pilha getEspaco2() {
        return espaco2;
    }

    public Pilha getEspaco3() {
        return espaco3;
    }

    public Pilha getEspaco4() {
        return espaco4;
    }
}
