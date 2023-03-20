package e2;

import java.util.ArrayList;
import java.util.Iterator;

public class Rebote implements Iterator<String> {
    private int pos;
    private int contarNext;
    private boolean adelante=true;
    private final ArrayList<String> lista;

    public Rebote(ArrayList<String> lista) {
        pos=0;
        this.lista=lista;
    }
    @Override
    public boolean hasNext() {
        return (lista.size()>1);
    }

    @Override
    public String next() {
        contarNext++;
        if(adelante){
            pos++;
        } else{
            pos--;
        }
        if(pos>= lista.size()) {
            adelante = false;
        }
        if(pos==0){
            adelante=true;
            pos= lista.size()-1;
        }
        return lista.get(pos-1);
    }

    @Override
    public void remove() {
        if(contarNext>0) {
            if (adelante) {
                lista.remove(pos-1);
                pos--;
            } else{
                lista.remove(pos-1);
            }
        }
    }
}
