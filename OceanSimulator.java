// ========== Creature 抽象類別 ==========
abstract class Creature {
    protected String name;
    protected String habitat;
    
    public Creature(String name, String habitat) {
        this.name = name;
        this.habitat = habitat;
    }
    
    // 抽象方法，子類別必須實作
    public abstract String kingdom();
    public abstract String move();
    public abstract String eat();
    
    // 方法重載 - 無參數版本
    public String feed() {
        return name + " 正在覓食";
    }
    
    // 方法重載 - 一個參數版本
    public String feed(String food) {
        return name + " 正在吃 " + food;
    }
    
    // 方法重載 - 兩個參數版本
    public String feed(String food, int amount) {
        return name + " 吃了 " + amount + " 份 " + food;
    }
    
    // 描述方法
    public String describe() {
        return name + "（" + habitat + "）";
    }
}

// ========== Shark 類別 ==========
class Shark extends Creature {
    public Shark(String name, String habitat) {
        super(name, habitat);
    }
    
    @Override
    public String kingdom() {
        return "動物界";
    }
    
    @Override
    public String move() {
        return name + " 高速衝刺獵食";
    }
    
    @Override
    public String eat() {
        return name + " 撕咬獵物";
    }
}

// ========== Turtle 類別 ==========
class Turtle extends Creature {
    public Turtle(String name, String habitat) {
        super(name, habitat);
    }
    
    @Override
    public String kingdom() {
        return "動物界";
    }
    
    @Override
    public String move() {
        return name + " 緩慢划動四肢";
    }
    
    @Override
    public String eat() {
        return name + " 啃食海草";
    }
}

// ========== Dolphin 類別 ==========
class Dolphin extends Creature {
    public Dolphin(String name, String habitat) {
        super(name, habitat);
    }
    
    @Override
    public String kingdom() {
        return "動物界";
    }
    
    @Override
    public String move() {
        return name + " 躍出水面再潛入";
    }
    
    @Override
    public String eat() {
        return name + " 合作圍捕魚群";
    }
}

// ========== 額外：新增一種生物 Jellyfish ==========
class Jellyfish extends Creature {
    public Jellyfish(String name, String habitat) {
        super(name, habitat);
    }
    
    @Override
    public String kingdom() {
        return "動物界";
    }
    
    @Override
    public String move() {
        return name + " 隨洋流漂浮";
    }
    
    @Override
    public String eat() {
        return name + " 過濾浮游生物";
    }
}

// ========== 主程式 ==========
public class OceanSimulator {
    public static void main(String[] args) {
        final int OCEAN_DEPTH = 11034;
        System.out.println("海洋最深處：" + OCEAN_DEPTH + " 公尺\n");
        
        Creature[] ecosystem = {
            new Shark("大白鯊", "深海"),
            new Turtle("綠蠵龜", "珊瑚礁"),
            new Dolphin("瓶鼻海豚", "近海"),
            new Jellyfish("水母", "淺海")
        };
        
        for (Creature c : ecosystem) {
            System.out.println(c.describe());
            System.out.println("  分類：" + c.kingdom());
            System.out.println("  移動：" + c.move());
            System.out.println("  覓食：" + c.eat());
            System.out.println("  餵食：" + c.feed());
            System.out.println("  餵食：" + c.feed("小魚"));
            System.out.println("  餵食：" + c.feed("小魚", 3));
            System.out.println();
        }
    }
}