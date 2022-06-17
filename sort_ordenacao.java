public class sort_ordenacao {
    
    public static double[] insercao (double[] vetor){
        for(int i=1; i<vetor.length; i++){
                double atual= vetor[i];
                int j= i-1;
                while((j>=0) &&(vetor[j]>atual)){ 
                    vetor[j+1]=vetor[j];
                    j--;
                }
                vetor[j+1]=atual;
                }
            return vetor;
        }
            
        public static double[] selecao (double[] vetor){
            double aux;
            for (int i = vetor.length-1; i > 0; i--) {
            int iMax=i;
                for (int j = 0; j < i; j++) {
                if(vetor[j] > vetor[iMax]){
                    iMax=j;
                }    
                }
            aux =vetor[iMax];
            vetor[iMax]=vetor[i];
            vetor[i]=aux;
            }
        
            return vetor;    
        }
    
        public static double[] bolha (double[] vetor){
        int i, j;	
        int N = vetor.length;
        double aux;
        for (j = 1; j < N + 1; j++) {
            for (i = 0; i < N - 1; i++) {
                if (vetor[i] > vetor[i + 1]) {
                    aux = vetor[i];
                    vetor[i] = vetor[i + 1];
                    vetor[i + 1] = aux;
                    }
                }
            }
            return vetor;
        }	    
}
