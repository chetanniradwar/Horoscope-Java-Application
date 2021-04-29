/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package astrologyjava;
/**
 *
 * @author vaibhav
 */

class Astrologyjava
{   
static String astro_sign(int day,int month)
{
    String astro_sign=null; 
    if (month ==12){ 
          
        if (day < 22) 
    astro_sign = "SAGITTARIUS"; 
        else
    astro_sign ="CAPRICORN"; 
    } 
          
    else if (month == 1){ 
        if (day < 20) 
     astro_sign = "CAPRICORN"; 
        else
    astro_sign = "AQUARIUS"; 
    } 
          
    else if (month == 2){ 
        if (day < 19) 
    astro_sign = "AQUARIUS"; 
        else
    astro_sign = "PISCES"; 
    } 
          
    else if(month == 3){ 
        if (day < 21)  
    astro_sign = "PISCES"; 
        else
    astro_sign = "ARIES"; 
    } 
    else if (month == 4){ 
        if (day < 20) 
    astro_sign = "ARIES"; 
        else
    astro_sign = "TAURUS"; 
    } 
          
    else if (month == 5){ 
        if (day < 21) 
    astro_sign = "TAURUS"; 
        else
    astro_sign = "GEMINI"; 
    } 
          
    else if( month == 6){ 
        if (day < 21) 
    astro_sign = "GEMINI"; 
        else
    astro_sign = "CANCER"; 
    } 
          
    else if (month == 7){ 
        if (day < 23) 
    astro_sign = "CANCER"; 
        else
    astro_sign = "LEO"; 
    } 
          
    else if( month == 8){ 
        if (day < 23)  
    astro_sign = "LEO"; 
        else
    astro_sign = "VIRGO"; 
    } 
          
    else if (month == 9){ 
        if (day < 23) 
    astro_sign = "VIRGO"; 
        else
    astro_sign = "LIBRA"; 
    } 
          
    else if (month == 10){ 
        if (day < 23) 
    astro_sign = "LIBRA"; 
        else
    astro_sign = "SCORPIO"; 
    } 
          
    else if (month == 11){ 
        if (day < 22) 
    astro_sign = "SCORPIO"; 
        else
   astro_sign = "SAGITTARIUS"; 
    } 
    return astro_sign;    
     
} 
static String birthstone(int month)
{    
 	String stone=null;
switch(month){
case 1: stone="GARNET";break;
case 2: stone="AMETHYST";break;
case 3: stone="AQUAMARINE";break;
case 4: stone="DIAMOND";break;
case 5: stone="EMERALD";break;
case 6: stone="PEARL";break;
case 7: stone="RUBY";break;
case 8: stone="PERIDOT";break;
case 9: stone="SAPPHIRE";break;
case 10: stone="OPAL";break;
case 11: stone="TOPAZ";break;
case 12: stone="TANZANITE";break;
}
return stone;
}
static int luckyno(int day,int month,int year)
{       
     int x=(day*1000000+month*10000+year);
         int s=0;
	while(x!=0)
	{
		
	int r=x%10;
       
	s=s+r;
	x=x/10;
}
 int unit=s%10;
 int ten=s/10;
 int lucky=unit +ten;
 
    return lucky;
}
static String color(int x)
{
	 
         String color=null;
	switch(x)
	{
		case 1:color="YELLOW";break;
		case 2:color="BLUE";break;
		case 3:color="PURLPE";break;
		case 4: color="RED";break;
		case 5: color="ORANGE";break;
		case 6:color="GREEN";break;
		case 7: color="PALE GREY";break;
		case 8: color="LIGHT BLUE";break;
		case 9: color="BROWN";break;
		case 10: color="MAROON";break;
		case 11:color="WHITE";break;
		case 12:color="VIOLET";break;
	}
        return color;
}

