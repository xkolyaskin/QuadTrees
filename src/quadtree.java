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
        int xmin = root.region.xmin;
        int ymin = root.region.ymin;
        int xmax = root.region.xmax;
        int ymax = root.region.ymax;

        int xmid = (xmin + xmax) / 2;
        int ymid = (ymin + ymax) / 2;

        root.children.add(new quadtreeNode(new region(xmin, ymid, xmid, ymax))); // NW
        root.children.add(new quadtreeNode(new region(xmid, ymid, xmax, ymax))); // NE
        root.children.add(new quadtreeNode(new region(xmin, ymin, xmid, ymid))); // SW
        root.children.add(new quadtreeNode(new region(xmid, ymin, xmax, ymid))); // SE

        if (!(root.point == null)) {
            point P = root.point;
            root.point = null;
            for (quadtreeNode quadrant : root.children) {
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
    public boolean insert(point P, quadtreeNode root) {
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
        for (quadtreeNode quadrant : root.children) {
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
