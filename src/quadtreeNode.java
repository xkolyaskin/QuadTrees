import java.util.List;

public class quadtreeNode {
    public region regionOfInterest;
    public point point;
    private List<quadtreeNode> children;

    /**
     * Constructs new quadtree node with specified values
     * @param regionOfInterest region of interest for the node
     * @param point point contained in this node
     * @param children list of children of this node
     */
    public quadtreeNode(region regionOfInterest, point point, List<quadtreeNode> children) {
        this.regionOfInterest = regionOfInterest;
        this.point = point;
        this.children = children;
    }

    public region getRegionOfInterest() {
        return regionOfInterest;
    }

    public void setRegionOfInterest(region regionOfInterest) {
        this.regionOfInterest = regionOfInterest;
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

    public void setChildren(List<quadtreeNode> children) {
        this.children = children;
    }
}
