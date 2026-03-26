class MarineLife2 {
    String name;
    String habitat;

    public MarineLife2(String name, String habitat) {
        this.name = name;
        this.habitat = habitat;
    }

    String move() {
        return name + " 在水中移動";
    }

    String eat() {
        return name + " 正在覓食";
    }

    String info() {
        return name + "（" + habitat + "）";
    }
}

class Shark extends MarineLife2 {
    Shark(String name,String habitat) {
        super(name,habitat); 
    }

    @Override
    String move() {
        return name + " 高速衝刺獵食";
    }

    String eat() {
        return name + " 撕咬獵物";
    }

    String info() {
        return name + "（" + habitat + "）";
    }
}

class Turtle extends MarineLife2 {
    Turtle(String name,String habitat) { 
        super(name,habitat); 
    }

    @Override
        String move() {
        return name + " 緩慢划動四肢";
    }

    String eat() {
        return name + " 啃食海草";
    }

    String info() {
        return name + "（" + habitat + "）";
    }
}

class Dolphin extends MarineLife2 {
    Dolphin(String name,String habitat) { 
        super(name,habitat); 
    }

    @Override
    String move() {
        return name + " 躍出水面再潛入";
    }

    String eat() {
        return name + " 合作圍捕魚群";
    }

    String info() {
        return name + "（" + habitat + "）";
    }
}
// TODO 1: Shark 繼承 MarineLife
// - 覆寫 move() → "[name] 高速衝刺獵食"
// - 覆寫 eat() → "[name] 撕咬獵物"


// TODO 2: Turtle 繼承 MarineLife
// - 覆寫 move() → "[name] 緩慢划動四肢"
// - 覆寫 eat() → "[name] 啃食海草"


// TODO 3: Dolphin 繼承 MarineLife
// - 覆寫 move() → "[name] 躍出水面再潛入"
// - 覆寫 eat() → "[name] 合作圍捕魚群"


public class OceanSimulator {
    public static void main(String[] args) {
        System.out.println("=== 海洋模擬器 ===\n");

        // TODO 4: 建立 MarineLife 陣列，放入三個物件
        MarineLife2[] ocean = {
            new Shark("大白鯊", "深海"),
            new Turtle("綠蠵龜", "珊瑚礁"),
            new Dolphin("瓶鼻海豚", "近海")
        };

        for (MarineLife2 creature : ocean) {
            System.out.println(creature.info());
            System.out.println("  移動：" + creature.move());
            System.out.println("  覓食：" + creature.eat());
            System.out.println();
        }
    }
}