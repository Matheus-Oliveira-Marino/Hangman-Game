/**
 * Esta classe representa um banco de palavras utilizado para sortear uma palavra 
 * aleatória para o 'jogo da forca'.
 */
public class BancoDePalavras
{
     /**
     * 'Array' de 'strings' contendo as palavras disponíveis no banco.
     */
    private static String[] palavras =
            {
                    "JAVA",
                    "CLASSE",
                    "OBJETO",
                    "INSTANCIA",
                    "PUBLICO",
                    "PRIVATIVO",
                    "METODO",
                    "CONSTRUTOR",
                    "SETTER",
                    "GETTER",
                    "LUZ",
                    "PRAZER"
            };

    /**
    * Método estático para obter uma palavra sorteada aleatoriamente do banco.

    * @return Um objeto da classe Palavra representando a palavra sorteada.
    */
    
    public static Palavra getPalavraSorteada ()
    {
        Palavra palavra = null;

        try
        {
            // Seleciona uma palavra aleatória do array de palavras
            palavra = new Palavra (BancoDePalavras.palavras[(int)(Math.random() * BancoDePalavras.palavras.length)]);
        }
        catch (Exception e)
        {
             // Se ocorrer uma exceção, imprime a mensagem de erro
            System.out.println(e.getMessage());
        }

        return palavra;
    }
}
