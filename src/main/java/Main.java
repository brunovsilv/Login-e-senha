import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      
        System.out.println("seu login");
        String login = sc.next();
if (login.equals("admin")) { 
  System.out.println("digite sua senha"); 
  int senha = sc.nextInt();
            if (senha == 7788) {
                System.out.println("Bem vindo, admin");
              
            } else {
     System.out.println("Senha invalida");          
            }
        } else if (login.equals("financeiro")) {
            System.out.println("digite sua senha"); 
  int senha = sc.nextInt();
            if (senha == 9087) {             System.out.println("Boas vindas de volta financeiro");
                               
            } else {                System.out.println("senha invalida");
            }
        } else if (login.equals("cliente")) {          System.out.println("digite sua senha"); 
                                             int senha = sc.nextInt();
if (senha == 1237) {              System.out.println("Boas vindas de volta cliente");
            } else {
                System.out.println("senha invalida");
}
                                            } else {     System.out.println("usario não reconehcido");
        }
        sc.close();
    }
}