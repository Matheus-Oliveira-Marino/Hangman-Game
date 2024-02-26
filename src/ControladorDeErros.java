/**
 * Esta classe representa um controlador de erros utilizado para registrar e controlar 
 * a quantidade de erros em um jogo.
 * Implementa a interface 'Cloneable' para permitir a clonagem de objetos.
 */
public class ControladorDeErros implements Cloneable
{
    /** Quantidade máxima de erros permitida('qtdMax') e 
     * quantidade erros registrados('qtdErr').
     */
    private int qtdMax, qtdErr=0;

    /**
     * Construtor que inicializa o controlador com uma quantidade máxima de erros.
     * 
     * @param qtdMax Quantidade máxima de erros permitida.
     * @throws Exception Se a quantidade máxima de erros fornecida for negativa.
     */

    public ControladorDeErros (int qtdMax) throws Exception 
    {
        if(qtdMax < 0) throw new Exception("Quantidade Inválida!");
        this.qtdMax = qtdMax;
        // verifica se 'qtdMax' fornecida não é positiva, lançando
        // uma exceção.
        // armazena 'qtdMax' fornecida em 'this.qtdMax'.

    }


     /**
     * Registra um erro no controlador.
     * 
     * @throws Exception Se o limite de erros já foi atingido.
     */

    public void registreUmErro () throws Exception 
    {
        if(this.qtdErr == this.qtdMax)
        {
            throw new Exception("Você atingiu o limite de erros!");
        }
        this.qtdErr++;
        // verifica se this.qtdErr ja é igual a this.qtdMax,
        // lançando excecao em caso positivo ou
        // incrementando this.qtdErr em caso negativo.
    }


    /**
     * Verifica se o limite máximo de erros foi atingido.
     * 
     * @return true se o limite máximo de erros foi atingido, false caso contrário.
     */

    public boolean isAtingidoMaximoDeErros  () 
    {
        // returna 'true' se 'this.qtdErr' for igual a 'this.qtdMax',
        // ou então 'false', caso contrario.

        if(this.qtdErr == this.qtdMax)
        {
            return true;
        }

        else
        {
            return false;
        }
    }


     /**
     * Retorna uma representação em formato de string do controlador de erros.
     * 
     * @return A quantidade de erros registrados seguida pela quantidade máxima de erros.
     */

    public String toString ()
    {
        return this.qtdErr + "/" + this.qtdMax;
    } 


    /**
     * Verifica se dois objetos controladores de erros são iguais.
     * 
     * @param obj O objeto a ser comparado.
     * @return 'true' se os objetos são iguais, 'false' caso contrário.
     */

    public boolean equals (Object obj) 
    {
        // verificar se 'this' e 'obj' possuem o mesmo conteúdo, retornando
        // 'true' no caso afirmativo ou 'false' no caso negativo.

        if(this == obj) return true;
        if(obj == null) return false;

        if(this.getClass() != obj.getClass()) return false;
        if(this.qtdMax != ((ControladorDeErros)obj).qtdMax) return false;
        return true;
    }

    
    /**
     * Calcula e retorna o valor do hashcode do controlador de erros.
     * 
     * @return O valor do hashcode.
     */

    public int hashCode () //Works
    {
        int ret = 12;
        ret = 13 * ret + Integer.valueOf(this.qtdErr).hashCode(); //Nova maneira de escrita de hashCode
        ret = 13 * ret + Integer.valueOf(this.qtdMax).hashCode();
        if(ret < 0 ) ret = -ret; // caso 'ret' seja negativo, inverte-se o mesmo.
        return ret;
        // calcular e retornar o hashcode de 'this'.
    }


    /**
     * Construtor de cópia que cria um novo controlador de erros com base em outro objeto.
     * 
     * @param c O controlador de erros a ser copiado.
     * @throws Exception Se o controlador de erros fornecido for nulo.
     */
    public ControladorDeErros (ControladorDeErros c) throws Exception // construtor de cópia.
    {
       if(c == null)
       {
           throw new Exception("c está ausente!");
       }

       this.qtdErr = c.qtdErr;
       this.qtdMax = c.qtdMax;
        // copiar 'c.qtdMax' e c.'qtdErr', respectivamente em, 'this.qtdMax' e 'this.qtdErr'
    }

    /**
     * Cria e retorna uma cópia do controlador de erros.
     * 
     * @return Uma cópia do controlador de erros.
     */
    public Object clone ()
    {

        ControladorDeErros cE = null;

        try
        {
            cE = new ControladorDeErros(this);
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        return cE;
        // returnar uma cópia de this
    }
}
