package week05;
public class MarineEcosystem {

    // 父類別
    static class Creature {
        String name;
        String habitat;

        // 建構子
        public Creature(String name, String habitat) {
            this.name = name;
            this.habitat = habitat;
        }

        // 一般方法
        public String move() {
            return name + " 正在移動";
        }

        public String eat() {
            return name + " 正在覓食";
        }

        public String describe() {
            return name + "（" + habitat + "）";
        }

        // final 方法（不能被覆寫）
        public final String kingdom() {
            return "動物界";
        }

        // ===== 方法多載 feed() =====
        public String feed() {
            return name + " 正在覓食";
        }

        public String feed(String food) {
            return name + " 正在吃 " + food;
        }

        public String feed(String food, int amount) {
            return name + " 吃了 " + amount + " 份 " + food;
        }
    }

    // ===== 子類別 1：Shark =====
    static class Shark extends Creature {

        public Shark(String name, String habitat) {
            super(name, habitat);
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

    // ===== 子類別 2：Turtle =====
    static class Turtle extends Creature {

        public Turtle(String name, String habitat) {
            super(name, habitat);
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

    // ===== 子類別 3：Dolphin =====
    static class Dolphin extends Creature {

        public Dolphin(String name, String habitat) {
            super(name, habitat);
        }

        @Override
        public String move() {
            return name + " 躍出水面";
        }

        @Override
        public String eat() {
            return name + " 合作圍捕魚群";
        }
    }

    // ===== 子類別 4：Octopus =====
    static class Octopus extends Creature {

        public Octopus(String name, String habitat) {
            super(name, habitat);
        }

        @Override
        public String move() {
            return name + " 噴射水流推進";
        }

        @Override
        public String eat() {
            return name + " 用觸手捕捉獵物";
        }
    }

    public static void main(String[] args) {

        // final 變數
        final int OCEAN_DEPTH = 11034;
        System.out.println("海洋最深處：" + OCEAN_DEPTH + " 公尺\n");

        // 多型陣列
        Creature[] ecosystem = {
            new Shark("大白鯊", "深海"),
            new Turtle("綠蠵龜", "珊瑚礁"),
            new Dolphin("海豚", "開放海域"),
            new Octopus("章魚", "海底")
        };

        // for-each 展示多型
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