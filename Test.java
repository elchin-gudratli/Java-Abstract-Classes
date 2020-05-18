package com.bilgeadam.abstracts;

public class Test {

	public static void main(String[] args) {
         
		GenelMudur gm=new GenelMudur();
		
		Mudur m=new Mudur();
		
		Programci  p=new Programci();
		
		Stajyer    s=new Stajyer();
		
		int toplam=0;
		
		toplam=gm.MaasiNedir()+m.MaasiNedir()+p.MaasiNedir()+s.MaasiNedir();
		
		System.out.println("Toplam Maas: "+toplam);
		
	}

}
