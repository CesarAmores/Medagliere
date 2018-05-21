package it.unibs.Medagliere;
import it.unibs.fp.mylib.*;

public class  MenuPrincipale 

{
	final static String[] VOCIMENUPRINCIPALE = { "Inserici nuova nazione",//opzione1
			  									 "Inserisci nuova gara",//opzione2
			  									 "Stampa lista nazione",//opzione3
			                                     "Stampa lista gare",//opzione4
			  									 "Riordina Medagliere"// opzione5
			  									};
	final static String TITOLOMENUPRINCIPALE = "Medagliere";
	final static String VUOTO ="Nono ci sono dati";
	final static String TITOLOSTAMPANAZIONI= "Le nazioni presenti sono:";
	final static String TITOLOSTAMPAGARE= "Le gare presenti sono:";
	final static String CORNICE = "-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_";
	final static String CORNICESECONDARIA = "-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*";
	 
	static MyMenu menuPrincipale()
	   {
		   MyMenu menuPrincipale = new MyMenu(TITOLOMENUPRINCIPALE, VOCIMENUPRINCIPALE);
	       return menuPrincipale;
	   }
	 	 
	 static private void bellaStampaLista(String[] lista, int dimLista ,String  titolo, String cornice,  String corniceSecondaria )
	 {
		 int i = 0;
		 
		 System.out.println(cornice); 
		 System.out.println(titolo); //  STAMPA IL TITOLO PER LE NAZIONI
         System.out.println(corniceSecondaria); 
         
         for(i=0; i < dimLista; i++)
        	 {
        	  if (i == 0)
        	    {
        		  System.out.printf("%s, ",lista[i]);
        	    }
        	  else if( i >0 && i <(dimLista-1))
        	    {
        		  System.out.printf("%s, ",lista[i]); 
        	    }
        	  else
        	    {
        		  System.out.println(lista[i]);
        		  System.out.println(corniceSecondaria);
        	    }
        	 }
         System.out.println(cornice);
	 }

     static public void stampaNazioni(UtilityGaraNazione gestoreGaraNazione) 
	 
	 {
    	 if (gestoreGaraNazione.getQuantitaNazione() == 0) // non ci sono dati
    		 {
    		   System.out.println(VUOTO);
    		   return;
    		 }
       String[] nazioniDaStampare = new String[gestoreGaraNazione.getQuantitaNazione()];
       nazioniDaStampare= gestoreGaraNazione.listaNazioni(); // HO GENERATO LA LISTA DI NAZIONI   
	   
       bellaStampaLista(nazioniDaStampare, gestoreGaraNazione.getQuantitaNazione(), TITOLOSTAMPANAZIONI, CORNICE, CORNICESECONDARIA );
	 }
     
     
     static public void stampaGara(UtilityGaraNazione gestoreGaraNazione) 
	 
	 {
    	 if (gestoreGaraNazione.getQuantitaGara() == 0) // non ci sono dati
		 {
		   System.out.println(VUOTO);
		   return;
		 }
       String[] daStampare = new String[gestoreGaraNazione.getQuantitaGara()];
       daStampare= gestoreGaraNazione.listaGara(); // HO GENERATO LA LISTA DI GARA  
	   
       bellaStampaLista(daStampare, gestoreGaraNazione.getQuantitaGara(), TITOLOSTAMPAGARE, CORNICE, CORNICESECONDARIA );
	 }
     
     static public void ordinaListaNazioni(UtilityGaraNazione gestoreGaraNazione)
     {
    	 gestoreGaraNazione.ordinaNazioni();
    	 stampaNazioni(gestoreGaraNazione);
     }
}
