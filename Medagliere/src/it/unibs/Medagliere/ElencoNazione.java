package it.unibs.Medagliere;
import java.util.*;

public class ElencoNazione 
 {
   private ArrayList <Nazione> listaNazione = new ArrayList <Nazione> ();
   
   
   
   
   
   public int quantitaNazioni()
   {
	   return listaNazione.size();
   }
   
   
   /*
    * ritorna il nome della i-esima nazione
    * @param int pos
    * @return String name 
    */
   public String getNomeNazioneLista( int pos)
   {
	   return listaNazione.get(pos).getNomeNazione();
   }
   
   
   
   // se trova la nazione == vero se no == falso
   public boolean verificaNazione(String nomeNazione)
   {
	   for( int i = 0; i <listaNazione.size(); i++)
	   {
		   if(getNomeNazioneLista(i).equals(nomeNazione) == true) return true;// appena trova una corrispondenza
	   }
	  
	  return false; // se non trova nulla la nazione non c e
   }
  

   //verifica posizione della nazione
   public int posizioneGara(Nazione nomeNazione)
   {
	   if (listaNazione.isEmpty())return -1;
	   for( int i = 0; i <listaNazione.size(); i++)
	   {
		   if(getNomeNazioneLista(i).equals(nomeNazione.getNomeNazione()) == true) return i;// appena trova una corrispondenza
	   }
	  
	  return -1; // se non trova nulla la nazione non c e
   }


   /**
    * ritorna una Stringa vettore contenente il nome di tutte le nazioni posizionate corretamente
    * @return String [] nomeListaNazione
    */
   public String[] nomeListaNazione ()
   {
	   String[] nomeListaNazione = new String [listaNazione.size()];
	   for(int i= 0 ; i < listaNazione.size(); i++ )nomeListaNazione [i]= getNomeNazioneLista(i); 
	   return nomeListaNazione;
   }
   
   /**
    * aggiungi Nazione vero se e stata aggiunta
    * @param nomeNuovaNazione
    * @return boolean
    */ 
   public boolean aggiungiNazione(String nomeNuovaNazione)
   {
	   
	  
	   Nazione nuovaNazione = new Nazione(nomeNuovaNazione.toUpperCase());
	   
	   if (!(verificaNazione(nuovaNazione.getNomeNazione()) == true))
	       {
		    listaNazione.add(nuovaNazione);
	        return true; // aggiunto correttamente
	       }
	   else return false;// e gia presente
   }
 
   private Nazione prendiNazione(int posizioneNazione)
   {
	   return listaNazione.get(posizioneNazione);
   }
   
   public void addNazioneOro(int posizioneNazioneOro)
   {
	   prendiNazione(posizioneNazioneOro).piuOro();
   }

   public void addNazioneArgento(int posizioneNazioneArgento)
   {
	   prendiNazione(posizioneNazioneArgento).piuArgento();
   }
   
   public void addNazioneBronzo(int posizioneNazioneBronzo)
   {
	   prendiNazione(posizioneNazioneBronzo).piuBronzo();
   }
   
   public void ordinaNazioni()
   {
	   int ultimaPosizione, i = 0 ,j;
	   Nazione miglioreNazione = new Nazione(prendiNazione(i).getNomeNazione(), prendiNazione(i).getQuantitaOro(),prendiNazione(i).getQuantitaArgento(),prendiNazione(i).getQuantitaBronzo()); // errore di non iniziallizazione
	   
	   for(i = 0; i < quantitaNazioni(); i++)
	   {
		   for(j = 0; j < quantitaNazioni(); j++ )
		     {
			   if (miglioreNazione.getQuantitaOro() <= prendiNazione(j).getQuantitaOro() )
			     {
				   if(miglioreNazione.getQuantitaOro() < prendiNazione(j).getQuantitaOro() )
					   {
					     miglioreNazione = prendiNazione(j);
					     listaNazione.remove(j);
					     listaNazione.add(i,miglioreNazione); 
					   }
			       else // le nazioni hanno la stessa quantita di oro
				      {
			    	   if(miglioreNazione.getQuantitaArgento() <= prendiNazione(j).getQuantitaArgento() )
			    	     {
			    		   if(miglioreNazione.getQuantitaArgento() < prendiNazione(j).getQuantitaArgento() ) 
			    			   {
			    			      miglioreNazione = prendiNazione(j);
			    			      listaNazione.remove(j);
							      listaNazione.add(i,miglioreNazione); 
			    			   }
			               else // le nazioni hanno la stessa quantita di Argento
			    		       {
			    			     if(miglioreNazione.getQuantitaBronzo() <= prendiNazione(j).getQuantitaBronzo() )
					    	       {
					    		     if(miglioreNazione.getQuantitaBronzo() < prendiNazione(j).getQuantitaBronzo() )
					    		    	 {
					    		    	  miglioreNazione = prendiNazione(j);
					    		    	  listaNazione.remove(j);
										  listaNazione.add(i,miglioreNazione); 
					    		    	 }
						             //else le due nazioni sono uguali;
					    	       }
			    	           }
				         }
				       }
			      }
		       }//graffa del for interno;
       // ha finito la ricerca della gara migliore 
	   
	   
	   }
   }
}
