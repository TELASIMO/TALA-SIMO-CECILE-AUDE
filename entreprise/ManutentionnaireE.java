/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entreprise;

/**
 *
 * @author michelle
 */
public class ManutentionnaireE  extends Employe implements Risque {
          int nombreHeure;
    public ManutentionnaireE(String NomE, String PrenomE, int DateE, String MatriculE, int AgeE,int nombre) {
        super(NomE, PrenomE, DateE, MatriculE, AgeE);
           nombreHeure= nombre;   
      
    }
    
     public String getTypeEmploye(){
      return " ManutentionnareE : ";
  }
    public double calculSalaire(){
        return 110000.0+nombreHeure*65.0;
    }

    public double prime (ManutentionnaireE e) {
     return  (e.calculSalaire()+pr);
             
    }
    

   
    
    
}
