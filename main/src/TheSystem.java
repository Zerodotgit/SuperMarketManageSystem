import java.util.ArrayList;
import java.util.Scanner;

public class TheSystem {

    //必要变量

    //必要对象
    Scanner sc = new Scanner(System.in);
    ArrayList<Goods> goods = new ArrayList<>();

    public TheSystem() {
    }

    //进入系统
    public void start(){
        int choice;

        while (true) {
            Tools.printMainMenu();
            choice = sc.nextInt();
            switch (choice){
                case 1:
                    //添加商品
                    Tools.addGood(goods);
                    break;
                case 2:
                    //删除商品
                    Tools.deleteGood(goods);
                    break;
                case 3:
                    //查询商品
                    Tools.showGoodsInfo(goods);
                    break;
                case 4:
                    //修改商品信息
                    Tools.editGoodsInfo(goods);
                    break;
                case 5:
                    //计算商品价值总和
                    Tools.calculateTotalPrice(goods);
                    break;
                case 6:
                    //退出系统
                    return;
                default:
                    System.out.println("输入有误");

            }
        }
    }
}
