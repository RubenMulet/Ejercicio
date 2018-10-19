//Empleado
public class Empleado {
	private String nombre;
	
	public Empleado(String nombre) {
		this.nombre=nombre;
	}
	public Empleado() {
		
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@Override
	public String toString() {
		return "Empleado " + this.nombre ;
	}
		
}

//Operario
public class Operativo extends Empleado {
	
	public Operativo(String nombre) {
		super(nombre);
	}

	@Override
	public String toString() {
		return "Empleado " + getNombre() + "-> Operativo"  ;
	}
	
}

//Directivo
public class Directivo extends Empleado {
	
	public Directivo(String nombre) {
		super(nombre);
	}

	@Override
	public String toString() {
		return "Empleado " + getNombre() + " -> Directivo" ;
	}
}

//Oficial
public class Oficial extends Operativo{

	public Oficial(String nombre) {
		super(nombre);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return  super.toString() + " -> Oficial" ;
	}
}

//Tecnico
public class Tecnico extends Operativo {

	public Tecnico(String nombre) {
		super(nombre);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return  super.toString()  +" -> Tecnico" ;
	}	
}

//Main
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empleado E1 = new Empleado("Rafa");
		Directivo D1 = new Directivo("Mario");
		Operativo OP1 = new Operativo("Alfonso");
		Oficial OF1 = new Oficial("Luis");
		Tecnico T1 = new Tecnico("Pablo");
		System.out.println(E1);
		System.out.println(D1);
		System.out.println(OP1);
		System.out.println(OF1);
		System.out.println(T1);
	}
}
