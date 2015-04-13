/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.uesb.aed.freecell.model;

import javax.swing.JOptionPane;

/**
 *
 * @author matheus
 */
public class Pilha {
//    private char carta;

    private int topo;
    private Object[] baralho;

//    Construtor sem setar o tamanho
    public Pilha() {
        baralho = new Object[25];
        topo = -1;
    }
    
//    Construtor setando o tamanho
    public Pilha(int tamanho) {
        baralho = new Object[tamanho];
        topo = -1;
    }

    public boolean isEmpty() {
        return (topo == -1);
    }

    public boolean isFull() {
        return (topo == baralho.length);
    }

//    retorna a carta (sem remover) da posição x
    public Object[] getCarta(int i) {
        Object[] carta;
        if (baralho[i] == null) {
            return null;
        }
        carta = (Object[]) baralho[i];

        return carta;
    }

    
    public void push(Object[] carta) {
        if (!isFull()) {
            topo++;
            baralho[topo] = carta;
        } else {
            System.err.println("Pilha Cheia!");
        }
    }

    public Object[] pop() {
        Object x[] = (Object[]) baralho[topo];
        baralho[topo] = null;
        topo--;
        return x;
    }

    public Object[] top() {
        if (topo == -1) {
            return null;
        } else {
            return (Object[]) baralho[topo];
        }
    }

    public int size() {
        return topo + 1;
    }
    
//    Metodo para inserir no espaço livre (recebe uma pilha)
    public void inserirEspaco(Pilha pilha) {
        Object[] carta = pilha.top();
        if (isEmpty()) {
            push(carta);
            pilha.pop();
        } else {
            System.err.println("Error");
        }
    }
    
//    Metodo para inserir no espaço livre (recebe uma espaço)
public void inserirEspacoPilha(Pilha espaco) {
        if (espaco.isEmpty()) {
            espaco.push(pop());
        } else {
            System.err.println("Error");
        }
    }
       
//    Metodo para inserir uma carta na pilha base
    public void inserirPilhaBase(Pilha pilha) {
        Object[] carta = pilha.top();
        if (top() == null) {
            if ((Integer) carta[1] == 1) {
                push(carta);
                pilha.pop();
            } else {
                System.out.println("Error");
            }
        } else {
            if (top()[0].toString().equals(carta[0].toString())
                    && ((Integer) top()[1] + 1) == (Integer) carta[1]) {
                push(carta);
                pilha.pop();
            } else {
                System.out.println("Error");
            }
        }

    }

//    Metodo para analizar se a cor do naipe das duas cartas são inversos
    private boolean corInversa(String naipeCarta, String naipeTopo) {
        if ("Ouros".equals(naipeCarta) || "Copas".equals(naipeCarta)) {
            if ("Espadas".equals(naipeTopo) || "Paus".equals(naipeTopo)) {
                return true;
            }
        } else {
            if ("Ouros".equals(naipeTopo) || "Copas".equals(naipeTopo)) {
                return true;
            }
        }
        return false;
    }

//    Metodo para mudar uma carta de pilha
    public void mudarDePilha(Pilha nova) {
        Object[] carta = top();
        Object[] cartaTopo = nova.top();
        if (nova.isEmpty()) {
            nova.push(pop());
        } else if (corInversa(carta[0].toString(), cartaTopo[0].toString())) {
            if (((Integer) carta[1] + 1) == (Integer) cartaTopo[1]) {
                nova.push(pop());
            } else {
                System.out.println("Error");
            }
        } else {
            System.out.println("Error");
        }
    }

//    Metodo para retornar a carta do topo
    public String getTopo() {
        if (topo > -1) {
            return getCarta(topo)[0] + " " + getCarta(topo)[1];
        } else {
            return null;
        }

    }

//    Metodo para retornar todas as cartas
    public String getCartas() {
        String cartas = null;
        for (int i = 0; i < baralho.length; i++) {
            if (baralho[i] == null) {
                break;
            }
            if (cartas == null) {
                cartas = getCarta(i)[0] + " " + getCarta(i)[1] + "\n";
            } else {
                cartas += (getCarta(i)[0] + " " + getCarta(i)[1] + "\n");
            }
        }
        return cartas;
    }

//    Metodo para imprimir todas as cartas
    public void imprime() {
        for (int i = 0; i < baralho.length; i++) {
            if (baralho[i] == null) {
                break;
            }
            System.out.print(getCarta(i)[0] + " " + getCarta(i)[1] + " -\t ");
        }
        System.out.println();
    }
}
