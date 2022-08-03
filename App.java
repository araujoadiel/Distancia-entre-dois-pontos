public class App {

    public static void main(String[] args) throws Exception {
         Pontos p1 = new Pontos (2, 7);
         Pontos p2 = new Pontos (-2, 3);

         double result = p1.distance(p1, p2);

        System.out.println(result);    
    }
}