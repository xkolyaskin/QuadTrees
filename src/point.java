public class point {
    int x, y;
    String name;

    /**
     * Constructs new point with input values
     *
     * @param x x coordinate
     * @param y y coordinate
     * @param name name of point
     */
    public point(int x, int y, String name) {
        this.x = x;
        this.y = y;
        this.name = name;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
