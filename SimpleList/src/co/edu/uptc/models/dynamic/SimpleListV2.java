package co.edu.uptc.models.dynamic;

public class SimpleListV2 {
    Node header;
    Node last;

    public SimpleListV2(){
      header = null;
      last = null;
    }

    // TODO:  falta addionar mas de un elemento y que lo adiciona a la lista
    public void addv1(int value){
       Node node = new Node();
       node.setInfo(value);
       node.setNext(null);
       header = node;
    }

    // TODO: falta refactorizar
    public void add(int value){
        Node newNode = new Node();
        newNode.setInfo(value);
        newNode.setNext(null);
        if (header== null) {
            header = newNode;
            last = header;
        } else {            
            last.setNext(newNode);
            last = newNode;
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
