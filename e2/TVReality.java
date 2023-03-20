package e2;

import java.util.ArrayList;
import java.util.Iterator;

public class TVReality implements Iterable<String>{

    private final ArrayList<String> lista;
    public int selectIt;
    public TVReality(ArrayList<String> lista){
        this.lista=lista;
        this.selectIt=0;
    }

    public Iterator<String> iterator() {
        if(selectIt==0) {
            return new Circular(lista);
        } else{
            return new Rebote(lista);
        }
    }
    public void setSelectIt(int selectIt){
        this.selectIt=selectIt;
    }

    public String getListWinner(){
        return lista.get(0);
    }

    public ArrayList<String> getLista(){
        return lista;
    }

}