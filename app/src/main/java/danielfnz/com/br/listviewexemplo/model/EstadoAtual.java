package danielfnz.com.br.listviewexemplo.model;

/**
 * Created by Alunoinf_2 on 02/02/2019.
 */

public enum EstadoAtual {

    FAZENDO{
        @Override
        public String toString() {
            return "Fazendo";
        }
    }, FINALIZADO{
        @Override
        public String toString() {
            return "finalizado";
        }
    };
}