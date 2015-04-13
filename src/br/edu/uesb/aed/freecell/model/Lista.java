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

    public void inserir2(Object[] item, int k) {
        No novo = new No(item, null);
        No tmp = null;
        No pos = head;
        int posicao = 0;
        while (posicao < k) {
            pos = pos.getNext();
            posicao++;
        }
        if (posicao == k) {
            tmp = pos;
            pos = novo;
            pos.setNext(tmp);
        }

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
        return filaDepois.getItem();

    }

//   retorna o tamanho da lista
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
