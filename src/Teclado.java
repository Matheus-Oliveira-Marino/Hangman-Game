import java.io.*;

/**
 * A classe Teclado fornece métodos para capturar entrada do teclado 
 * em vários tipos de dados.
 */
public class Teclado
{
    private static BufferedReader teclado =
            new BufferedReader (
                    new InputStreamReader (
                            System.in));


    /**
     * Obtém uma entrada de string do teclado.
     * @return A string digitada pelo usuário.
     */                        
    public static String getUmString ()
    {
        String ret = null;

        try
        {
            ret = teclado.readLine ();
        }
        catch (IOException erro)
        {} // sei que não vai dar erro.

        return ret;
    }

    
    /**
     * Obtém um byte do teclado.
     * @return O byte digitado pelo usuário.
     * @throws Exception Se ocorrer um erro durante a leitura ou se o byte digitado for inválido.
     */
    public static byte getUmByte () throws Exception
    {
        byte ret=(byte)0;

        try
        {
            ret = Byte.parseByte (teclado.readLine ());
        }
        catch (IOException erro)
        {} // sei que não vai dar erro
        catch (NumberFormatException erro)
        {
            throw new Exception ("Byte invalido!");
        }

        return ret;
    }


    /**
     * Obtém um short do teclado.
     * @return O short digitado pelo usuário.
     * @throws Exception Se ocorrer um erro durante a leitura ou se o short digitado for inválido.
     */
    public static short getUmShort () throws Exception
    {
        short ret=(short)0;

        try
        {
            ret = Short.parseShort (teclado.readLine ());
        }
        catch (IOException erro)
        {} // sei que não vai dar erro
        catch (NumberFormatException erro)
        {
            throw new Exception ("Short invalido!");
        }

        return ret;
    }


      /**
     * Obtém um int do teclado.
     * @return O int digitado pelo usuário.
     * @throws Exception Se ocorrer um erro durante a leitura ou se o int digitado for inválido.
     */
    public static int getUmInt () throws Exception
    {
        int ret=0;

        try
        {
            ret = Integer.parseInt (teclado.readLine ());
        }
        catch (IOException erro)
        {} // sei que não vai dar erro.
        catch (NumberFormatException erro)
        {
            throw new Exception ("Int invalido!");
        }

        return ret;
    }


    /**
     * Obtém um long do teclado.
     * @return O long digitado pelo usuário.
     * @throws Exception Se ocorrer um erro durante a leitura ou se o long digitado for inválido.
     */
    public static long getUmLong () throws Exception
    {
        //long ret=(long)0;
        //long ret=0;
        long ret=0L;

        try
        {
            ret = Long.parseLong (teclado.readLine ());
        }
        catch (IOException erro)
        {} // sei que não vai dar erro.
        catch (NumberFormatException erro)
        {
            throw new Exception ("Long invalido!");
        }

        return ret;
    }


    /**
     * Obtém um float do teclado.
     * @return O float digitado pelo usuário.
     * @throws Exception Se ocorrer um erro durante a leitura ou se o float digitado for inválido.
     */
    public static float getUmFloat () throws Exception
    {
        //float ret=0;
        //float ret=(float)0.0;
        float ret=0.0F;

        try
        {
            ret = Float.parseFloat (teclado.readLine ());
        }
        catch (IOException erro)
        {} // sei que nao vai dar erro
        catch (NumberFormatException erro)
        {
            throw new Exception ("Float invalido!");
        }

        return ret;
    }

    /**
     * Obtém um double do teclado.
     * @return O double digitado pelo usuário.
     * @throws Exception Se ocorrer um erro durante a leitura ou se o double digitado for inválido.
     */
    public static double getUmDouble () throws Exception
    {
        //double ret=0;
        //double ret=(long)0;
        //double ret=0L;
        double ret=0.0;

        try
        {
            ret = Double.parseDouble (teclado.readLine ());
        }
        catch (IOException erro)
        {} // sei que não vai dar erro.
        catch (NumberFormatException erro)
        {
            throw new Exception ("Double invalido!");
        }

        return ret;
    }


    /**
     * Obtém um caractere do teclado.
     * @return O caractere digitado pelo usuário.
     * @throws Exception Se ocorrer um erro durante a leitura.
     */
    public static char getUmChar () throws Exception
    {
        char ret=' ';

        try
        {
            String str = teclado.readLine ();

            if (str==null)
                throw new Exception ("Char invalido!");

            if (str.length() != 1)
                throw new Exception ("Char invalido!");

            ret = str.charAt(0);
        }
        catch (IOException erro)
        {} // sei que não vai dar erro.

        return ret;
    }

    /**
     * Obtém um valor booleano do teclado.
     * @return O valor booleano digitado pelo usuário.
     * @throws Exception Se ocorrer um erro durante a leitura.
     */
    public static boolean getUmBoolean () throws Exception
    {
        boolean ret=false;

        try
        {
            String str = teclado.readLine ();

            if (str==null)
                throw new Exception ("Boolean invalido!");

            if (!str.equals("true") && !str.equals("false"))
                throw new Exception ("Boolean invalido!");

            ret = Boolean.parseBoolean (str);
        }
        catch (IOException erro)
        {} // sei que não vai dar erro.

        return ret;
    }
}