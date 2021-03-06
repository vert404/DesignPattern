package FactoryMethod.Sample.idcard;

import FactoryMethod.Sample.framework.Product;

/**
 * @author vert on 2021/3/25
 */
public class IDCard extends Product {
    private String owner;
    public IDCard(String owner){
        System.out.println("制作" + owner + "的ID卡。");
        this.owner = owner;
    }

    @Override
    public void use() {
        System.out.println("使用" + owner+ "的ID卡。");
    }

    public String getOwner() {
        return owner;
    }
}
