public class tipoDados {
    public static void main(String[] args) {
        byte idade = 123;
        short ano = 2021;
        int cep = 21070333; // se começar com zero, talvez tenha que ser outro tipo
        long cpf = 98765432109L; // se começar com zero, talvez tenha que ser outro tipo
        float pi = 3.14F;
        double salario = 1275.33;
    }
}

/*
Tipo	Memória	  Valor Mínimo	    Valor Máximo

byte    1 byte       -128               127


short   2 byte      -32.768            32.767


int     4 bytes    -2.147.483.648   2.147.483.647


long    8 bytes   -9.223.372.036.854.775.808    9.223.372.036.854.775.807


Os tipos primitivos, que podem conter partes fracionárias podem ser representados por dois tipos:

Tipo	Memória	    Mínimo	      Máximo	      Precisão

float   4 bytes  -3,4028E + 38  3,4028E + 38    6 – 7 dígitos


double  8 bytes  -1,7976E + 308 1,7976E + 308    15 dígitos

 */