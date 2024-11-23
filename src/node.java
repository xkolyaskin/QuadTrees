import java.util.List;

public class node {
    public region region;
    public point point;
    public List<node> children;

    /**
     * Constructs new quadtree node with specified values
     *
     * @param region region of interest for the node
     * @param point point contained in this node
     * @param children list of children of this node
     */
    public node(region region, point point, List<node> children) {
        this.region = region;
        this.point = point;
        this.children = children;
    }

    /**
     * Constructs new quadtree node with specified region and default values
     *
     * @param region region of interest for the node
     */
    public node(region region) {
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

    public List<node> getChildren() {
        return children;
    }

    public int getNumChildren() {
        return children.size();
    }

    public void setChildren(List<node> children) {
        this.children = children;
    }
}
