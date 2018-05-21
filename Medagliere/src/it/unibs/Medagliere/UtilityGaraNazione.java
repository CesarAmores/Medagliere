	package it.unibs.Medagliere;

import it.unibs.fp.mylib.*;

public class UtilityGaraNazione 

{ 
	 private ElencoNazione arrayNazione = new ElencoNazione(); // genico oggetto che crea la mia lista nazione 
	 private ElencoGara arrayGara = new ElencoGara(); // genico oggetto che crea la mia lista gare
	 
	 private int quantitaNazione = arrayNazione.quantitaNazioni(); // dimensione nome lista
	 private int quantitaGara = arrayGara.quantitaGara(); // dimensione nome lista

	 
	 MyMenu menuNomiNazione = new MyMenu(TITOLOMENUNAZIONE ,creaListaNazione() );
	 
	 // stringa nazione
	 private static final String INSERIRENOMENAZIONE= "Inserire nome nuova nazione ";
	 private static final String RINSERIRENOMENAZIONE= "Nazione gia presente, rinserire una nuova Nazione ";
	 private static final String NOMENAZIONEINSERITO= "Nazione inserita corettamente";
	 private static final String NAZIONEAGGIUNTA = "La nazione aggiunta e : %s\n";
	 //inseriemnto gara + vincitori
	 private static final String INSERIREORO= "Inserire la nazione vincitrice oro, selezionare un numero dal elenco ";
	 private static final String INSERIREARGENTO= "Inserire la nazione vincitrice argento, selezionare un numero dal elenco ";
	 private static final String INSERIREBRONZO= "Inserire la nazione vincitrice bronzo, selezionare un numero dal elenco ";
	 
	 //listanazione
	 private static final String TITOLOMENUNAZIONE = "Lista nazione";
    
	 // stringa Gara
     private static final String INSERIREGARA = "Inserire nuova Gara ";
     private static final String NOMEGARAINSERITA = "Nome gara inserita : %s\n";
     private static final String GARAINSERITA = "Gara inserita";
     private static final String GARANONINSERITA = "ERRORE INSERIMENTO";
     
     
   
   /**
    * Metodo reloadMyMenu : aggiorna  menu cambiandone le voci     
    * @param MyMenu: menu
    * @param String []nuoveVoci
    * @return MyMenu: menu 
    */                            
     
     private void reloadMyMenu (MyMenu menu,String[] nuoveVoci)
     {
  	    menu.changeMyMenu(nuoveVoci);
     }
     
     
     public int getQuantitaGara()
     {
	  reloadNumeroGara();
	  return quantitaGara;
     }
     
     private void reloadNumeroGara()
     {
   	  quantitaGara = arrayGara.quantitaGara(); // aggiorno il numero di Gara presenti nella lista
     }
     
     public boolean listaGaraNONVuota()
     {
   	  reloadNumeroGara();
   	  if (arrayGara.quantitaGara() >0) return true;
   	  else return false;
     }
     
 	private String [] creaListaGara()
	 {
		
 		 reloadNumeroGara();
		 String [] nomeListaGara = new String [quantitaGara];// creo lista nomi Gara 
		 
		 for(int i = 0; i < quantitaGara ; i++) // mi crea la lista della Gara 
		  {
		   	nomeListaGara [i] = (arrayGara.getNomeGaraLista(i)); 
		  }
		 return nomeListaGara; // ritorna la lista Gara 
	 }
 	
	/** 
	 * metodo : RinserireGara usato in creaGaraEVincitori
	 * ritorna vero se la gara e inserita falso altrimenti
	 * usato nel metodo creaGaraEVincitori()
	 * @param String : nomeGara 
	 * @return boolean
	 */ 
    private boolean rinserireGara(String nomeGara)
    {
	  return arrayGara.verificaNomeGara(nomeGara);  
    }
    
 	
     public int getQuantitaNazione()
     {
	   reloadNumeroNazioni();
	   return quantitaNazione;
     }
      /**
       * Aggiorna il numero delle nazioni da usare come lista
       */
     
     
      private void reloadNumeroNazioni()
      {
    	  quantitaNazione = arrayNazione.quantitaNazioni(); // aggiorno il numero di nazioni presenti nella lista
      }
    
      /**
      * verifica che la lista delle nazioni non sia vuota
      * @return true se è maggiore di 0
      */
      public boolean listaNazioneNONVuota()
      {
    	  reloadNumeroNazioni();
    	  if (arrayNazione.quantitaNazioni() >0) return true;
    	  else return false;
      }
    
      
      /**
      * Il metodo crea una lista contenente tutti i nomi delle nazioni aggiunte recentemente
      * @param void
      * @return String[]
      */
	private String [] creaListaNazione()
	 {
		 reloadNumeroNazioni();
		 String [] nomeListaNazione = new String [quantitaNazione];// creo lista nomi nazione
		 
		 for(int i = 0; i < quantitaNazione ; i++) // mi crea la lista della nazione 
		  {
		   	nomeListaNazione[i] = (arrayNazione.getNomeNazioneLista(i)); 
		  }
		 return nomeListaNazione; // ritorna la lista piena 
	 }
	
	
	

 
   /**
    * Assoccia un nome valido per  una nuova Nazione
    * Verifica che non è gia presente nella lista nazione
    * Tutti i nomi sono maiusc
    * @return String NuovaNazione
    */
   
