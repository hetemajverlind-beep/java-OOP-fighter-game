public class Fighter{

String name;
int health;
	
	Fighter(String name,int health){
		this.name = name;
		this.health = health;
	}



	void showStats(){
		System.out.println("Knight named "+this.name+" has "+this.health+" hp ");
	}
	
	int ready(){
		
		return this.health;	
	}

}