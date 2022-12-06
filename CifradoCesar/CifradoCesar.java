package CifradoCesar;

public class CifradoCesar {

    public static String cifradoCesar(String mensaje, int llave){
        int length = mensaje.length();
        StringBuilder mensajeCifrado = new StringBuilder();

        for (int i = 0; i < length ; i++) {
            if (mensaje.charAt(i) >= 'a' && mensaje.charAt(i) <= 'z'){
                if ( (mensaje.charAt(i) + llave) > 'z' ){
                    mensajeCifrado.append((char) (mensaje.charAt(i) + llave - 26));
                }else {
                    mensajeCifrado.append((char) (mensaje.charAt(i) + llave));
                }
            }
        }
        return mensajeCifrado.toString();
    }

    public static String descifrarCesar(String mensaje, int llave){
        int length = mensaje.length();
        StringBuilder mensajeAdescrifrar = new StringBuilder();

        for (int i = 0; i < length ; i++) {
            if (mensaje.charAt(i) >= 'a' && mensaje.charAt(i) <= 'z'){
                if ( (mensaje.charAt(i) - llave) < 'a' ){
                    mensajeAdescrifrar.append((char) (mensaje.charAt(i) - llave + 26));
                }else {
                    mensajeAdescrifrar.append((char) (mensaje.charAt(i) - llave));
                }
            }
        }
        return mensajeAdescrifrar.toString();
    }

    public static void main(String[] args) {
        int llave = 12;
        String mensaje = "hola";
        String mensajeCifrado = cifradoCesar(mensaje,llave);
        System.out.println(mensajeCifrado);
        String mensajeAdescifrar = descifrarCesar(mensajeCifrado,llave);
        System.out.println(mensajeAdescifrar);
    }
}
