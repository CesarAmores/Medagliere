package it.unibs.Medagliere;

//import it.unibs.fp.mylib.*;

public class MedagliereMain {

        
	public static void main(String[] args) 
	{
    	 	
        UtilityGaraNazione gestoreGaraNazione = new UtilityGaraNazione();
        int sceltaMenu = -1;
        
       
        do 
        {
          sceltaMenu = MenuPrincipale.menuPrincipale().scegli();
          switch(sceltaMenu)
          {
           case(1):
                   {
        	         gestoreGaraNazione.creaNazione();
                     break;
                   }
           case(2):
                   {
        	         if(gestoreGaraNazione.listaNazioneNONVuota())
        	         {
        	           gestoreGaraNazione.aggingiGara();
        	           break;
        	         }
        	         else
        	        	 {
        	        	 sceltaMenu = MenuPrincipale.menuPrincipale().scegli();
        	        	  break;
        	        	 }
                   }
           case(3):
                   {
        	         
        	         MenuPrincipale.stampaNazioni(gestoreGaraNazione);
        	         break;
                   }
           case(4):
           		   {
	                MenuPrincipale.stampaGara(gestoreGaraNazione);
	                break;
                   }
           case(5):
   		           {
                     MenuPrincipale.ordinaListaNazioni(gestoreGaraNazione);
                     break;
                   }
           case(0): 
                   {
        	          break;
                   }
     
           }
        }while(sceltaMenu != 0);
	    
	  
	}

}
