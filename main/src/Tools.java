import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Tools {
    //必要对象

    //打印主菜单
    public static void printMainMenu(){
        System.out.println("===主菜单===");
        System.out.print("""
                1.添加商品
                2.删除商品
                3.查询商品
                4.修改商品信息
                5.计算商品价值总和
                6.退出系统
                """);
        System.out.print("请选择：");
    }

    //添加商品
    public static void addGood(ArrayList<Goods> goods){
        Scanner sc = new Scanner(System.in);
        Goods good = new Goods();

        System.out.println("请输入商品名");
        good.setGoodsName(sc.next());
        System.out.println("请输入商品价格");
        good.setPrice(sc.nextDouble());
        System.out.println("请输入数量");
        good.setQuantity(sc.nextInt());
        System.out.println("请输入入库年份");
        good.setYear(sc.nextInt());
        System.out.println("请输入入库月份");
        good.setMonth(sc.nextInt());
        System.out.println("请输入入库日期");
        good.setDay(sc.nextInt());

        //生成商品编号
        good.setNumber(generateNumber(goods));

        //将商品信息赋值给集合
        goods.add(good);

        //输出日志
        System.out.println("商品" + "\"" + good.getGoodsName() + "\"" + "添加成功\t" + "商品编号：" + good.getNumber());


    }

    //删除商品
    public static void deleteGood(ArrayList<Goods> goods){
        Scanner sc = new Scanner(System.in);
        String input;
        int choice;

        //判断当前系统是否存在商品信息
        if(goods.isEmpty()){
            //输出
            System.out.println("当前系统中没有任何商品信息");
            return;
        }
        //系统中存在商品信息时
        System.out.println("请输入商品编号");
        input = sc.next();
        for (int i = 0; i < goods.size(); i++) {
            if(goods.get(i).getNumber().equals(input)){
                //找到对应商品信息
                System.out.println("商品名：" + goods.get(i).getGoodsName() + "数量：" + goods.get(i).getPrice());
                System.out.println("是否执行删除：1/是");
                choice = sc.nextInt();
                if(choice == 1){
                    //执行删除
                    goods.remove(i);
                    System.out.println("商品已被删除");
                }
                return;
            }
            System.out.println("系统没有索引到所给值");
        }
    }

    //查询商品
    public static void showGoodsInfo(ArrayList<Goods> goods){
        Scanner sc = new Scanner(System.in);
        String input;
        int choice;

        //判断当前系统中是否存在商品信息
        if(goods.isEmpty()){
            //输出日志
            System.out.println("当前系统中没有任何商品信息");
            return;
        }

        //当系统中存在商品信息时
        //提示输入
        System.out.println("请输入商品编号");
        input = sc.next();
        for (int i = 0; i < goods.size(); i++) {
            if(goods.get(i).getNumber().equals(input)){
                //索引到对应商品信息
                System.out.println("商品名：" + goods.get(i).getGoodsName());
                System.out.println("商品单价：" + goods.get(i).getPrice());
                System.out.println("商品数量" + goods.get(i).getQuantity());
                System.out.println("商品编号：" + goods.get(i).getNumber());
                System.out.println("商品入库日期：" + goods.get(i).getYear() + "年" + goods.get(i).getMonth() + "月" + goods.get(i).getDay() + "日");

                return;
            }
        }
        //没有索引到对应商品信息
        System.out.println("系统没有索引到所给值");
    }

    //修改商品信息
    public static void editGoodsInfo(ArrayList<Goods> goods){
        //判断当前系统中是否存在商品信息
    }

    //生成商品编号
    private static String generateNumber(ArrayList<Goods> goods){
        Random r = new Random();
        String number = "G";

        //判断当前系统是否存在货物信息
        if(goods.isEmpty()){
            //不存在
            for (int i = 0; i < 8; i++) {
                number += r.nextInt(10);
            }
            return number;
        }
        //当前系统中存在商品信息时
        for (int i = 0; i < 8; i++) {
            number += r.nextInt(10);
        }

        for (int i = 0; i < goods.size(); i++) {
            if(goods.get(i).getNumber().equals(number)){
                number = "G";
                for (int j = 0; j < 8; j++) {
                    number += r.nextInt(10);
                }
            }
        }
        return number;
    }

    //打印修改商品信息菜单
    private static void printEditGoodsInfo(){
        System.out.println("");

    }
}