   private String nomeNazioneNuova()
   {
	   String nuovoNomeNazione;
	   do {
	        nuovoNomeNazione= InputDati.leggiStringa(INSERIRENOMENAZIONE);
	        nuovoNomeNazione=nuovoNomeNazione.toUpperCase();
	        if (arrayNazione.verificaNazione(nuovoNomeNazione)) System.out.println(RINSERIRENOMENAZIONE);
	        else System.out.println(NOMENAZIONEINSERITO);
  	      }while(arrayNazione.verificaNazione(nuovoNomeNazione));
	   return nuovoNomeNazione;
   }
   
   /**
    * Metodo CreaNazione:
    * @param void
    * @return void
    */
   public void creaNazione()
   {
	  String nuovoNomeNazione;
	  do {
		   nuovoNomeNazione=nomeNazioneNuova();// trovo il nome della nuova nazione
		   System.out.printf(NAZIONEAGGIUNTA, nuovoNomeNazione);
	     }while(!(arrayNazione.aggiungiNazione(nuovoNomeNazione))); // chiudo se posso accettare il nome della nazione 
   }
   
   /**
    * 
    * @return String [] dei nomi delle nazioni
    */
   
   public String[] listaNazioni()
   {
	   
	   if( listaNazioneNONVuota())
	   {
 		   return creaListaNazione();
	   }
	   else return null;
   }
   
   public String[] listaGara()
   {
	   
	   if( listaGaraNONVuota())
	   {
 		   return creaListaGara();
	   }
	   else return null;
   }
   
   public void aggingiGara()
   {
	   if(listaNazioneNONVuota() == true)
	   {
		  Gara nuovaGara = new Gara();
		  nuovaGara =creaGaraEVincitori();
		  if(arrayGara.aggiunginuovaGara(nuovaGara))
		    {
			  System.out.println(nuovaGara.toString()); 
		      System.out.println(GARAINSERITA);
	        }
	   else System.out.println (GARANONINSERITA);
       }
    }
   
   private Gara creaGaraEVincitori()
   {
	  reloadNumeroNazioni();//* aggiorno il numero di nazioni
	  
	  String listaNomiNazione [] =new String [quantitaNazione]; // creo la lista delle voci nazioni 
	  
	  listaNomiNazione = creaListaNazione();// setto che puntino le stesse celle di memoria del arrayList associato a nazioni
	  
	  reloadMyMenu(menuNomiNazione,listaNomiNazione); // aggiorno menu delle nazioni
	  
	  
	  String nomeGara = null; // creo il nuovo nome gara
	  
	  
	  int posizioneNazioneOro; 
	  String nomeNazioneOro;
	  
	  int posizioneNazioneArgento;
	  String nomeNazioneArgento;
	  
	  int posizioneNazioneBronzo;
	  String nomeNazioneBronzo;
	  
	  do {
		  
		  nomeGara = InputDati.leggiStringa(INSERIREGARA);  
		  nomeGara = nomeGara.toUpperCase();
	     }while(!(rinserireGara(nomeGara) == false));// termina quando ho una gara valida esce quando ho un nome valido per una nuova gara 	 
	  System.out.printf(NOMEGARAINSERITA, nomeGara);
	  
	 
	 
	 
	 System.out.printf(INSERIREORO+"\n");
	 posizioneNazioneOro=menuNomiNazione.scegli();// ritorna la posizione nel array del nazione da premiare
	 posizioneNazioneOro--;
	 arrayNazione.addNazioneOro(posizioneNazioneOro);
	 nomeNazioneOro=arrayNazione.getNomeNazioneLista(posizioneNazioneOro);// punto per mi serve verificare che la cella sia coretta 
	 
	 System.out.printf(INSERIREARGENTO+"\n");
	 posizioneNazioneArgento=menuNomiNazione.scegli(); // ritorna la posizione nel array del nazione da premiare
	 posizioneNazioneArgento--;
	 arrayNazione.addNazioneArgento(posizioneNazioneArgento);
	 nomeNazioneArgento=arrayNazione.getNomeNazioneLista(posizioneNazioneArgento);
	 
	 System.out.printf(INSERIREBRONZO+"\n");
	 posizioneNazioneBronzo=menuNomiNazione.scegli(); // ritorna la posizione nel array del nazione da premiare
	 posizioneNazioneBronzo--;
	 arrayNazione.addNazioneBronzo(posizioneNazioneBronzo);
	 nomeNazioneBronzo=arrayNazione.getNomeNazioneLista(posizioneNazioneBronzo);
	 
	 Gara newGara = new Gara(nomeGara,nomeNazioneOro,nomeNazioneArgento,nomeNazioneBronzo);
	  return newGara;
   }
  
   // cerca gare vinte da una nazione
   
   //riordin medagliere
    public void ordinaNazioni()
      {
    	arrayNazione.ordinaNazioni();
      }
   
   
   
}