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
public class ProductionE extends Employe {
    int nombreUnites;
public ProductionE(String NomE, String PrenomE, int DateE, String MatriculE, int AgeE,int nombreU) {
        super(NomE, PrenomE, DateE, MatriculE, AgeE);
      nombreUnites = nombreU;
    }

 public String getTypeEmploye(){
      return " ProductionE : ";
  }

    @Override
    public double calculSalaire() {
     return 110000.0+nombreUnites *5.0;
    }
     
     
    }
    

