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
public class Personnelles {
    
    private final Employe[] collectionE;
    private int nbreEmploye; // nombre des employés de l'entreprise
    private final static int nbremaxemploye=700;//nombre maximal d'employés que peut comtenir l'entreprise
    
    
    public Personnelles(){
        //mon tableau est appelé colection.
        
        collectionE=new Employe[nbremaxemploye];
        nbreEmploye=0;
    }
    
    public void ajouterEmploye(Employe e){
        
        ++nbreEmploye;
        
         if(nbreEmploye<=nbremaxemploye)
        {
            collectionE[nbreEmploye-1]=e;
        } 
        else 
            System.out.println("Impossible car on na pas plus de "+nbremaxemploye+" employés ");
        
    }
    
    public double salaireMoyen(){
        double som=0.0;
        
        for(int i=0;i<nbreEmploye;i++){
            som+=collectionE[i].calculSalaire();
        }
        
        return som/nbreEmploye;
    }
    
    public void afficherSalaire(){
        
        for(int i=0;i<nbreEmploye;i++){
            System.out.println(collectionE[i].getNom()+" gagne "+collectionE[i].calculSalaire()+" francs. ");
        }
    }
}




        
    
   
   
    

