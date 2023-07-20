package in.ashokit.Interviews;

public class ReturnCollege {
	public static void main(String[] args) {
		ReturnCollege r=new ReturnCollege();
		Collage c1 = r.getCollege();
		System.out.println(c1.id+"===="+c1.name);
	}
	
	Collage getCollege() {
		Collage c=new Collage();
		c.id=201;
		c.name="BIES";
		return c;
	}

}
class Collage{
	int id;
	String name;
}