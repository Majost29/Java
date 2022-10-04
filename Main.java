import java.util.Scanner;
class Main {
  public static void main(String[] args) {
      int a=1;
      int b=10;
      int resultado;
      int opcion;
    Scanner nombreObjeto = new Scanner (System.in);
      System.out.println("1.Suma");
      System.out.println("2.Resta");
      System.out.println("3.Multiplicación");
      System.out.println("4.División");
      opcion= nombreObjeto.nextInt();
      if(opcion>=1 && opcion<=4){
        
      }else{
        System.out.println("La opción ingresada no es correcta");
      }
        // (opcion >=0 && opcion >=4)?"0":""

    switch (opcion){
      case 1:{
        resultado=a+b;
        System.out.println("El resultado es;"+resultado);
      }break;
      case 2:{
        resultado=a-b;
        System.out.println("El resultado es;"+resultado);
      }break;
      case 3:{
        resultado=a*b;
        System.out.println("El resultado es;"+resultado);
      }break;
      case 4:{
        resultado=a/b;
        System.out.println("El resultado es;"+resultado);
      }break;
    }
  }
}