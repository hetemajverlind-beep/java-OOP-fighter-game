public class Knight extends Fighter{

int armor;

	Knight(String name, int health, int armor){
		super(name,health);
		this.armor = armor;
		
	}
	@Override
	void showStats(){
		
		System.out.println("Knight named "+this.name+" has "+this.health+" hp and extra "+this.armor+" hp from the armor.");
		
	}
	
	int extraAttack(){
		return this.armor;
	}
	
}