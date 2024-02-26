/**
 * Esta classe representa um controlador de letras já digitadas em um jogo da forca.
 * Implementa a interface 'Cloneable' para permitir a clonagem de objetos.
 */
public class ControladorDeLetrasJaDigitadas implements Cloneable
{
    /** String contendo as letras já digitadas */
    private String letrasJaDigitadas;

    /**
     * Construtor que inicializa o controlador com uma string vazia.
     */
    public ControladorDeLetrasJaDigitadas () 
    {
        this.letrasJaDigitadas = "";
        // torna this.letrasJaDigitadas igual ao String vazio
    }

     /**
     * Verifica se uma letra já foi digitada anteriormente.
     * 
     * @param letra A letra a ser verificada.
     * @return true se a letra já foi digitada, false caso contrário.
     */
    public boolean isJaDigitada (char letra) //Works
    {
        for(int a = 0; a <this.letrasJaDigitadas.length();a++)
        {
            if (this.letrasJaDigitadas.charAt(a) == letra)
            {
                return true;
            }
            else if (this.letrasJaDigitadas.charAt(a)!= letra)
            {
                return false;
            }
        }
          return false;

        // percorrer o string 'this.letrasJaDigitadas' e verificar se ele
        // possui a letra fornecida, retornando 'true' em caso afirmativo
        // ou 'false' em caso negativo.
    }

     /**
     * Registra uma nova letra digitada.
     * 
     * @param letra A letra a ser registrada.
     * @throws Exception Se a letra já foi digitada anteriormente.
     */
    public void registre (char letra) throws Exception 
    {
        if(this.isJaDigitada(letra))
        {
            throw new Exception("Letra já digitada!");

        }
       this.letrasJaDigitadas += letra;

        // verifica se a letra fornecida ja foi digitada (pode usar
        // o método this.isJaDigitada, para isso), lancando uma exceção
        // em caso afirmativo.
        // concatena a letra fornecida a 'this.letrasJaDigitadas'.
    }


    /**
     * Retorna uma representação em formato de string das letras já digitadas.
     * 
     * @return Uma string contendo todas as letras já digitadas separadas por vírgula.
     */
    public String toString ()
    {
        String letras = "";
        for(int b = 0;b <this.letrasJaDigitadas.length();b++)
        {
            letras += this.letrasJaDigitadas.charAt(b) + ",";
        }
        return letras;
        // retorna uma 'string' com TODAS as letras presentes em
        // 'this.letrasJaDigitadas' separadas por vírgula (,).
    }

     /**
     * Verifica se dois objetos controladores de letras já digitadas são iguais.
     * 
     * @param obj O objeto a ser comparado.
     * @return true se os objetos são iguais, false caso contrário.
     */
    public boolean equals (Object obj) 
    {
        if(this == obj) return false;
        if(obj == null) return false;
        if(this.getClass() != obj.getClass()) return false;

        if(this.letrasJaDigitadas == ((ControladorDeLetrasJaDigitadas)obj).letrasJaDigitadas) return true;

        return false;
        // verificar se 'this' e 'obj' são iguais
    }

    /**
     * Calcula e retorna o valor do hashcode do controlador de letras já digitadas.
     * 
     * @return O valor do hashcode.
     */
    public int hashCode () 
    {
      int a = 28;

        a = 13 * a + String.valueOf(this.letrasJaDigitadas).hashCode();
        return a;
        // calcular e retornar o hashcode de this
    }

    /**
     * Construtor de cópia que cria um novo controlador de letras já digitadas com base em outro objeto.
     * 
     * @param c O controlador de letras já digitadas a ser copiado.
     * @throws Exception Se o controlador de letras já digitadas fornecido for nulo.
     */
    public ControladorDeLetrasJaDigitadas(
            ControladorDeLetrasJaDigitadas c)
            throws Exception // construtor de cópia.
    {
       if(c == null)
       {
           throw new Exception("Objeto nulo!");
       }
        this.letrasJaDigitadas = c.letrasJaDigitadas;
        // copiar 'c.letrasJaDigitadas' em 'this.letrasJaDigitadas'.
    }

     /**
     * Cria e retorna uma cópia do controlador de letras já digitadas.
     * 
     * @return Uma cópia do controlador de letras já digitadas.
     */
    public Object clone ()
    {
        ControladorDeLetrasJaDigitadas controla = null;
        try
        {
            controla = new ControladorDeLetrasJaDigitadas(this);
        }
        catch (Exception erro)
        {
             // Se ocorrer uma exceção ao tentar criar a cópia, imprime a mensagem de erro.
            System.out.println(erro.getMessage());
        }
        return controla;
        // criar uma cópia do 'this' com o construtor de cópia e retornar.
    }
}
