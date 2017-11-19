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
public class Salary {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Personnelles p=new Personnelles();
        p.ajouterEmploye (new ProductionE("NONO","POLO",1997,"13G573",13,27));
        p.ajouterEmploye (new ManutentionE ("MAGNE","MARIE",1980,"13D53",27,70));
        p.ajouterEmploye (new VendeurComE ("TAGNE","VALERE",1980,"13A473",13,234));
        p.ajouterEmploye (new ManutentionnaireE("FOMO","VANESSA",1890,"13B473",13,70));
        p.ajouterEmploye (new ProducteurE("SILO","ANDRE",1990,"13B483",19,60));
        p.ajouterEmploye(new RepresentantComE("SIME","LOIC",1987,"17B739",40,10)); 
        
        
        p.afficherSalaire();
        System.out.println("le salaire moyen est "+p.salaireMoyen()+" franc ");
    }
    }
    

