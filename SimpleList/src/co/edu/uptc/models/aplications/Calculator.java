package co.edu.uptc.models.aplications;

import java.util.List;

public class Calculator <T> {
    private List<T> list=null;
    private int result=0;

public Calculator(List<T> list){
    this.list = list;
}

    public void sumData(){

    for (int i = 0; i < list.size(); i++) {
        //TODO machetazo
        int aux = (int)list.get(i);
        result = result + aux;
      }
        
    }

    public int getResult(){
        return result;
    }
}
