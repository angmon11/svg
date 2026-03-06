public class Segment {

    public Point p1;
    public Point p2;

    public Segment(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public double length() {

        double dx = p2.x - p1.x;
        double dy = p2.y - p1.y;

        return Math.sqrt(dx * dx + dy * dy);
    }
    public static Segment longestSegment(Segment[] segments) {

        Segment longest = segments[0];

        for (Segment s : segments) {
            if (s.length() > longest.length()) {
                longest = s;
            }
        }

        return longest;
    }

}