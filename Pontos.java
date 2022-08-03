public class Pontos {
    private int x;
    private int y;

    public Pontos() {}


    public Pontos (int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x){
        this.x = x;
    }

    public int gety(){
        return y;
    }

    public void sety(int y){
        this.y = y;
    }

    public double distance(Pontos p1, Pontos p2){
        double d = Math.pow((p1.x - p2.x), 2) + Math.pow((p1.y - p2.y), 2);
        return Math.sqrt(d);

    }
}