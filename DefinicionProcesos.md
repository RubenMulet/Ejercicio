#1- Aplicación: 
Una aplicación informatica es in programa software que consiste en un diseño de herramienta para el
usuario, herramienta que sirve para ejecutar una o diversas tareas al mismo tiempo. Todo depende del tipo de aplicación
que tengamos y el uso que esta tenga. Algunos ejemplo de estas aplicaciones podrían ser los procesos de texto, calculo,
el excel...

#2- Servicio: 
Un servicio es una especie de programa que no tiene interficie gráfica, con lo cual el usuario normalmente 
no puede verlo y su función habitual consiste en ayudar a otro programa. Este servicio busca satisfacer las necesidades del
usaario mediante un conjunto de actividades que operan mediante condiciones.

#3- Proceso:
Un proceso es una pequeña parte de un programa digamos, es una instrucción. Un proceso es una instrucción de un
programa informatico que se ejecuta en una determinada situación, dependiendo sobretodo del programa. Estas instrucciones se
leen conforme se ejecuta dicho programa y eso también implica la memoria reservada para esa instrucción y sus contenidos, de 
esta forma le permitimos al pograma planificar sus instrucciones. Además, un proceso tiene un ciclo de vida con varisas fases:
  1- Ejecición: Dentro del microprocesado.
  2-Pausa: Debe realizar antes otra ejecución por algún motivo.
  3-Interrumpido: El proceso ha sido interrumpido por el usuario.
  
  ```java
  package uno;
 
//Programa que detecta si se está ejecutando el comando que le pasamos como argumento y de ser así lo termina.
 
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.IOException;
 
public class Uno {
 
    public static void main(String[] args) throws IOException, InterruptedException{
 
        try
            {
        ProcessBuilder pb = new ProcessBuilder("open","/Applications");
        pb.start();
 
            }catch(Exception e)
        {
            System.out.println("Exception " + e);
        }
 
        }
 
}
```
  
#4- Hilo: 
El hilo es algo similar a un proceso, sin embargo su nombre, "hilo" lo recibe por su finura, su liviano peso que
ejerce sobre la memoria RAM. Si empezamos varios procesos estos ocuparan el espacio que tenga que usar dentro de la memoria
RAM, sin embargo un hilo o subproceso es mucho más fácil de ejecutar. Sus teareas son encadenadas y van en secuencia una
detrás de otra. Hay que tener en cuenta que un proceso no puede acceder a los datos de otro proceso, pero los hilos si pueden
hacer esto.

```Java 
public class NumberThread extends Thread {
 
int num;
 
public NumberThread(int n){
num = n;
//setPriority(n);
}
```
#5- Programación concurrente:
La programación o computación concurrente es un conjunto de procesos o hilos que tienen una simultanedad entre ellos cuyas tareas
son interactivas. Dichas tareas se pueden ejecutar en una sola unidad central o con varios procesadores. Profundizando más en ello,
la programación concurrente trata de encontrar un equilibrio entre los procesos e hilos para que no compitan por los recursos del 
ordenador, sino para que se sincronicen entre ellos y de esa forma hacer que las tareas y ejecuciones sean más concurridas o fluidas.
```java
public class NumberRunnable implements Runnable {
    int num;
     
    public NumberRunnable(int n){
        num = n;
    }
     
    public void run(){
        for (int k=0; k < 200; k++){
            System.out.print(num);
        }
    }
}
```
#6- Computación paralela:



