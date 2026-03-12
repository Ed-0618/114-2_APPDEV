public class Q3_Turtle {
    // 宣告成員變數
    private String species;
    private int age;
    
    // 建構子
    public Q3_Turtle(String species, int age) {
        this.species = species;
        this.age = age;
    }
    
    // 顯示詳細資訊的方法
    public void showDetail() {
        System.out.println("This turtle's species is: " + species + " age: " + age);
    }
    
    // main 方法 - 測試用
    public static void main(String[] args) {
        // 建立一個烏龜物件來測試
        Q3_Turtle turtle = new Q3_Turtle("Sea Turtle", 10);
        turtle.showDetail();
    }
}