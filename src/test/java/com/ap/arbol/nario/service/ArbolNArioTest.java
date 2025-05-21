package com.ap.arbol.nario.service;

import com.ap.arbol.nario.model.Nodo;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.*;

public class ArbolNArioTest {

    private ArbolNArio arbol;

    @Before
    public void setUp() {
        arbol = new ArbolNArio();
    }

    @Test
    public void testEmptyTree() {
        // Cuando la raíz es null, la profundidad debe ser 0
        assertEquals(0, arbol.maxDepth(null));
    }

    @Test
    public void testSingleNode() {
        Nodo nodo = new Nodo(1, Collections.emptyList());
        assertEquals(1, arbol.maxDepth(nodo));
    }

    @Test
    public void testTwoLevels() {

        Nodo hijo1 = new Nodo(2, Collections.emptyList());
        Nodo hijo2 = new Nodo(3, Collections.emptyList());
        Nodo raiz  = new Nodo(1, Arrays.asList(hijo1, hijo2));

        // La ruta más larga es 1→2 (o 1→3), profundidad 2
        assertEquals(2, arbol.maxDepth(raiz));
    }

    @Test
    public void testThreeLevels() {

        Nodo n4   = new Nodo(4, Collections.emptyList());
        Nodo n2   = new Nodo(2, Collections.singletonList(n4));
        Nodo n3   = new Nodo(3, Collections.emptyList());
        Nodo raiz = new Nodo(1, Arrays.asList(n2, n3));

        // La ruta más larga es 1→2→4, profundidad 3
        assertEquals(3, arbol.maxDepth(raiz));
    }

    @Test
    public void testUnbalancedTree() {
        Nodo n6   = new Nodo(6, Collections.emptyList());
        Nodo n5   = new Nodo(5, Collections.singletonList(n6));
        Nodo n2   = new Nodo(2, Collections.singletonList(n5));
        Nodo raiz = new Nodo(1, Collections.singletonList(n2));

        // profundidad 4
        assertEquals(4, arbol.maxDepth(raiz));
    }
}
