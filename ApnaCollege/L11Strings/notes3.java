package ApnaCollege.L11Strings;

public class notes3 {
  public static float getShortestPath(String path) {
    int x = 0, y = 0;

    for (int i = 0; i < path.length(); i++) {
      char dir = path.charAt(i);// haar ek index ki character check hongi and dir me store hongi

      // South
      if (dir == 'S') {
        y--;
      }
      // North
      if (dir == 'N') {
        y++;
      }
      // East
      if (dir == 'E') {
        x++;
      }
      // West
      if (dir == 'W') {
        x--;
      }

    }
    int X2 = x * x;
    int Y2 = y * y;
    return (float) Math.sqrt(X2 + Y2);

  }

  public static void main(String[] args) {
    String str = "WNEENESENNN";
    System.out.println(getShortestPath(str));
  }
}
