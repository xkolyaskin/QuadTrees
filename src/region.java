public class region {
    public int xmin, ymin, xmax, ymax;

    /**
     * Constructs new region on graph with bounds
     *
     * @param xmin x minimum boundary
     * @param ymin y minimum boundary
     * @param xmax x maximum boundary
     * @param ymax y maximum boundary
     */
    public region(int xmin, int ymin, int xmax, int ymax) {
        this.xmin = xmin;
        this.ymin = ymin;
        this.xmax = xmax;
        this.ymax = ymax;
    }

    /**
     * Constructs a new region on graph with default values (0 - 1)
     */
    public region() {
        this.xmin = 0;
        this.ymin = 0;
        this.xmax = 1;
        this.ymax = 1;
    }

    public int getXmin() {
        return xmin;
    }

    public void setXmin(int xmin) {
        this.xmin = xmin;
    }

    public int getYmin() {
        return ymin;
    }

    public void setYmin(int ymin) {
        this.ymin = ymin;
    }

    public int getXmax() {
        return xmax;
    }

    public void setXmax(int xmax) {
        this.xmax = xmax;
    }

    public int getYmax() {
        return ymax;
    }

    public void setYmax(int ymax) {
        this.ymax = ymax;
    }
}
