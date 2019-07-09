package designpatterns.builder.demo;

/**
 * @Author Frank
 * @Description
 * @Date: Create in  2019-07-09 17:51
 */
public class CateBuilderClient {
    public static void main(String[] args) {
        CateBuilder cateBuilder = new TangCuPaiGuBuilder();
        Cate cate = cateBuilder.cooking();
        System.out.println("准备做一份家常版糖醋排骨");
        System.out.println("食材是:" + cate.getFood());
        System.out.println("调料有:" + cate.getSeasoning());
        System.out.println("做法是:" + cate.getPractice());
        System.out.println("时间是:" + cate.getTime());
        System.out.println("水是:" + cate.getWater());
    }
}