 static String moonsign(String name)
  {	

	
	String moon=null;
	

	if("Che".equalsIgnoreCase(name.substring(0,3))||"Cho".equalsIgnoreCase(name.substring(0,3))||"La".equalsIgnoreCase(name.substring(0,3))||"le".equalsIgnoreCase(name.substring(0,2))||"lo".equalsIgnoreCase(name.substring(0,2))||"Li".equalsIgnoreCase(name.substring(0,2))||name.charAt(0)=='A')
	{
		moon="MESH";
	}
	else if(name.charAt(0)=='U'||name.charAt(0)=='E'||name.charAt(0)=='O'||"Vee".equalsIgnoreCase(name.substring(0, 3))||"Va".equalsIgnoreCase(name.substring(0,2))||"Vu".equalsIgnoreCase(name.substring(0,2))||"Ve".equalsIgnoreCase(name.substring(0,2))||"Vo".equalsIgnoreCase(name.substring(0,2)))
	{
		moon="VRISHABHA";
	}
	else if("Ka".equalsIgnoreCase(name.substring(0,3))||"Kee".equalsIgnoreCase(name.substring(0,3))||"Ki".equalsIgnoreCase(name.substring(0,2))||"Gha".equalsIgnoreCase(name.substring(0,3))||"Ku".equalsIgnoreCase(name.substring(0,2))||"Ing".equalsIgnoreCase(name.substring(0,3))||"Ko".equalsIgnoreCase(name.substring(0,2))||"Ke".equalsIgnoreCase(name.substring(0,2))||"Chha".equalsIgnoreCase(name.substring(0,3)))
	{
		moon="MITHUN";
	}
	else if("hi".equalsIgnoreCase(name.substring(0,3))||"hee".equalsIgnoreCase(name.substring(0,3))||"hu".equalsIgnoreCase(name.substring(0,2))||"ho".equalsIgnoreCase(name.substring(0,2))||"Daa".equalsIgnoreCase(name.substring(0,3))||"Dee".equalsIgnoreCase(name.substring(0,3))||"Doo".equalsIgnoreCase(name.substring(0,3))||"Du".equalsIgnoreCase(name.substring(0,2))||"De".equalsIgnoreCase(name.substring(0,3)))
	{
		moon="KARKA";
	}
	else if("Ma".equalsIgnoreCase(name.substring(0,3))||"Mi".equalsIgnoreCase(name.substring(0,2))||"Mee".equalsIgnoreCase(name.substring(0,3))||"Mu".equalsIgnoreCase(name.substring(0,3))||"Me".equalsIgnoreCase(name.substring(0,2))||"Mo".equalsIgnoreCase(name.substring(0,2))||"Ti".equalsIgnoreCase(name.substring(0,3))||"Tee".equalsIgnoreCase(name.substring(0,3))||"Tu".equalsIgnoreCase(name.substring(0,3))||"Taa".equalsIgnoreCase(name.substring(0,3))||"Te".equalsIgnoreCase(name.substring(0,2)))
	{
		moon="SINH";
	}
        else if("Ra".equalsIgnoreCase(name.substring(0,3))||"Ree".equalsIgnoreCase(name.substring(0,3))||"Re".equalsIgnoreCase(name.substring(0,2))||"Che".equalsIgnoreCase(name.substring(0,3))||"Tu".equalsIgnoreCase(name.substring(0,2))||"Tru".equalsIgnoreCase(name.substring(0,3))||"Ro".equalsIgnoreCase(name.substring(0,2))||"shi".equalsIgnoreCase(name.substring(0,3))||"su".equalsIgnoreCase(name.substring(0,2)))
	{
		moon="TULA";
	}
	else if("Pa".equalsIgnoreCase(name.substring(0,3))||"Pee".equalsIgnoreCase(name.substring(0,3))||"Pu".equalsIgnoreCase(name.substring(0,3))||"Sha".equalsIgnoreCase(name.substring(0,3))||"Pe".equalsIgnoreCase(name.substring(0,2))||"Taa".equalsIgnoreCase(name.substring(0,3))||"Po".equalsIgnoreCase(name.substring(0,2))||"To".equalsIgnoreCase(name.substring(0,2))||"Na".equalsIgnoreCase(name.substring(0,2)))
	{
		moon="KANYA";
	}
	
	else if("Na".equalsIgnoreCase(name.substring(0,2))||"Nee".equalsIgnoreCase(name.substring(0,3))||"Ni".equalsIgnoreCase(name.substring(0,2))||"Nu".equalsIgnoreCase(name.substring(0,2))||"Ne".equalsIgnoreCase(name.substring(0,2))||"Ya".equalsIgnoreCase(name.substring(0,2))||"Yee".equalsIgnoreCase(name.substring(0,3))||"Yu".equalsIgnoreCase(name.substring(0,2)))
	{
		moon="VRUSHCIK";
	}
	else if("Ye".equalsIgnoreCase(name.substring(0,2))||"Yo".equalsIgnoreCase(name.substring(0,2))||"Bha".equalsIgnoreCase(name.substring(0,3))||"Bhu".equalsIgnoreCase(name.substring(0,3))||"Dha".equalsIgnoreCase(name.substring(0,3))||"Bhe".equalsIgnoreCase(name.substring(0,3))||"Pha".equalsIgnoreCase(name.substring(0,3))||"Bhi".equalsIgnoreCase(name.substring(0,3)))
	{
	moon="DHANU";
	}
	else if("Bho".equalsIgnoreCase(name.substring(0,3))||"Ja".equalsIgnoreCase(name.substring(0,3))||"Ji".equalsIgnoreCase(name.substring(0,3))||"Jee".equalsIgnoreCase(name.substring(0,3))||"Khi".equalsIgnoreCase(name.substring(0,3))||"Ga".equalsIgnoreCase(name.substring(0,3))||"Gee".equalsIgnoreCase(name.substring(0,3))||"Gi".equalsIgnoreCase(name.substring(0,3)))
	{
	moon="MAKAR";
	}
	else if("Gu".equalsIgnoreCase(name.substring(0,2))||"Ge".equalsIgnoreCase(name.substring(0,2))||"Go".equalsIgnoreCase(name.substring(0,2))||"Sa".equalsIgnoreCase(name.substring(0,2))||"See".equalsIgnoreCase(name.substring(0,3))||"Da".equalsIgnoreCase(name.substring(0,2))||"Si".equalsIgnoreCase(name.substring(0,2))||"Su".equalsIgnoreCase(name.substring(0,2)))
	{
		moon="KUMBHA";
	}
	else if("Do".equalsIgnoreCase(name.substring(0,3))||"Di".equalsIgnoreCase(name.substring(0,2))||"Dee".equalsIgnoreCase(name.substring(0,3))||"Du".equalsIgnoreCase(name.substring(0,2))||"Th".equalsIgnoreCase(name.substring(0,2))||"Jh".equalsIgnoreCase(name.substring(0,2))||"Yn".equalsIgnoreCase(name.substring(0,3))||"De".equalsIgnoreCase(name.substring(0,2))||"Du".equalsIgnoreCase(name.substring(0,2))||"Cha".equalsIgnoreCase(name.substring(0,3))||"Chi".equalsIgnoreCase(name.substring(0,3)))
	{
		moon="MEEN";

    }
    return moon;
  	
  }
}
  

    

