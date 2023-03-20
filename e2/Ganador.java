package e2;

import java.util.ArrayList;
import java.util.Iterator;

public class Ganador {
    public String selectCandidates(TVReality tv, int k){
        Iterator<String> it=tv.iterator();
        while(it.hasNext()){
            for(int i=0;i<k;i++){
                System.out.println(it.next());
            }
            it.remove();
        }
        System.out.println();
        return tv.getListWinner();
    }

    //Esta funcion generará el salto de forma aleatoria, como haría el concurso realmente
    //Sin, embargo, el test se comprobará con la de arriba
    public String selectCandidates(TVReality tv){
        Iterator<String> it=tv.iterator();
        int k=(int)( Math.random()*tv.getLista().size());
        while(it.hasNext()){
            for(int i=0;i<k;i++){
                it.next();
            }
            it.remove();
        }

        return tv.getListWinner();
    }

}