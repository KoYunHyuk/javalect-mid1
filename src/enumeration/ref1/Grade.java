package enumeration.ref1;

public class Grade {
    public static final Grade BASIC = new Grade(10);
    public static final Grade GOLD = new Grade(20);
    public static final Grade DIAMOND = new Grade(30);

    // private 생성자 추가
    private final int discountPercent;

    private Grade(int discountPercent) {
        this.discountPercent = discountPercent;
    }

    public int getDiscountPercent() {
        return discountPercent;
    }
}
