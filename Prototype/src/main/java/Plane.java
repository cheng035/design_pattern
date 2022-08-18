/**
 * we want to used prototype pattern do produce lots of planes
 */
public class Plane implements Cloneable {
    private int locationX;
    private int locationY;

    public Plane(int x) {
        this.locationX = x;
        this.locationY = 0;
    }

    public void fly(){
        this.locationY+=1;
    }


    @Override
    public Plane clone() {
        try {
            return (Plane) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
