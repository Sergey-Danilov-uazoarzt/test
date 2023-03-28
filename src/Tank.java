public class Tank {
    int x, y;
    int dir=0;
    int fuel = 100;
    public Tank() {
    }
    public Tank(int x0, int y0) {
        this.x = x0;
        this.y = y0;
    }
    public Tank(int x0, int y0, int fuel) {
        this.x = x0;
        this.y = y0;
        this.fuel = fuel;
    }
    public void goForward(int i) {
        if (i >= 0){
            if (i > fuel) {
                i = fuel;
            }
        }else {
            if (Math.abs(i) > fuel) {
                i = fuel*(-1);
            }
        }
        fuel -= Math.abs(i);
        if (dir == 0) {
            x += i;
        }
        else if (dir == 1) {
            y += i;
        }
        else if (dir == 2) {
            x -= i ;
        }
        else {
            y -= i;
        }
    }
    public void printPosition() {
        System.out.println("The Tank is at " + x +", " + y + " now.");
    }
    public void turnLeft() {
        dir--;
        if (dir == -1) dir = 3;
    }
    public void turnRight() {
        dir++;
        if (dir == 4) dir = 0;
    }
    public void goBackward(int i) {
        goForward(-i);
    }
}
//    The Tank is at 100, 0 now.
//        The Tank is at 210, 10 now.
//        The Tank is at 220, 30 now.