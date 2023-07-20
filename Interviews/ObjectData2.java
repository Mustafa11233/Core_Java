package in.ashokit.Interviews;

public class ObjectData2 {
	public static void main(String[] args) {
		ObjectData2 e=new ObjectData2();
		Bussiness p = e.get(101);
		System.out.println(p.id+"==="+p.name);
		e.iGet();
		
	}
	
	 void iGet() {
		 System.out.println("my wish::");
	 }
	
	Bussiness get(int id) {
		Bussiness b=new Bussiness();
		if(id==101) {
			b.id=101;
			b.name="clothes bussiness";
		}else if(id ==102) {
			b.id=102;
			b.name="institute";
		}
		return b;
		
	}

}
class Bussiness{
	int id;
	String name;
}