package yrok1_zadanie1;

public class Main {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
	// String breed, String sex, String name, byte age, String colour 
    Cat Kristal=new Cat("Briton",true,"Kristal",5,"grey");
    Cat Murka=new Cat("Siberia",false,"Murka",10,"black");
    Cat Mustang=new Cat("Pers",true,"Mustang",20,"orange");
    Mustang.catEat();
    
    Kristal.catGo();
    System.out.println();
    Murka.catGo();
    
	}

}
