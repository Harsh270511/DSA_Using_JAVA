package L13OOPs;

public class notes3 {
  public static void main(String[] args) {
    Pens p = new Pens(); // Create a new Pen object

    // ---- Setting and getting color ----
    p.setColors("Pink"); // Using setter to assign value to 'color'
    System.out.println(p.getColors()); // Using getter to retrieve value of 'color'

    // NOTE: We cannot directly access 'p.color' because 'color' is private.
    // Same rule applies to 'tip'. Private variables can only be accessed
    // within the class they are declared in, not directly outside.

    // ---- Setting and getting tip ----
    p.setTip(56); // Using setter to assign value to 'tip'
    // System.out.println(p.getTip()); // Using getter to retrieve value of 'tip'
  }
}

class Pens {
  // -----------------------------
  // Attributes (Data members)
  // -----------------------------
  private String color; // 'private' → accessible only inside this class
  private int tip; // encapsulation (data hiding)

  // -----------------------------
  // Getter methods (to read data)
  // -----------------------------
  String getColors() {
    return this.color; // 'this.color' refers to the class attribute 'color'
  }

  int getTip() {
    return this.tip; // Returns the value of tip
  }

  // -----------------------------
  // Setter methods (to update data)
  // -----------------------------
  void setTip(int newTip) {
    this.tip = newTip;
    // 'this.tip' → current object's variable
    // 'newTip' → parameter passed in function
  }

  void setColors(String color) {
    this.color = color;
    // 'this.color' (class variable) is assigned the value
    // of 'color' (local parameter).
    // This avoids confusion when both have the same name.
  }
}
