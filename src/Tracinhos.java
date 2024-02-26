import java.util.Arrays;

/**
 * A classe Tracinhos representa uma sequência de caracteres 
 * com alguns deles ocultos por tracinhos.
 */
public class Tracinhos implements Cloneable
{
    private char texto[];

    public Tracinhos (int qtdMax) throws Exception 
    {
        if(qtdMax < 0)
        {
            throw new Exception("Quantidade inválida!");
        }
        else  this.texto = new char[qtdMax];

        int qtdeTracinhos;

        // Preenche o vetor 'this.texto' com underlines (_).
        for(qtdeTracinhos = 0; qtdeTracinhos < qtdMax;qtdeTracinhos++)
        {
            this.texto[qtdeTracinhos] = '_';
        }
		// Verifica se 'qtd' não é positiva, lançando uma exceção.
		// instancia 'this.texto' com um vetor com tamanho igual 'qtd'.
		// preenche 'this.texto' com underlines (_).
    }

     /**
     * Revela um caractere na posição especificada na sequência.
     * @param posicao A posição onde o caractere será revelado.
     * @param letra O caractere que será revelado na posição especificada.
     * @throws Exception Se a posição for inválida.
     */
    public void revele (int posicao, char letra) throws Exception 
    {
        if (posicao < 0 || posicao >= this.texto.length)
        {
            throw new Exception("Tamanho inválido");
        }
        else{
             this.texto[posicao]= letra;

        }
		// Verifica se 'posição' é negativa ou então igual ou maior
		// do que 'this.texto.length', lançando uma exceção.
		// armazena a letra fornecida na 'posição' também fornecida
		// do vetor 'this.texto'.
    }


     /**
     * Verifica se ainda existem tracinhos na sequência.
     * @return true se ainda houver tracinhos na sequência, false caso contrário.
     */
    public boolean isAindaComTracinhos ()
    {
        for(int i = 0;i <this.texto.length;i++)
        {
            if(this.texto[i] == '_')
            {
                return true;
            }
        }
        return false;
    }
        // Percorre o vetor de char 'this.texto' e verifica
        // se o mesmo ainda contém algum 'underline' ou se já
        // foram todos substituídos por letras; retornar 'true'
        // caso ainda reste algum 'underline', ou 'false' caso
        // contrário.


     /**
     * Retorna a representação da sequência de caracteres como uma string.
     * @return Uma string representando a sequência de caracteres.
     */
    public String toString () 
    {
       String palavra = "";

            for(int a =0; a < this.texto.length; a++)
            {
               palavra += " " + (this.texto[a]) ;
            }


        // Retorna uma 'string' com TODOS os caracteres que há
        // no vetor 'this.texto', intercalados com espaços em
        // branco.
        return palavra;
    }

    /**
     * Verifica se dois objetos 'tracinhos' são iguais.
     * @param obj O objeto a ser comparado.
     * @return 'true' se os objetos tiverem o mesmo conteúdo, 'false' caso contrário.
     */
    public boolean equals (Object obj) 
    {
        if(this == obj) return true;
        if(obj == null) return false;

        if(this.getClass() != obj.getClass()) return false;

        Tracinhos traco = (Tracinhos)(obj);
        for (int a = 0; a < texto.length;a++)
        {
            if(this.texto[a] != traco.texto[a]) return false;
        }
        return true;

        // Verificar se 'this' e 'obj' possuem o mesmo conteúdo, retornando
        // 'true' no caso afirmativo ou 'false' no caso negativo.
    }


     /**
     * Retorna o código hash da sequência de caracteres.
     * @return O código hash da sequência de caracteres.
     */
    public int hashCode () 
    {
        int ret = 26;
      ret = 13 * ret + Arrays.hashCode(this.texto);
        if(ret < 0 ) ret = -ret;
        return ret;
        // calcular e retornar o hashcode de 'this'
    }

     /**
     * Construtor de cópia da classe 'Tracinhos'.
     * @param t O objeto 'tracinhos' a ser copiado.
     * @throws Exception Se o objeto passado for nulo.
     */
    public Tracinhos (Tracinhos t) throws Exception // construtor de cópia.
    {

            if (t ==null)
            {
                throw new Exception("tracinho ausente");
            }
            this.texto = new char[t.texto.length];
             t.texto = this.texto;


        // Intanciar 'this.texto' em um vetor com o mesmo tamanho de 't.texto'.
        // e copilar o conteúdo de 't.texto' para 'this.texto'.
    }

    /**
     * Cria e retorna uma cópia do objeto 'tracinhos'.
     * @return Uma cópia do objeto 'tracinhos'.
     */
    public Object clone ()
    {
        Tracinhos tzin = null;

        try
        {
            tzin = new Tracinhos(this);
        }
        catch(Exception e)
        {

        }
        return tzin;
        // Retornar uma copia de 'this'.
    }
}
