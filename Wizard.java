public class Wizard extends Fighter{

int fire;
	Wizard(String name,int health,int fire){
			
		super(name,health);
		this.fire = fire;
	
	}
	
	@Override
    void showStats(){
		System.out.println("Wizard named "+this.name+" has "+this.health+" hp and extra "+this.fire+
							" hp damage with fire.");
	}
	
	int extraAttack(){
		return this.fire;
	}
	
}