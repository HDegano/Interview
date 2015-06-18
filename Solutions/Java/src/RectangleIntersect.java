/**
 * Created by HDegano on 6/17/2015.
 */
public class RectangleIntersect {

    public static class Rectangle{
        int x, y, width, height;

        public Rectangle(int x, int y,int width,int height){
            this.x = x;
            this.y = y;
            this.width = width;
            this.height = height;
        }
    }

    public Rectangle Intersection(Rectangle R, Rectangle S) {
        if (intersects(R, S)) {
            return new Rectangle(Math.max(R.x, S.x), Math.max(R.y, S.y),
                    Math.min(R.x + R.width, S.x + S.width) - Math.max(R.x, S.x),
                    Math.min(R.y + R.height, S.y + S.height) - Math.max(R.y, S.y));
        } else {
            return new Rectangle(0, 0, -1, -1);
        }
    }

    //since x, y are straight lines, just treat them as lines and check for intersection
    public  boolean intersects(Rectangle R, Rectangle S) {
        return R.x <= S.x + S.width && R.x + R.width >= S.x
                && R.y <= S.y + S.height && R.y + R.height >= S.y;
    }

}
