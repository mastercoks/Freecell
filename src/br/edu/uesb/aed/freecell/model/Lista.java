/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.uesb.aed.freecell.model;

import javax.swing.text.html.parser.Element;

/**
 *
 * @author matheus
 */
public class Lista {

    private No head;
    private No tail;

    public final class No {

        private Object[] item;
        private No next;

        public No(Object[] item, No next) {
            this.item = item;
            this.next = next;
        }

        public Object getItem() {
            return this.item;
        }

        public No getNext() {
            return this.next;
        }

        public void setItem(Object[] item) {
            this.item = item;
        }

        public void setNext(No next) {
            this.next = next;
        }

    }

    public Lista() {

    }

    public boolean isEmpty() {
        return (head == null);
    }

    public void inserir(Object[] item) {
        No tmp = new No(item, null);
        if (head == null) {
            head = tmp;
        } else {
            tail.next = tmp;
        }
        tail = tmp;
    }

    public Object procurarRemove(int posicao) {
        No filaDepois = head;
        No filaAntes = null;
        int cont = 0;
        while (cont < posicao) {
            filaAntes = filaDepois;
            filaDepois = filaDepois.next;
            cont++;
        }
        if (filaDepois == null) {
            System.err.println("Item não encontrado");
        } else {
            if (filaDepois == head) {
                head = filaDepois.next;
            } else {
                filaAntes.next = filaDepois.next;
            }
            if (filaDepois == tail) {
                tail = filaDepois;
            }
        }
//        aux.next = tmp.next;
        return filaDepois.getItem();

    }

    public void imprime() {
        No tmp = head;
//        Element proxTmp = null;
        while (tmp != null) {
            System.out.println(tmp.item[0] + " " + tmp.item[1]);
            tmp = tmp.next;
        }
    }

    public int size() {
        No tmp = head;
        int tamanho = 0;
        while (tmp != null) {
            tamanho++;
            tmp = tmp.next;
        }
        return tamanho;
    }
}
