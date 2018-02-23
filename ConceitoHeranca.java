public class ConceitoHeranca {
    public static void main(String args[]) {
        Pessoa paulo = new Pessoa();
        System.out.println("Paulo vai mijar");
        paulo.mijar();
        System.out.println();
        
        Homem jr = new Homem();
        jr.aniversario();
        jr.aniversario();
        jr.aniversario();
        System.out.println("Idade do JR eh: " + jr.getIdade());
        System.out.println();
        
        jr.baterPunheta();
        System.out.println();
             
        System.out.println("JR vai mijar");
        jr.mijar();
        System.out.println();
        
        Mulher gabi = new Mulher();
        System.out.println("gabi vai mijar");
        gabi.mijar();
        System.out.println();
        
    }
    
    static class Pessoa{
        private int idade;
        
        public void mijar(){
            System.out.println("mijando");
        }
        
        public void aniversario(){
            idade++;
        }
        
        public int getIdade(){
            return idade;
        }
    }
    
    static class Homem extends Pessoa{
        public void baterPunheta(){
            System.out.println("batendo uma punheta!");
        }
        
        public void mijar(){
            System.out.println("mijando em peh");
        }
    }
    
    static class Mulher extends Pessoa{
        public void baterSiririca(){
            System.out.println("batendo uma siririca!");
        }
        
        public void mijar(){
            System.out.println("mijando sentada");
        }
    }
}
