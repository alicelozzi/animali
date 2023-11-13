package org.generation.italy;

import java.util.ArrayList;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*scrivere un programma che consente all'utente di inserire una lista di 
		 * animali e suddividerli nelle seguenti categorie:mammiferi, pesci, rettili,
		 * anfibi e uccelli.
		 * All'utente viene chiesto di inserire il nome dell'animale (es.cane)
		 * e di rispondere a queste domande.
		 * 1.Ha il pelo e allatta?
		 * 2.Ha le penne e depone le uova?
		 * 3.Ha le scaglie e può strisciare o camminare?
		 * 4.Può vivere sia in acqua che sulla terra?
		 * 5.Ha le scaglie e vive in acqua?
		 * 
		 * In base alle risposte date aggiungere animale inserito in una lista apposita.
		 * Dopo ogni animale chiedere all'utente se si vuole inserire un altro animale
		 * Alla fine dell'inserimento mostrare gli animali di ogni categoria
		 */
		
		Scanner sc=new Scanner(System.in);
		String risposta, risposta2;
		
		ArrayList<String>mammiferi= new ArrayList<>();
		ArrayList<String>pesci= new ArrayList<>();
		ArrayList<String>rettili= new ArrayList<>();
		ArrayList<String>anfibi= new ArrayList<>();
		ArrayList<String>uccelli= new ArrayList<>();
		int numeroCategoria;
		
		do
		{
		
		System.out.println("che animale vuoi inserire?");
		risposta=sc.nextLine();
		
		if (mammiferi.contains(risposta)||pesci.contains(risposta)||rettili.contains(risposta)||anfibi.contains(risposta)||pesci.contains(risposta))
		{
		System.out.println("animale già inserito");
		}
		else 
		{
			System.out.println("in quale categoria rientra l'animale scelto? r/n "
				+ " 1.Ha il pelo e allatta?\r\n"
				+ "	2.Ha le penne e depone le uova?\r\n"
				+ "	3.Ha le scaglie e può strisciare o camminare?\r\n"
				+ "	4.Può vivere sia in acqua che sulla terra?\r\n"
				+ "	5.Ha le scaglie e vive in acqua?\r\n"
				+ "");
		
				
		numeroCategoria=Integer.parseInt(sc.nextLine());
		switch(numeroCategoria)
		{
			case 1:
		    mammiferi.add(risposta);
			break;
			case 2:
			uccelli.add(risposta);
			break;
			case 3:
			rettili.add(risposta);
			break;
			case 4:
			anfibi.add(risposta);
			break;
			case 5:
			pesci.add(risposta);
			break;
			default:
			System.out.println("numero inserito non valido");
		}
		}
			
		
		System.out.println("vuoi inserire un altro animale?(s/n)");
	      risposta2=sc.nextLine();
		}while(risposta2.equals("s"));
		
		
		if(mammiferi.size()>0)
		{
		System.out.println("tra i mammiferi ci sono:");
		for(int i=0;i<mammiferi.size();i++)
		{
		System.out.println(mammiferi.get(i));
		
		}
		
	}
		
		if(uccelli.size()>0)
		{
		System.out.println("tra gli uccelli ci sono:");
		for(int i=0;i<uccelli.size();i++)
		{
		System.out.println(uccelli.get(i));
		
		}
		
	}
		
		if(rettili.size()>0)
		{
		System.out.println("tra i rettili ci sono:");
		for(int i=0;i<rettili.size();i++)
		{
		System.out.println(rettili.get(i));
		
		}
		
	}
		
		if(anfibi.size()>0)
		{
		System.out.println("tra gli anfibi ci sono:");
		for(int i=0;i<anfibi.size();i++)
		{
		System.out.println(anfibi.get(i));
		
		}
		
	}
		
		if(pesci.size()>0)
		{
		System.out.println("tra i pesci ci sono:");
		for(int i=0;i<pesci.size();i++)
		{
		System.out.println(pesci.get(i));
		
		}
		
	}
		
		}
}
		
	

