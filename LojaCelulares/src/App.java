import java.security.DrbgParameters.NextBytes;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Pattern;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        Loja loja = new Loja();

        int op = -1;
        float totalCompra = 0;

        SimpleDateFormat formatadorData = new SimpleDateFormat("dd/MM/yyyy");
        Celular[] listaCompra = new Celular[50];

        Usuario usuario = new Usuario();
        try{
            System.out.println("Cadastro:");
            System.out.println("Nome:");
            usuario.nome = sc.nextLine();

            System.out.println("Email: ");
            String email = sc.nextLine();
            if(email.matches("[a-zA-Z_.]{5,}@([a-zA-Z]+.)+[a-zA-Z]+")){
                usuario.email = email;
            }

            System.out.println("CPF:");
            String cpf = sc.nextLine();
            if(cpf.matches("(\\d{3}.){2}\\d{3}-\\d{2}")){
                usuario.cpf = cpf;
            }

            System.out.println("Data de Nascimento: (dd/mm/aaaa)");
            String dataNascTexto = sc.nextLine();
            Date dataNasc = formatadorData.parse(dataNascTexto);
            usuario.dataNasc = dataNasc;

            usuario.calculaIdade();

        }
        catch(Exception e){
            e.printStackTrace();
        }



        do{
            
            System.out.println("Escolha um aparelho para comprar: ");
            for(int i=0; i<loja.celulares.length; i++){
                if(loja.celulares[i] != null){
                    System.out.println(loja.celulares[i].id + " - " + loja.celulares[i].nome);
                }
            }

            System.out.println();
            op = sc.nextInt();

            Celular celularCompra = new Celular();
            if(op>0 && op<=loja.celulares.length){
                System.out.println(loja.celulares[op-1].toString());
                celularCompra = loja.celulares[op-1];
            }
            
            System.err.println("Comprar?\n1-Sim\n0-Não");
            op = sc.nextInt();
            System.out.println();

            if(op==1){
                for (int i = 0; i < listaCompra.length; i++) {
                    if (listaCompra[i] == null) {
                        listaCompra[i] = celularCompra;
                        break;
                    }
                }
            }

            System.out.println("Continuar comprando?\n1-Sim\n0-Não");
            op = sc.nextInt();
            System.out.println();
        
        }while(op != 0);

        usuario.gerarRelatorio(listaCompra);        
        
    }
}
