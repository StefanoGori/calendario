/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.calendario;
import java.util.Vector;
/**
 *
 * @author stefa
 */
public class calendario {
          public int gg;
          public int mm;
          public int aaaa;
          public int giorni[]={31,28,31,30,31,30,31,31,30,31,30,31};
          
          public calendario(int gg, int mm, int aaaa){
              this.gg=gg;
              this.mm=mm;
              this.aaaa=aaaa;
          }
          public void Bisestile(int aaaa, int giorni[]){
              if(aaaa>1584 && (aaaa%400==0 || (aaaa%4==0 && aaaa%100!=0))){
                  giorni[1]=29;
              }
          }
          public String GiornoSettimana(){
              int t=0;
              String giorno="";
              for(int i=0;i<mm;i++){
                t+=giorni[i];
              }
              t+=gg;
        
            double x = aaaa + java.lang.Math.floor((aaaa - 1)/4)- java.lang.Math.floor((aaaa - 1)/100) + java.lang.Math.floor((aaaa - 1)/400) + t;
            x=x%7;
            if(x==0){
                giorno="sabato";
            }
            if(x==1){
              giorno="domenica";
            }
            if(x==2){
                giorno="lunedi";
            }
            if(x==3){
                giorno="martedi";
            }
            if(x==4){
                giorno="mercoledi";
            }
            if(x==5){
                giorno="giovedi";
            }
            if(x==6){
                giorno="vernerdi";
            }
            return giorno;
         }
        public String GiornoSuccessivo(){
             
            String data="";
            if(gg==31 && mm==12){
                data=1+"/"+1+"/"+(aaaa+1);
            }
            else{
                int t=0;
                int i=0;
                int j=0;
                for(i=0;i<mm;i++){
                    t+=giorni[i];
                }
                t+=gg+1;
                for(j=0;t>0;j++){
                    t-=giorni[j];
                }
                t+=giorni[j-1];
                data=t+"/"+i+"/"+aaaa;
            }
        return data;
    }
}
