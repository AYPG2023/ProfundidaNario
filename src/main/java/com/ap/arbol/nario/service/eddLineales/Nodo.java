package com.ap.arbol.nario.service.eddLineales;

import java.util.List;

public class Nodo {

    public int val;
    public List<Nodo> children;

    public Nodo(){}

    public Nodo(int val) {
        this.val = val;
    }
    public Nodo(int val, List<Nodo> children) {
        this.val = val;
        this.children = children;
    }
}
