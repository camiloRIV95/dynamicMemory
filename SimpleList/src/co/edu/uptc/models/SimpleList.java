package co.edu.uptc.models;

public class SimpleList {
    Node header;

    // TODO:  falta addionar mas de un elemento y que lo adiciona a la lista
    public void addv1(String value){
       Node node = new Node();
       node.setInfo(value);
       node.setNext(null);
       header = node;
    }

    // TODO: falta refactorizar
    public void add(String value){
        Node newNode = new Node();
        newNode.setInfo(value);
        newNode.setNext(null);
        if (header== null) {
            header = newNode;
        } else {
            Node last = header;
            while (last.getNext() !=null) {
                     last = last.getNext();
            }
            last.setNext(newNode);
        }



        
     }

    public void showList(){
      Node aux = header;
      while (aux!=null) {
        System.out.println(aux.getInfo());
        aux = aux.getNext();
      }

    }
}
