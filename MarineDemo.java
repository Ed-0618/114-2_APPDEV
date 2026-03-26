
class MarineLife {
    String name;
    
    // 构造方法
    public MarineLife(String name) {
        this.name = name;
    }
    
    String move() {
        return name + "在水中移動";
    }
    
    String eat(String food) {
        return name + "正在吃" + food;
    }
    
    String info() {
        return "名字：" + name;
    }
}

public class MarineDemo {
    public static void main(String[] args) {
        MarineLife nemo = new MarineLife("尼莫");
        MarineLife whale = new MarineLife("蓝蓝");
        
        System.out.println(nemo.info());
        System.out.println(nemo.move());
        System.out.println(nemo.eat("海葵"));
    }
}