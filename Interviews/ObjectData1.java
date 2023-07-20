package in.ashokit.Interviews;

public class ObjectData1 {
	public static void main(String[] args) {
		ObjectData1 o=new ObjectData1();
		Player player = o.get(1);
		System.out.println(player.id+"==="+player.age+"===="+player.name);
	}
	
	
	
	Player get(int id) {
		Player p=new Player();
		if(id==7) {
			p.id=7;
			p.name="Dhoni";
			p.age=45;
		}else if(id==18) {
			p.id=18;
			p.name="Kohli";
			p.age=35;
		}else if(id==45) {
			p.id=45;
			p.name="Rohit Sharma";
			p.age=40;
		}
		return p;
	}

}
class Player{
	int id;
	String name;
	int age;
}