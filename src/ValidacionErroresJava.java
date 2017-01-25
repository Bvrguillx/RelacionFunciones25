import java.util.Scanner;

public class ValidacionErroresJava {

public static void main(String[] args) {
               
               LeerFloat();
               
       }
       
       public static float LeerFloat() {

               @SuppressWarnings("resource")
               Scanner teclado = new Scanner(System.in);
               String entrada = "";
               float num = 0;
               boolean error = false;

               do {
                       System.out.println("Introduzca numero:");
                       entrada = teclado.nextLine();

                       try {
                               num = Float.parseFloat(entrada);
                               error = false;
                               } catch (NumberFormatException ne) {
                               error = true;
                               System.out.println("Error no has introducido un numero");
                               } catch (Exception e) {
                               error = true;
                               System.out.println("Error generico, revisa la excepcion");
                               }
                       } while (error);
               
               return num;
       }
       
}