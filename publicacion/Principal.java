package publicacion;
import java.util.Scanner;
// NO SE REALIZO EL CAMBIO DE ARREGLO
public class Principal {
   public static void main(String[] args) {
      int ctrlpub = 0, opc = 0, ref = 0;
      Object publicaciones [] = new Object[10];
      Scanner leer = new Scanner(System.in);
      do{
         ref = 10-ctrlpub;
         System.out.println("/////-MENU-/////");
         System.out.println("\n[1] Dar de alta una publicacion [" + ref + " espacios disponibles]");
         System.out.println("[2] Mostrar publicaciones");
         System.out.println("[3] Salir");
         opc = leer.nextInt();
         leer.nextLine();
         switch(opc){
            case 1:
               if(ref==0){
                  System.out.println("No queda espacios disponibles para publicar\nPor favor de enter");
                  leer.nextLine();
               }else{
                  int op = 0;
                  System.out.println("\n\n\n[1] Revista");
                  System.out.println("[2] Periodico");
                  System.out.println("[3] Libro");
                  op = leer.nextInt();
                  leer.nextLine();
                  switch(op){      
                     case 1:
                        try{
                           Revista revista = new Revista();
    
                           System.out.println("\n\n\nIngrese el ISSN:");
                           revista.setISSN(leer.nextLine());
                           
                           System.out.println("Ingresa el Titulo:");
                           revista.setTitulo(leer.nextLine());
                           
                           System.out.println("Ingrese el Precio:");
                           revista.setPrecio(leer.nextDouble());
                           
                           System.out.println("Ingresa el Numero de Revista:");
                           revista.setNumero(leer.nextInt());
                        
                           System.out.println("Ingrese el Anio: ");
                           revista.setAnio(leer.nextInt());
                           
                           System.out.println("Ingresa el Numero de Paginas:");
                           revista.setNumpag(leer.nextInt());
                           leer.nextLine();
                            
                           publicaciones[ctrlpub] = revista;
                           ctrlpub++;
                        }catch(Exception e){
                           System.out.println("Por favor no ingrese valores invalidos");
                           leer.nextLine();
                        }
                        break;
                     case 2: 
                           Periodico periodico = new Periodico();
                         
                           System.out.println("Ingrese la Seccion: ");
                           periodico.setSecciones(leer.nextLine());
                           
                           System.out.println("Ingrese el Editor: ");
                           periodico.setEditor(leer.nextLine());
                           publicaciones [ctrlpub] = periodico;
                           ctrlpub++;
                        break;
                     case 3:
                        try{
                           Libro libro = new Libro();
                   
                           System.out.println("Ingrese ISBN: ");
                           libro.setISBN(leer.nextLine());
                           
                           System.out.println("Ingrese el Titulo: ");
                           libro.setTitulo(leer.nextLine());
                           
                           System.out.println("Ingrese el Autor: ");
                           libro.setAutor(leer.nextLine());
                           
                           System.out.println("Ingrese la Edicion: ");
                           libro.setEdicion(leer.nextLine());
                           
                           System.out.println("ingresa el Precio: ");
                           libro.setPrecio(leer.nextDouble());
                           
                           System.out.println("Ingresa el Numero de Paginas: ");
                           libro.setNumpag(leer.nextInt());
                           
                           publicaciones [ctrlpub] = libro;
                           ctrlpub++;
                        }catch(Exception e){
                           System.out.println("Por favor no ingrese valores invalidos");
                           leer.nextLine();
                        }
                        break;
                     default:
                        System.out.println("Ingrese una opción valida...\n[Enter para continuar]\n\n\n\n");
                        leer.nextLine();          
                        
                  }
               }
               break;
            case 2:
               for(int i = 0; i < ctrlpub; i ++ ){
                  System.out.println("  " + publicaciones [i].getClass());
                  if(publicaciones[i] instanceof Revista){
                     Revista rev = new Revista();
                     rev = (Revista)publicaciones[i];
                     System.out.println("----REVISTA----");
                     System.out.println("ISSN: " + rev.getISSN());
                     System.out.println("TITULO: " + rev.getTitulo());
                     System.out.println("PRECIO: " + rev.getPrecio());
                     System.out.println("NUMERO DE REVISTA: " + rev.getNumero());
                     System.out.println("ANIO: " + rev.getAnio());
                     System.out.println("NUMERO PAGINAS:  " + rev.getNumpag()); 
                     System.out.println("PERIODICIDAD: " + rev.getPeriodicidad());         
                  }else if (publicaciones [i] instanceof Libro ){
                     Libro lib = new Libro();
                     lib = (Libro)publicaciones[i];
                     System.out.println("---LIBRO---");
                     System.out.println("ISBN: " + lib.getISBN());
                     System.out.println("TITULO: " + lib.getTitulo());
                     System.out.println("AUTOR: " + lib.getAutor());
                     System.out.println("PRECIO: " + lib.getPrecio());
                     System.out.println("EDICION: " + lib.getEdicion());
                     System.out.println("NUMERO DE PAGINAS :  " + lib.getNumpag());
                  }else if (publicaciones [i] instanceof Periodico ){
                     Periodico peri = new Periodico();
                     peri = (Periodico)publicaciones[i];
                     System.out.println("---PERIODICO---");
                     System.out.println("SECCION: " + peri.getSecciones());
                     System.out.println("EDITOR: " + peri.getEditor());
                     System.out.println("PERIODICIDAD: " + peri.getPeriodicidad());
                     
                  }
               }
               break;
            case 3:
               System.out.print("\n\n\n\nPeregrino Lopez Pedro Emmanuel");
               break;
            default :
               System.out.println("Ingrese una opción valida...\n[Enter para continuar]\n\n\n\n");
               leer.nextLine();
               
         }
      }while(opc!=3);     
   }
}