package it.unibs.Medagliere;

public class Nazione 
{
	private String nomeNazione;
	private int quantitaOro = 0;
	private int quantitaArgento = 0;
	private int quantitaBronzo = 0;
	
	
	
	
	
	public Nazione(String nome)
	{
		nomeNazione = nome;
	}
	
	public Nazione(String nomeNazione, int quantitaOro, int quantitaArgento, int quantitaBronzo )
	{
		this.nomeNazione = nomeNazione;
		this.quantitaOro = quantitaOro;
		this.quantitaArgento = quantitaArgento;
		this.quantitaBronzo = quantitaBronzo;
		
	}
	
	public int getQuantitaOro()
	{
		return quantitaOro;
	}
	
	public int getQuantitaArgento()
	{
		return quantitaArgento;
	}
	
	public int getQuantitaBronzo()
	{
		return quantitaBronzo;
	}

	public String getNomeNazione ()
	{
		return nomeNazione;
	}
	
	
	/**
	 * aumenta tutti i contatori
	 * dei sui attributi medaglie
	 * 
	 */
	
	public void piuOro()
	{
		quantitaOro = quantitaOro + 1;
	}
	public void piuArgento()
	{
		quantitaArgento = quantitaArgento + 1;
	}
	public void piuBronzo()
	{
		quantitaBronzo = quantitaBronzo + 1;
	}
	
	public String toStringNomeNazione()
	{
		return nomeNazione + " :"; 
	}
	
	public String toStringNazione()
	{
		return "la nazione "+
	            nomeNazione + 
	            " ha:\n"+
	            "ori: "+
	            quantitaOro +
	            "\n"+
	            "argenti: "+
	            quantitaArgento +
	            "\n"+
	            "bronzi: "+
	            quantitaBronzo;

	}
	
	
	
	
}
