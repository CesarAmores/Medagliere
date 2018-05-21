package it.unibs.Medagliere;
import java.util.*;

//import it.unibs.fp.mylib.InputDati;

public class ElencoGara 
{
	private ArrayList <Gara> listaGara =new ArrayList <Gara>();
	
	
	public int quantitaGara()
	   {
		   return listaGara.size();
	   }
	
	/**
	 *  metodo getNomeGaraLIst = ritorna il nome della i-esima gara 
	 * @param pos
	 * @return
	 */
    
	public String getNomeGaraLista( int pos)
	   {
		   return listaGara.get(pos).getNomeGara();
	   }
	
	/**
	 * 
	 * Aggiungi gara:
	 * Viene verificato l'inserimento della nuova gara;
	 * -Controllo se la gara esiste : vero la gara e stata inserita, falso gara non inserita
	 * @param nomeGara
	 */
	
	public boolean aggiunginuovaGara  (Gara nomeGara)
	   {
		   if ((!(verificaNomeGara(nomeGara.getNomeGara())) == true))
		       {
			      listaGara.add(nomeGara);
		          return true; // aggiunto correttamente
		       }
		   else return false;// e gia presente
	   }
	   
	
	  /**
	   * Cerca la gara con lo stesso nome-1 = gara non presente altrimenti ritorna la posizione della gara cercata
	   * @param String []nomeGara
	   * @return int posizione Nome della Gara
	   */
	  
    public int posizioneGara(Gara nuovaGara)
	   {
		   if (listaGara.isEmpty())return -1;
		   for( int i = 0; i <listaGara.size(); i++)
		   {
			   if(getNomeGaraLista(i).equals(nuovaGara.getNomeGara()) == true) return i;// appena trova una corrispondenza
		   }
		  
		  return -1; // se non trova nulla la nazione non c e
	   }
    
       /**
        *  verifica il nome String della gara
        * vero se la gara esite, falso la gara non esiste
        * @param String: nomeGara
        * @return boolean
        */
	public boolean verificaNomeGara(String nomeGara)
	   { 
		   for( int i = 0; i < listaGara.size(); i++)
		   {
			   if(getNomeGaraLista(i).equals(nomeGara) == true) return true;// appena trova una corrispondenza
		   }
		  
		  return false; 
	   }
	  
	/**
	 * ritorna una Stringa vettore contenente il nome di tutte le gare posizionate corretamente
	 * @param void
	 * @return String[]
	 */
	   
	 public String[] nomeListaGara()
	   {
		 if(listaGara.isEmpty() == false)
		 {
		   String[] nomeListaGara = new String [listaGara.size()];
		   for(int i= 0 ; i < listaGara.size(); i++ )nomeListaGara [i]= getNomeGaraLista(i); 
		   return nomeListaGara;
		 }
		return null;
		 
	   }
	   
	   
}
