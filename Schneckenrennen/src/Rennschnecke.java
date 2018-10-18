import java.util.Random;

public class Rennschnecke {

  String name;
  String rasse;
  int vmax;
  int strecke;
  
  public Rennschnecke(String name, String rasse, int vmax){
	  this.name=name;
	  this.rasse=rasse;
	  this.vmax=vmax;
	  this.strecke=strecke;
  }

 public void krieche(){
	   
  Random ran = new Random();
  strecke = strecke+ran.nextInt(vmax +1);
 }
 
 public String toString(){
	 return "Name: "+name+"\n Rasse: "+rasse+"\n Höchstgeschwindigkeit: "+vmax+"\n Geschleimte Strecke: "+strecke;
 }
 
}
