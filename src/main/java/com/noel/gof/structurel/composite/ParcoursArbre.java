package com.noel.gof.structurel.composite;

/**
 * A [B, C] B[D, E]; C[F] D []; E[];  F[G, H, I] G[J]; H[]; I[]; J[]
 */
public class ParcoursArbre {

  public static void main(String[] args) {
    Component d = new Leaf("D");
    Component e = new Leaf("E");
    Component h = new Leaf("H");
    Component i = new Leaf("I");
    Component j = new Leaf("J");

    Component a = new Node("A");
    Component b = new Node("B");
    Component c = new Node("C");

    ((Node) a).add(b);
    ((Node) a).add(c);

    ((Node) b).add(d);
    ((Node) b).add(e);

    Component f = new Node("F");
    Component g = new Node("G");
    ((Node) c).add(f);

    ((Node) f).add(g);
    ((Node) f).add(h);
    ((Node) f).add(i);

    ((Node) g).add(j);

    System.out.println("Noeud a =" + a);
    System.out.println("Noeud f =" + f);
    System.out.println("Noeud g =" + g);

    ((Node) g).remove(j);

    System.out.println("Noeud g after j removing =" + g);

  }
}