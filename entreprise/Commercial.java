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
public  abstract class Commercial extends Employe {
    int chiffreAffaire;
    public Commercial(String NomE, String PrenomE, int DateE, String MatriculE, int AgeE,int CA) {
        super(NomE, PrenomE, DateE, MatriculE, AgeE);
    chiffreAffaire = CA;
    }
    
    @Override
     public String getTypeEmploye(){
      return "Commercial : ";
  }

    public double calculSalaire() {
    double salaire = (chiffreAffaire*0.2)+110000.0+200.0;
        return salaire;
    }
}   


    
   