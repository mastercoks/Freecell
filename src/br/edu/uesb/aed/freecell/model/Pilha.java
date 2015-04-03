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

    public void inserirPilhaBase(Pilha pilha) {
        Object[] carta = pilha.top();
        if (top() == null) {
            if ((Integer) carta[1] == 1) {
                push(carta);
                pilha.pop();
                System.out.println("Você inseriu uma carta");
            } else {
                System.out.println("Error");
            }
        } else {
            if (top()[0].toString().equals(carta[0].toString())
                    && ((Integer) top()[1] + 1) == (Integer) carta[1]) {
                push(carta);
                System.out.println("Você inseriu uma carta");
            } else {
                System.out.println("Error");
            }
        }

    }

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

    public void mudarDePilha(Pilha nova) {
        Object[] carta = top();
        Object[] cartaTopo = nova.top();
        if (corInversa(carta[0].toString(), cartaTopo[0].toString())) {
            if (((Integer) carta[1] + 1) == (Integer) cartaTopo[1]) {
                nova.push(pop());
                JOptionPane.showConfirmDialog(null, "OPA", "OPA", JOptionPane.WARNING_MESSAGE);
            } else {
                System.out.println("Error");
            }
        } else {
            System.out.println("Error");
        }
    }

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
