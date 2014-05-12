/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.util.Comparator;

/**
 *
 * @author fabio
 */
public class DiscoComparatorAnoAsc implements Comparator{
  
    @Override
    public int compare(Object obj1, Object obj2) {
        if(obj1 instanceof Disco && obj2 instanceof Disco) {
            Disco d1 = (Disco)obj1;
            Disco d2 = (Disco)obj2;
            return  d1.getAno()-d2.getAno();
        }
        return -1;
    }  
}
