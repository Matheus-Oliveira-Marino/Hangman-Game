/**
 * Classe principal que representa o jogo da forca.
 */
public class Forca
{
    /**
     * Método principal que inicia o jogo da forca.
     * 
     * @param args Os argumentos da linha de comando (não utilizados).
     */
    public static void main (String args [])
    {
        // Variável que pega a escolha do jogador no final da partida.
        char continuar = ' ';


         // Loop principal do jogo, permite jogar várias vezes.
        do
        {
            // Obtém uma palavra sorteada do banco de palavras
            Palavra palavra =
                    BancoDePalavras.getPalavraSorteada();

            // Inicializa os tracinhos para a palavra sorteada        
            Tracinhos tracinhos = null;
            try
            {
                tracinhos = new Tracinhos (palavra.getTamanho());
            }
            catch (Exception erro)
            {}

            // Controla as letras já digitadas
            ControladorDeLetrasJaDigitadas
                    controladorDeLetrasJaDigitadas =
                    new ControladorDeLetrasJaDigitadas ();

            // Controla os erros do jogador
            ControladorDeErros controladorDeErros = null;
            try
            {
                controladorDeErros = new ControladorDeErros ((int)(palavra.getTamanho()*0.6));
            }
            catch (Exception erro)
            {}

             // Loop do jogo, continua enquanto houver tracinhos e 
             // o jogador não atingir o limite de erros.
            while (tracinhos.isAindaComTracinhos() &&
                    !controladorDeErros.isAtingidoMaximoDeErros())
            {
                System.out.println ("Palavra...: "+tracinhos);
                System.out.println ("Digitadas.: "+controladorDeLetrasJaDigitadas);
                System.out.println ("Erros.....: "+controladorDeErros);

                try
                {
                    System.out.print   ("Qual letra? ");
                    char letra = Character.toUpperCase (Teclado.getUmChar());

                    // Verifica se a letra já foi digitada.
                    if (controladorDeLetrasJaDigitadas.isJaDigitada (letra))
                        System.err.println ("Essa letra ja foi digitada!\n");
                    else
                    {
                        controladorDeLetrasJaDigitadas.registre (letra);

                       // Obtém a quantidade de ocorrências da letra na palavra
                       int qtd = palavra.getQuantidade (letra);

                        if (qtd==0)
                        {
                           System.err.println ("A palavra nao tem essa letra!\n");
                            controladorDeErros.registreUmErro ();
                       }
                        else
                       {
                            // Revela as letras na palavra
                            for (int i=0; i < qtd; i++)
                            {
                                int posicao = palavra.getPosicaoDaIezimaOcorrencia (i,letra);
                                tracinhos.revele (posicao, letra);
                            }
                            System.out.println ();
                        }
                    }
                }
                catch (Exception erro)
                {
                    System.err.println (erro.getMessage());
                } }

            // Verifica o resultado do jogo    
            if (controladorDeErros.isAtingidoMaximoDeErros ())
                System.out.println ("Que pena! Voce perdeu! A palavra era "+palavra+"\n");
            else // !tracinhos.isAindaComTracinhos()
                System.out.println ("Parabens! Voce ganhou! A palavra era mesmo "+palavra+"\n");

            // Pergunta se o jogador deseja jogar novamente.    
            for(;;)
            {
                try
                {
                  System.out.print ("Deseja jogar de novo (S/N)? ");
                    continuar = Character.toUpperCase (Teclado.getUmChar());
                    if (continuar!='S' && continuar!='N')
                     System.err.println ("Opcao invalida! Tente novamente...");
                    else
                        break;
                }
                catch (Exception erro)
                {
                    System.err.println ("Opcao invalida! Tente novamente...");
                }
            }
       }
       while (continuar=='S');
   }
}
