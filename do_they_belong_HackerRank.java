
public class do_they_belong_HackerRank {
	
	 public static int checkTriangle(int x1, int y1, int x2, int y2, int x3, int y3, int xp, int yp, int xq, int yq) {

		 // The formula below checks whether the 3 points lie in a straight line and will result in 0 if it does
        int a = x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2);
        
        // If the result above is 0, then scenario 0 is returned as 3 points in a straight line cannot form a triangle
        if (a == 0) {
            return 0;
        }

        boolean[] arr = new boolean[2];
        arr[0] = pointInside(x1, y1, x2, y2, x3, y3, xp, yp);
        arr[1] = pointInside(x1, y1, x2, y2, x3, y3, xq, yq);

        if (arr[0] && arr[1]) {
            return 3;
        } else if (arr[0]) {
            return 1;
        } else if (arr[1]) {
            return 2;
        } else {
            return 4;
        }
    }

    // Method to calculate area of triangle
    private static double calculateArea(int x1, int y1, int x2, int y2, int x3, int y3) {
        return Math.abs((x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2)) / 2.0);
    }


    // This method returns true if the additional point (p or q) is inside the triangle by checking
    // whether the areas of the mini-triangles formed with the additional point add up to the original triangle's area
    // The point is inside if they are equal
    private static boolean pointInside(int x1, int y1, int x2, int y2, int x3, int y3, int x, int y) {
        
        // Area of original triangle
        double area = calculateArea(x1, y1, x2, y2, x3, y3);

        // Area of mini-triangle 1
        double area1 = calculateArea(x, y, x2, y2, x3, y3);

        // Area of mini-triangle 2
        double area2 = calculateArea(x1, y1, x, y, x3, y3);

        // Area of mini-triangle 3
        double area3 = calculateArea(x1, y1, x2, y2, x, y);


        return area == area1 + area2 + area3;
    }
	    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int res = checkTriangle(3,1,7,1,5,5,1,1,4,3);
		System.out.println(res);
	}

}
