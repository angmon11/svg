//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        Point a = new Point(0,0);
        Point b = new Point(3,4);
        Point c = new Point(1,1);
        Point d = new Point(5,5);

        Segment s1 = new Segment(a,b);
        Segment s2 = new Segment(c,d);

        Segment[] segments = {s1, s2};

        Segment longest = Segment.longestSegment(segments);

        System.out.println("Najdłuższy segment: " + longest.length());
    }

}