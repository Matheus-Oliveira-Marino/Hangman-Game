/**
 * Classe que representa uma palavra no jogo da forca.
 */

public class Palavra implements Comparable<Palavra>
{
    /** O texto da palavra. */
    private String texto; 

    /**
     * Construtor da classe Palavra.
     * 
     * @param texto O texto da palavra.
     * @throws Exception Se o texto fornecido for nulo ou vazio.
     */
    public Palavra (String texto) throws Exception 
    {
        // verifica se o texto recebido é nulo ou então vazio,
        // ou seja, sem nenhum caractere, lançando exceção.
        // armazena o texto recebido em 'this.texto'.

        if(texto == "" || texto == null)
        {
            throw new Exception("Texto está nulo!!");
        }

        this.texto = texto;

    }

     /**
     * Obtém a quantidade de ocorrências de uma letra na palavra.
     * 
     * @param letra A letra a ser contada.
     * @return A quantidade de ocorrências da letra na palavra.
     */
    public int getQuantidade (char letra)
    {
        // percorre o String this.texto, conta e retorna
        // quantas letras existem nele iguais a letra fornecida.
        int qtd = 0;
        for (int i = 0; i < this.texto.length();i++)
        {
            if(texto.charAt(i) == letra) //Verifica se a letra existe em 'texto'.
            {
                // 'texto.charAt(i)' -> Aqui retorna quantas letras existem em 'texto'.
                qtd++;
            }
        }

        return qtd;
    }

    /**
     * Obtém a posição da i-ésima ocorrência de uma letra na palavra.
     * 
     * @param i     O índice da ocorrência desejada.
     * @param letra A letra a ser buscada.
     * @return A posição da i-ésima ocorrência da letra na palavra.
     * @throws Exception Se não encontrar a i-ésima ocorrência da letra na palavra.
     */
    public int getPosicaoDaIezimaOcorrencia (int i, char letra) throws Exception 
    {
        // se 'i==0', retorna a posição em que ocorre a primeira
        // aparição de letra fornecida em 'this.texto';
        // se 'i==1', retorna a posicão em que ocorre a segunda
        // aparição de letra fornecida em 'this.texto';
        // se 'i==2', retorna a posicão em que ocorre a terceira
        // aparição de letra fornecida em 'this.texto';
        // e assim por diante.
        // lançar exceçãp caso não encontre em 'this.texto'
        // a Iézima aparição da letra fornecida (Percorrer todo o 'this.texto' e ver se há 
        // a letra fornecida).

        // letra = Java
        byte posicao = 0;


        for(int a = 0; a <this.texto.length();a++)
        {
            if (this.texto.charAt(a) == letra) posicao++;
            if(posicao - 1 == i) return a;
        }
            throw new Exception("Erro na classe Palavra: não há repetição de letras maior" 
            + " que a palavra fornecida");
    }

        /**
         * Obtém o tamanho da palavra.
         * 
         * @return O tamanho da palavra.
         */
        public int getTamanho () 
        {
            return this.texto.length();
        }

    /**
     * Sobrescrita do método toString para retornar o texto da palavra.
     */
    @Override 
    public String toString () 
    {
        return this.texto;
    }

    
    /**
     * Sobrescrita do método equals para verificar se duas palavras são iguais.
     */
    @Override
    public boolean equals (Object obj) 
    {
        // Verificar se 'this' e 'obj' possuem o mesmo conteúdo, retornando
        // 'true' no caso afirmativo ou 'false' no caso negativo.

        if(this == obj) return  true;

        if(obj == null) return false;

        for (int a = 0; a < this.texto.length();a++)
        if(this.texto.charAt(a) != ((Palavra)obj). texto.charAt(a)) return false;

        return true;

    }

     /**
     * Sobrescrita do método hashCode para calcular o hashcode da palavra.
     */
    @Override
    public int hashCode () 
    {
        // calcular e retornar o hashcode de this
        int i = 26;
        i = 7 * i + String.valueOf(this.texto).hashCode(); // new String (this.texto).hashCode()
        if(i < 0) i = -i;
        return i;
    }

    /**
     * Método de comparação de palavras para ordenação.
     */
    @Override
    public int compareTo (Palavra palavra)
    { 
        return this.texto.compareTo(palavra.texto);
    }
}
