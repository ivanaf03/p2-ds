package e2;

import java.util.ArrayList;
import java.util.Iterator;

public class Circular implements Iterator<String> {
    private int pos;
    private int contarNext;
    private final ArrayList<String> lista;


    public Circular(ArrayList<String> lista) {
        pos=0;
        this.lista=lista;
    }
    @Override
    public boolean hasNext() {
         return (lista.size()>1);
    }

    @Override
    public String next() {
        contarNext+=1;
        pos+=1;
        if(pos>lista.size()){
            pos=1;
        }
        return lista.get(pos-1);
    }

    @Override
    public void remove() {
        pos--;
        if(contarNext>0){
            lista.remove(pos);
        }
        contarNext=0;
    }
}
