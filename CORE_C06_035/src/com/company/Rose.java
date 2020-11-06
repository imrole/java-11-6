package com.company;

public class Rose {
    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    private int num;
    public Rose(int num){
        this.num=num;
    }

    public void giveRose(int num) throws RoseException{
        if(num<0){
            System.out.println("方法接受到非法参数，请给出正数形式的玫瑰花数。");
        }
        else {
            this.num -= num;
            if(this.num<0){
                throw new RoseException("我没有钱买花送给你，对不起！");
            }else {
                System.out.println("亲爱的，送你" + num + "朵玫瑰花！");
            }
        }
    }
}
