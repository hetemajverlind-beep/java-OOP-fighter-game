public class Assassin extends Fighter{
	
	int punch;

	Assassin(String name, int health, int punch){
		super(name,health);
		this.punch = punch;
	}
	
	@Override
    void showStats(){
		System.out.println("Assassin named "+this.name+" has "+this.health+" hp and extra "+this.punch+
							" hp damage with Sword.");
	}
	
	int extraAttack(){
		return this.punch;
	}
	
}