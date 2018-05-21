package it.unibs.Medagliere;


public class Gara 

{
   
   private String nomeGara;
   private String oroNazione;
   private String argentoNazione;
   private String bronzoNazione;
   
   /**
    * @Metod costruttoreGara senza parametri
    */
   public Gara()
   {
	   
   }
  
   /**
    * @Metod costruttoreGara con parametri
    * @param String nomeGara, String oroNazione, String argentoNazione, String  bronzoNazione
    */
    public  Gara(String nomeGara, String oroNazione, String argentoNazione, String  bronzoNazione)
     {
	 
	   this.nomeGara = nomeGara;
	   this.oroNazione = oroNazione;
	   this.argentoNazione = argentoNazione;
	   this.bronzoNazione = bronzoNazione;
     }

    public String getNomeGara()
     {
	   return nomeGara;
    }

    public String getOroNazione() 
    {
	 return oroNazione;
    }

	public String getArgentoNazione() 
	{
		return argentoNazione;
	}

	public void setOroNazione(String oroNazione) 
    {
	 this.oroNazione = oroNazione;
    }

	public void setArgentoNazione(String argentoNazione) 
	{
		this.argentoNazione = argentoNazione;
	}

	public String getBronzoNazione() 
	{
		return bronzoNazione;
	}

	public void setBronzoNazione(String bronzoNazione) 
	{
		this.bronzoNazione = bronzoNazione;
	}
    
	public String toString()
	{
		return "la gara : "+ 
	           nomeGara + 
	           "\n"+
	           "oro: "+
	           oroNazione+
	           "\n"+
	           "agento: "+
	           argentoNazione+
	           "\n"+
	           "bronzo: "+
	           bronzoNazione; 
	}
   

}
