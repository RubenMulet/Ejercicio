# Ejercicio
<dl>1- Clases</dl>
 Una clase en java es una plantilla en la cual creamos objetos del mismo tipo de la clase, los cuales seran utilizados más
  adelante para ser abstraidos y usados posteriormente. Dentro de una clase deben haber otros atributos que son los que caracterizan
  esa clase, como podría ser la clase profesor.
  Ejemplo:
  
  ```java
  public static Profesor(){
  }
  ```
 
  
  <dl>2- Objetos<dl/>
  <dt>Lo primero que debemos saber del objeto es que no se trata de un objeto en si, no es algo fisico como podría ser el ratón que tienes
  en la mano, en verdad es algo diferente, existente dentro de una clase. Un objeto es una entidad usada en la memoria que contiene
  propiedades y atributos, incluso operaciones llamadas métodos.
  Ejemplo:
  public Coche(String matricula, String color, double contKm){
  this.matricula=matricula;
  this.color=color;
  this.contKm=contaKm;
  }
  </dt>
  
  <dl>3- Sobrecarga de métodos<dl/>
  <dt>Para comprender que es la sobrecarga de métodos, primero debemos comprender que es un método, que básicamente es una operación;
  ya sea lógica o aritmetico. Bien, una simple operación, pudiendo haber más de una en un método; ahora bien, un método sobrecargada
  en principio se debe saber que es bastante normal ser usado, sencillamente consiste en que en una clase haya más de un método
  pero con distintas funciones, osea, parametros con los que interactua como un int, double o char
  Ejemplo:
  public static calcularCoste(double x){
  return x*2;
  }
  public static calcularCoste(int y){
  return y/2;
  }
  <dt/>
  
  <dl>4- Herencia</dl>
  <dt>Ah, la herencia, ese tema de final del curso pasado que como bien indicaba su nombre consistia en que una clase hija heredase 
  las propiedades de su clase padre, una clase con varios objetos podrian ser heredados en una segunda clase sin necesidad de
  estar escritos en su código. Esto se conseguia mediante una sencilla línea "extends clasePadre". Cabe resaltar que la clase hija
  podía tener sus propios atributos. Además, una clase hija también puede dejar "herencia" a otras que la extiendan.
  Ejemplo:
  public static Padre(){
  atributoHereditario 1;
  atributoHereditario 2...
  }
  clase Hijo extends Padre(){
  atributoPropio();
  }
  <dt/>
  
  <dt>5- Polimorfismo<dl/>
  <dt>La palabra en si, "polimorfismo" significa muchas formas. Si, como indica, es una clase que también está ligada a la herencia
  ya que hereda muchas cualidades de la clase padre, bueno todas. La diferencia es que esta clase es abstracta, no se puede instanciar
  es como si realmente no existiese, pero a su vez se pueden heredar sus propieades. La clave del polimorfismo es que la clase que parte
  de la clase abstracta puede adoptar muchas formas a partir de ella.
  public abstract Campeones(){
  (stributos)
  }
  public clase1(){
  atributos
  super(atributos abstract);
  }<dt/>
  
  <dl>6- Interface<dl/>
  <dt>Las interfaces con java son colecciones de metodos y propiedades constantes y a diferencia de las clases abstractan nos
  brindan un mecanismo de encapsulación. En verdad es bastante parecido a los metodos pues son una lista de funciones, tambien con
  una diferencia: no existe su codigo, solo son una serie de funciones.</dt>
