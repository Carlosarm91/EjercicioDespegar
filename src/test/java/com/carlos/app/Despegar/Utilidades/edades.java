package com.carlos.app.Despegar.Utilidades;

public class edades {
	String edad;
	
	public String edad () {
		 int num = (int) Math.floor(Math.random()*6+1);
		 if (num ==1)
		  return edad= num+" año";
		 else 
		  return edad= num+" años";
	} 
}
