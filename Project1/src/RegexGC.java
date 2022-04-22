import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexGC {

    private static String texto = "O 2º colocado chegou às 11h26m33s";

    public void metodoRegexGC(){
        Pattern padrao = Pattern.compile("\\d+\\w");
        Matcher matches = padrao.matcher(texto);

        while (matches.find()) {
            System.out.println("Encontrei o valor '" + matches.group() + "' na posição " + matches.start());
        }

        String[] params = {"uttoni.brandani@ges.inatel.br", "123.456.789-45", "maçã de teste"};

        for(int i=0; i<params.length; i++){
            if(validaEmail(params[i])){
                System.out.println(params[i] + " é um email");
            }

            if(validaCpf(params[i])){
                System.out.println(params[i] + " é um CPF");
            }
        }

    }


    private boolean validaEmail(String email){
        return Pattern.matches("[A-Za-z_.]+@([A-Za-z]+\\.)+[A-Za-z]+", email);
    }

    private boolean validaCpf(String cpf){
        return Pattern.matches("(\\d{3}.){2}\\d{3}-\\d\\d", cpf);
    }
}
