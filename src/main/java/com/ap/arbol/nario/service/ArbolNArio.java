package com.ap.arbol.nario.service;

import com.ap.arbol.nario.service.eddLineales.Nodo;

public class ArbolNArio {

    public int maxDepth(Nodo root){
        if ( root == null)
            return 0;
        int  max = 0;
        for (Nodo child: root.children){
            max = Math.max(max, maxDepth(child));
        }
        return 1 + max;
    }
}
