import java.util.Scanner;

public class Main{
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args){
		
	
	Knight knight = new Knight("",0,0);
	Wizard wizard = new Wizard("",0,0);
	Assassin assassin = new Assassin("",0,0);
	int nr = 0;
	
	System.out.println("**Game Of sword**");
	
	do{
	entery();
	
	nr = choise();
	
	switch(nr){
		case 1-> knight =  knightInfo();
		case 2-> wizard =  wizardInfo();
		case 3-> assassin =  assassinInfo();
		case 4-> showFighters(knight,wizard,assassin);	
		case 5-> battle(knight,wizard,assassin);
		case 0 -> thanks();
			
		
	}
	}while(nr!=0);
	
	
	
	}
	
	
	
	
	
	public static void entery(){
		
		
		System.out.println("*******************");
		System.out.println("1. Create Knight");
		System.out.println("2. Create Wizard");
		System.out.println("3. Create Assassin");
		System.out.println("4. Show Fighters");
		System.out.println("5. Battle 1v1");
		System.out.println("0. EXIT");
		System.out.println("*******************");
			
	}
	
	
	public static int choise(){
		
		int nr = 0;
		do{
		System.out.println("Play (Choise:0-5):");
		nr = scan.nextInt();
		scan.nextLine();
		}
		while(nr>5 || nr<0);
		return nr;
	}
	
	public static Knight knightInfo(){
	
		
		String name = "";
		int health = 0;
		int armor = 0;
		
		System.out.println("Let's create knight together : ");
		System.out.print("Name the knight : ");
		name = scan.nextLine();
		do{
		System.out.print("Give him the HEALTH (>50 and <100 ) : ");
		health = scan.nextInt();
		}while(health<50 || health>100);
		do{
		System.out.print("Give him the hp for ARMOR (>15 and <35) : ");
		armor = scan.nextInt();
		}while(armor<15 || armor>40);
		
		
		Knight knight = new Knight(name,health,armor);
		return knight;
		
	
	
	}
	
	public static Wizard wizardInfo(){
		
		
		String name = "";
		int health = 0;
		int fire = 0;
		
		System.out.println("Let's create Wizard together : ");
		System.out.print("Name the Wizard : ");
		name = scan.nextLine();
		do{
		System.out.print("Give him the HEALTH (>50 and <100 ) : ");
		health = scan.nextInt();
		}while(health<50 || health>100);
		do{
		System.out.print("Give him the hp for FIRE ATACK(>15 and <35) : ");
		fire = scan.nextInt();
		}while(fire<15 || fire>40);
		
		
		Wizard wizard = new Wizard(name,health,fire);
		return wizard;
		
	
	
	}
	
	public static Assassin assassinInfo(){
		
		
		String name = "";
		int health = 0;
		int punch = 0;
		
		System.out.println("Let's create Assassin together : ");
		System.out.print("Name the Assassin : ");
		name = scan.nextLine();
		do{
		System.out.print("Give him the HEALTH (>50 and <100 ) : ");
		health = scan.nextInt();
		}while(health<50 || health>100);
		do{
		System.out.print("Give him the hp for PUNCH ATACK(>15 and <35) : ");
		punch = scan.nextInt();
		}while(punch<15 || punch>40);
		
		
		Assassin assassin = new Assassin(name,health,punch);
		return assassin;
		
	
	
	}
	
	
	public static void showFighters(Knight knight,Wizard wizard,Assassin assassin){
		knight.showStats();
		wizard.showStats();
		assassin.showStats();
		
	}
	
	public static void battle(Knight knight,Wizard wizard,Assassin assassin){
		
		String p1= "";
		String p2="";
		
		System.out.println("Choise(knight,wizard,assassin) : ");
		System.out.print("First Palyer : ");
		p1 = scan.next();
		System.out.print("Second Player : ");
		p2 = scan.next();
		
		if(p1.toLowerCase().equals("knight") ){
			if( p2.toLowerCase().equals("wizard")){
				b1(knight,wizard);//knight vs wizard
			}
			else{
				b2(knight,assassin);//knight vs assassin
			}
		}
		else if(p2.toLowerCase().equals("knight")){
			if(p1.toLowerCase().equals("wizard") ){
				b3(wizard,knight);//assassin vs knight
			}
			else{
				b4(wizard, assassin);//wizard vs knight
			}
		}
		
	}
	
	static void b1(Knight knight,Wizard wizard){
		
		System.out.println("******************");
		System.out.println("KNIGHT VS WIZARD");
		
		int win = (knight.ready() +knight.extraAttack()) - 
				(wizard.ready()+ wizard.extraAttack());
			
		if(win>0){
			System.out.println("The winer is Knight with "+win+" hp left.");
		}
		else{
			System.out.println("The winer is Wizard with "+Math.abs(win)+" hp left.");
		}
		System.out.println("******************");
	}
	
	static void b2(Knight knight,Assassin assassin){
		
		System.out.println("******************");
		System.out.println("KNIGHT VS ASSASSIN");
		
		int win = (knight.ready() +knight.extraAttack()) - 
				(assassin.ready()+ assassin.extraAttack());
			
		if(win>0){
			System.out.println("The winer is Knight with "+win+" hp left.");
		}
		else{
			System.out.println("The winer is Assassin with "+Math.abs(win)+" hp left.");
		}
		System.out.println("******************");
	}
	
	static void b3(Wizard wizard,Knight knight){
		
		System.out.println("******************");
		System.out.println("WIZARD VS KNIGHT");
		
		int win = (wizard.ready()+ wizard.extraAttack()) - 
				(knight.ready() +knight.extraAttack());
			
		if(win>0){
			System.out.println("The winer is Wizard with "+win+" hp left.");
		}
		else{
			System.out.println("The winer is Knight with "+Math.abs(win)+" hp left.");
		}
		System.out.println("******************");
	}
	
	static void b4(Wizard wizard,Assassin assassin){
		
		System.out.println("******************");
		System.out.println("WIZARD VS ASSASSIN");
		
		int win = (wizard.ready()+ wizard.extraAttack()) - 
				(assassin.ready()+ assassin.extraAttack());;
			
		if(win>0){
			System.out.println("The winer is Knight with "+win+" hp left.");
		}
		else{
			System.out.println("The winer is Assassin with "+Math.abs(win)+" hp left.");
		}
		System.out.println("******************");
	}
	
	
	
	static void thanks(){
		
		String message = "Have a nice day ! ";
		
		System.out.print("Do you what to rate the game (yes/no): ");
		String answer = scan.next();
		
		if(answer.toLowerCase().equals("yes")){
			rate(message);
		}
		else{
			System.out.println(message);
		}
		
	}
	
	static void rate(String message){
		
		String rateMessage = "";
		int rate1 = 0;
		System.out.println("Did you enjoy the game : ");
		
		do{
		System.out.println("RATE (1-10): ");
		rate1 = scan.nextInt();
		}while(rate1>10 || rate1<1);
		
		switch(rate1){
			case 1:
			case 2:
			case 3: 
			case 4: rateMessage = "Seem that you didn't like the game !";
			break;
			case 5:
			case 6:
			case 7:
			case 8:	rateMessage = "Seem that you enjoy the game !";
			break;
			case 9:
			case 10: rateMessage = "Seem that you enjoy so much plaing the game !";
			break;
			
		}
		System.out.println(rateMessage+"\n"+message);
	}
}