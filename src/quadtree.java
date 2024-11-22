import java.util.ArrayList;

public class quadtree {
    private region bounds;
    ArrayList<point> points;

    /**
     * Checks if a point is in the boundaries of a region
     * @param B region to check
     * @param P point to check
     * @return true if point exists within the bounds
     */
    public boolean inBoundary(region B, point P) {
        return ((B.xmin <= P.x) && (P.x <= B.xmax) && (B.ymin <= P.y) && (P.y <= B.ymax));
    }

    /**
     * Subdivides the input quadtreeNode into 4 quadrants
     *
     * @param root node to subdivide
     */
    public void subdivide(quadtreeNode root) {
        // todo implement subdivide
    }

    /**
     * Inserts the point into the node. Subdivides the region if needed
     *
     * @param P point to insert
     * @param root node to insert point
     * @return true if insert successful
     */
    public boolean insert(point P, quadtreeNode root) {
        // todo implement insert
        return true;
    }
}
