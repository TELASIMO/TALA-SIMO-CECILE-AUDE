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
public class ProducteurE  extends ProductionE implements Risque {
      int nombreUnite;
    public ProducteurE(String NomE, String PrenomE, int DateE, String MatriculE, int AgeE,int nombre) {
        super(NomE, PrenomE, DateE, MatriculE, AgeE,nombre);
           nombreUnite= nombre;   
    }
    
      @Override
     public String getTypeEmploye(){
      return " ProducteurE : ";
  }
      @Override
    public double calculSalaire(){
        return nombreUnite*5.0+110000.0;
    }
    
    public double prime (ProducteurE p){
      return p.calculSalaire()+pr;
}

   
}

