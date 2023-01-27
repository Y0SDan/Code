interface Figura{
	public void dibuja();
}

 abstract class Figura2D implements Figura{
	abstract public int area();
} 
 abstract class Figura3D implements Figura{
	abstract public int area();
	abstract public int volumen();
}

class Rectangulo extends Figura2D{
	private int x,y;
	public void dibuja(){
		System.out.println("Dibujando...");
	}

	public Rectangulo(int x, int y){
		this.x = x;
		this.y = y;
	}

	public int area(){
		return x * y;
	}
}

class Box extends Figura3D{
	private int x;
	public void dibuja(){
		System.out.println("Dibujando...");
	}

	public Box(int x){
		this.x = x;
	}

	public int area(){
		return x * 6;
	}
	public int volumen(){
		return x * x * x;
	}
}

public class Figuras{
	public static void main(String[] args){
		Figura []f = {new Rectangulo(5,7), new Rectangulo(2,8), new Box(4), new Box(5)};

		for(Figura figura: f){
			figura.dibuja();
			if(figura instanceof Figura2D){
				System.out.println("area: " + ((Figura2D)figura).area());
			}
            if(figura instanceof Figura3D){
				System.out.println("area: " + ((Figura3D)figura).area());if(figura instanceof Figura2D){
				System.out.println("volumen: " + ((Figura3D)figura).volumen());
			}
			}
		}


	}
}