public class FinalDemo {

    // TODO 1: 宣告 final 變數
    static final int MAX_DEPTH = 11034;  // 馬里亞納海溝最深處

    // TODO 2: Ship 類別
    static class Ship {
        String name;

        // 建構子
        public Ship(String name) {
            this.name = name;
        }

        // final 方法
        public final String type() {
            return "船舶";
        }

        // 一般方法
        public String sail() {
            return name + " 正在航行";
        }
    }

    // TODO 3: FishingBoat 繼承 Ship
    static class FishingBoat extends Ship {

        public FishingBoat(String name) {
            super(name);
        }

        // 覆寫 sail()
        @Override
        public String sail() {
            return name + " 正在拖網捕魚";
        }

        // ❌ 不能覆寫 final 方法
        // @Override
        // public String type() {
        //     return "漁船";
        // }
    }

    public static void main(String[] args) {
        System.out.println("馬里亞納海溝最深：" + MAX_DEPTH + " 公尺");

        // MAX_DEPTH = 12000;  // ❌ 會編譯錯誤（final 不能改）

        Ship s = new Ship("遠洋號");
        FishingBoat f = new FishingBoat("海豐號");

        System.out.println(s.type() + "：" + s.sail());
        System.out.println(f.type() + "：" + f.sail());

        // 多型
        Ship s2 = new FishingBoat("福星號");
        System.out.println(s2.type() + "：" + s2.sail());
    }
}