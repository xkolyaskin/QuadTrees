import java.util.ArrayList;

public class quadtree {
    static region bounds;
    ArrayList<point> points;

    /**
     * Initializes a quadtree with given dimensions and 0 points
     *
     * @param width width of the quadtree (xmax)
     * @param height height of the quadtree (ymax)
     */
    public quadtree(int width, int height) {
        if (width < 0 || height < 0) {
            throw new IllegalArgumentException("Error: attempt to initialize quadtree with negative dimensions: " +
                    "width: " + width + ", height: " + height);
        }
        bounds.xmin = 0;
        bounds.ymin = 0;
        bounds.xmax = width;
        bounds.ymax = height;
    }

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
     * Subdivides the input quadtree node into 4 quadrants
     *
     * @param root node to subdivide
     */
    public void subdivide(node root) {
        // todo implement subdivide
        int xmin = root.region.xmin;
        int ymin = root.region.ymin;
        int xmax = root.region.xmax;
        int ymax = root.region.ymax;

        int xmid = (xmin + xmax) / 2;
        int ymid = (ymin + ymax) / 2;

        root.children.add(new node(new region(xmin, ymid, xmid, ymax))); // NW
        root.children.add(new node(new region(xmid, ymid, xmax, ymax))); // NE
        root.children.add(new node(new region(xmin, ymin, xmid, ymid))); // SW
        root.children.add(new node(new region(xmid, ymin, xmax, ymid))); // SE

        if (!(root.point == null)) {
            point P = root.point;
            root.point = null;
            for (node quadrant : root.children) {
                if (insert(P, quadrant)) {
                    return;
                }
            }
        }
    }

    /**
     * Inserts the point into the node. Subdivides the region if needed
     *
     * @param P point to insert
     * @param root node to insert point
     * @return true if insert successful
     */
    public boolean insert(point P, node root) {
        // todo implement insert
        if (!inBoundary(root.region, P)) {
            return false;
        }
        if ((root.point == null) && root.getNumChildren() == 0) {
            root.setPoint(P);
            return true;
        }
        if (root.getNumChildren() == 0) {
            subdivide(root);
        }
        for (node quadrant : root.children) {
            if (insert(P, quadrant)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Main function for testing
     *
     * @param args arguments
     */
    public static void main(String[] args) {
        // todo implement command line interface
    }
}
