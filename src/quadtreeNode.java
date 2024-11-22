import java.util.List;

public class quadtreeNode {
    public region region;
    public point point;
    public List<quadtreeNode> children;

    /**
     * Constructs new quadtree node with specified values
     *
     * @param region region of interest for the node
     * @param point point contained in this node
     * @param children list of children of this node
     */
    public quadtreeNode(region region, point point, List<quadtreeNode> children) {
        this.region = region;
        this.point = point;
        this.children = children;
    }

    /**
     * Constructs new quadtree node with specified region and default values
     *
     * @param region region of interest for the node
     */
    public quadtreeNode(region region) {
        this.region = region;
        this.point = null;
        this.children = null;
    }

    public region getRegion() {
        return region;
    }

    public void setRegion(region region) {
        this.region = region;
    }

    public point getPoint() {
        return point;
    }

    public void setPoint(point point) {
        this.point = point;
    }

    public List<quadtreeNode> getChildren() {
        return children;
    }

    public int getNumChildren() {
        return children.size();
    }

    public void setChildren(List<quadtreeNode> children) {
        this.children = children;
    }
}
