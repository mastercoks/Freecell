/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.uesb.aed.freecell.model;

/**
 *
 * @author matheus
 */
public class Pilha {
//    private char carta;

    private int topo;
    private Object[] baralho;

    public Pilha() {
        baralho = new Object[13];
        topo = -1;
    }

    public boolean isEmpty() {
        return (topo == 0);
    }

    public boolean isFull() {
        return (topo == baralho.length);
    }

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

    public Object pop() {
        Object x = baralho[topo];
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

    public void inserirPilhaBase(Object[] carta) {
        if (top() == null) {
            if ((Integer) carta[1] == 1) {
                push(carta);
                System.out.println("Você inseriu uma carta");
            } else {
                System.err.println("Error");
            }
        } else {
            if (top()[0].toString().equals(carta[0].toString())
                    && ((Integer) top()[1] + 1) == (Integer) carta[1]) {
                push(carta);
                System.out.println("Você inseriu uma carta");
            } else {
                System.err.println("Error");
            }
        }

    }

    public boolean corInversa(String naipeCarta, String naipeTopo) {
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

    public void imprime() {
//        for (Object baralho1 : baralho) {
//        if (baralho1 == null) {
//                break;
//            }
//            System.out.println(baralho1);
//        }
        for (int i = 0; i < baralho.length; i++) {
            if (baralho[i] == null) {
                break;
            }
            System.out.print(getCarta(i)[0] + " " + getCarta(i)[1] + " -\t ");
        }
        System.out.println();
    }
}
