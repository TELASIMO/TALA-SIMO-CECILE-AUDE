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
public abstract class Employe {
      
   public String Nom;
   public String Prenom;
   public int Age;
   public int Date;
   public String Matricule;
   
   
 public Employe( String NomE , String PrenomE, int DateE ,String MatriculE,int AgeE ){
   Nom = NomE;
   Prenom = PrenomE;
   Matricule = MatriculE;
   Date = DateE;
   Age = AgeE;
 }
 
  public abstract double calculSalaire();
  
   public String getTypeEmploye(){
      return "L'employe :";
  }
   public String  getNom(){
     return getTypeEmploye()+ Nom +" " +Prenom;

 }
}  
  
  

    

